package io.github.shuoros.jterminal.util;

import java.util.Map;

import io.github.shuoros.jterminal.ansi.Attribute;
import io.github.shuoros.jterminal.ansi.Color;

/**
 * This class contains utilities and functionalities to generate
 * <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">ANSI escape
 * sequences</a> by the given {@link io.github.shuoros.jterminal.ansi.Color}s
 * and {@link io.github.shuoros.jterminal.ansi.Attribute}s from user.
 * 
 * @author Soroush Shemshadi
 * @version 0.1.0
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
	public static String generateCode(Map<String, Color> options) {
		StringBuilder builder = new StringBuilder();

		builder.append(PREFIX);
		for (String option : options.keySet()) {
			String code = "";
			if ("foreground".equals(option)) {
				code = Attribute.FOREGROUND + options.get(option).toString();
			} else if ("background".equals(option)) {
				code = Attribute.BACKGROUND + options.get(option).toString();
			}
			if ("".equals(code)) {
				continue;
			}
			builder.append(code);
			builder.append(SEPARATOR);
		}
		builder.append(POSTFIX);

		// because code must not end with SEPARATOR
		return builder.toString().replace(SEPARATOR + POSTFIX, POSTFIX);
	}

}
