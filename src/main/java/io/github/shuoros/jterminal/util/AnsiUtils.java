package io.github.shuoros.jterminal.util;

import java.util.Map;

import io.github.shuoros.jterminal.ansi.Attribute;
import io.github.shuoros.jterminal.ansi.Color;

public class AnsiUtils {

	/**
	 * Escape character used to start an ANSI code.
	 */

	private static final String ESCAPE = "\u001B";
	/**
	 * Every Ansi escape code begins with this PREFIX.
	 */

	private static final String PREFIX = ESCAPE + "[";
	/**
	 * Two options must be separated by this SEPARATOR.
	 */

	private static final String SEPARATOR = ";";
	/**
	 * Every Ansi escape code must end with this POSTFIX.
	 */
	private static final String POSTFIX = "m";

	/**
	 * Shorthand for the Ansi code that resets to the terminal's default format.
	 */
	public static final String RESET = PREFIX + Attribute.CLEAR + POSTFIX;

	/**
	 * @param attributes ANSI attributes to format a text.
	 * @return The ANSI code that describes all those attributes together.
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
