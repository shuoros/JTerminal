package io.github.shuoros.jterminal.util;

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
 * @version 1.0.0
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
	 * Generates ANSI escape sequences from options given by you.
	 * 
	 * @param options : A {@link java.util.Map} of
	 *                {@link io.github.shuoros.jterminal.ansi.Color}s and key of
	 *                that color (foreground or background).
	 * @return Generated ANSI escape sequences based on your options.
	 */
	public static String generateCode(String text, List<TextEntity> textEnitities) {
		StringBuilder builder = new StringBuilder();

		for (TextEntity entity : textEnitities) {
			detectOverlap(textEnitities, entity);

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
	 * It detects overlap in entities begin and end range. If it found an overlap
	 * will throws an
	 * {@link io.github.shuoros.jterminal.exception.EntitiesRangeOverlapException}
	 * 
	 * @param textEnitities : List of all entities.
	 * @param textEntity    : An entity that wanted to check for having overlap with
	 *                      others.
	 */
	private static void detectOverlap(List<TextEntity> textEnitities, TextEntity textEntity) {
		for (TextEntity entity : textEnitities) {
			if (entity.equals(textEntity)) {
				continue;
			} else if (entity.getBegin() < textEntity.getEnd() && entity.getEnd() > textEntity.getBegin()) {
				throw new EntitiesRangeOverlapException("[" + textEntity.getBegin() + ", " + textEntity.getEnd()
						+ "] whit [" + entity.getBegin() + ", " + entity.getEnd() + "]");
			}
		}
	}

}
