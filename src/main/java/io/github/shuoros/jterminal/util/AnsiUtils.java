package io.github.shuoros.jterminal.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.github.shuoros.jterminal.ansi.Attribute;
import io.github.shuoros.jterminal.ansi.Color;
import io.github.shuoros.jterminal.exception.EntitiesRangeOverlapException;

/**
 * This class contains utilities and functionalities to generate
 * <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI escape
 * sequences</a> by the given {@link io.github.shuoros.jterminal.ansi.Color}s
 * and {@link io.github.shuoros.jterminal.ansi.Attribute}s from user.
 * 
 * @author Soroush Shemshadi
 * @version 1.0.1
 * @since 0.1.0
 *
 */
public class AnsiUtils {

	/**
	 * Escape character used to start an ANSI code.
	 */
	private static final String ESCAPE = "\u001B";
	/**
	 * Every ANSI escape code begins with this PREFIX.
	 */
	private static final String PREFIX = ESCAPE + "[";
	/**
	 * Two options must be separated by this SEPARATOR.
	 */
	private static final String SEPARATOR = ";";
	/**
	 * Every ANSI escape code must end with this POSTFIX.
	 */
	private static final String POSTFIX = "m";
	/**
	 * Shorthand for the ANSI code that resets to the terminal's default format.
	 */
	public static final String RESET = PREFIX + Attribute.CLEAR + POSTFIX;

	/**
	 * Generates ANSI escape sequences from given text and list of entities.
	 * 
	 * @param text          : Your given text.
	 * @param textEnitities : A {@link java.util.List} of
	 *                      {@link io.github.shuoros.jterminal.util.TextEntity}s
	 *                      which contains text attributes and the range of effect.
	 * @return Generated ANSI escape sequences based on your options.
	 */
	public static String generateCode(String text, List<TextEntity> textEnitities) {

		textEnitities = createNewInstance(textEnitities);

		sortTextEntitiesWithRange(textEnitities);

		detectOverlap(textEnitities);

		textEnitities = fixEntityCoverage(text, textEnitities);

		StringBuilder builder = new StringBuilder();
		for (TextEntity entity : textEnitities) {

			builder.append(PREFIX);

			if (!entity.getForeground().equals(Color.DEFAULT)) {
				builder.append(Attribute.FOREGROUND + entity.getForeground().toString());
				builder.append(SEPARATOR);
			}
			if (!entity.getBackground().equals(Color.DEFAULT)) {
				builder.append(Attribute.BACKGROUND + entity.getBackground().toString());
				builder.append(SEPARATOR);
			}

			builder.append(POSTFIX);

			if (entity.getBegin() == Integer.MIN_VALUE && entity.getEnd() == Integer.MAX_VALUE) {
				builder.append(text);
			} else {
				builder.append(text.substring(entity.getBegin(), entity.getEnd()));
			}

			builder.append(RESET);
		}

		// because code must not end with SEPARATOR
		return builder.toString().replaceAll(SEPARATOR + POSTFIX, POSTFIX);
	}

	/**
	 * Creates new instance of given list of entities because of List.of() mtheod
	 * returns an unmodifiable List and for next steps list cannot be sort.
	 * 
	 * @param entities : Given list of entities.
	 * @return New instace of given entities.
	 */
	private static List<TextEntity> createNewInstance(List<TextEntity> entities) {
		List<TextEntity> newList = new ArrayList<>();
		newList.addAll(entities);
		return newList;
	}

	/**
	 * Sort the entities by theire begin range.
	 * 
	 * @param entities : Sorted list of entitites by range in high descend.
	 */
	private static void sortTextEntitiesWithRange(List<TextEntity> entities) {
		Collections.sort(entities, new Comparator<TextEntity>() {

			@Override
			public int compare(TextEntity arg0, TextEntity arg1) {
				if (arg0.getBegin() > arg1.getBegin()) {
					return 1;
				} else if (arg0.getBegin() < arg1.getBegin()) {
					return -1;
				} else {
					return 0;
				}
			}

		});
	}

	/**
	 * It detects overlap in entities begin and end range. If it found an overlap
	 * will throws an
	 * {@link io.github.shuoros.jterminal.exception.EntitiesRangeOverlapException}
	 * 
	 * @param textEnitities : List of all entities.
	 * @param textEntity    : An entity that wanted to check for having overlap with
	 *                      others.
	 */
	private static void detectOverlap(List<TextEntity> enitities) {
		for (TextEntity entity : enitities) {
			for (TextEntity innerEntity : enitities)
				if ((!entity.equals(innerEntity)) && entity.getBegin() < innerEntity.getEnd()
						&& entity.getEnd() > innerEntity.getBegin()) {
					throw new EntitiesRangeOverlapException("[" + innerEntity.getBegin() + ", " + innerEntity.getEnd()
							+ "] whit [" + entity.getBegin() + ", " + entity.getEnd() + "]");
				}
		}
	}

	/**
	 * Fix the entity coverage on text. If given text had length of 10 and two
	 * entities assigned to it with ranges [2, 5] and [7, 10], This methos covers
	 * the gap between ranges with default foreground and background colors and
	 * returns a List of entities like [0, 2], [2, 5], [5, 7], [7, 10].
	 * 
	 * @param text      : Given text.
	 * @param enitities : List of entities with gaps in range.
	 * @return A List that covers all of the given text and fill the given entity
	 *         list's gaps.
	 */
	private static List<TextEntity> fixEntityCoverage(String text, List<TextEntity> enitities) {
		if (!(enitities.size() == 1 && enitities.get(0).getBegin() == Integer.MIN_VALUE
				&& enitities.get(0).getEnd() == Integer.MAX_VALUE)) {
			List<TextEntity> newList = new ArrayList<>();
			int e = 0;
			for (int i = 0; i < text.length(); i++) {
				if (i == enitities.get(e).getBegin()) {
					newList.add(enitities.get(e));
					i = enitities.get(e).getEnd() - 1;
					e++;
					if (e == enitities.size()) {
						if (i + 1 != text.length()) {
							newList.add(new TextEntity(enitities.get(e - 1).getEnd(), text.length()));
						}
						break;
					}
				} else {
					newList.add(new TextEntity(i, enitities.get(e).getBegin()));
					i = enitities.get(e).getBegin() - 1;
				}
			}
			return newList;
		}
		return enitities;
	}

}
