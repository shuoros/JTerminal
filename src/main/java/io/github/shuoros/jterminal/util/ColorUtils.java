package io.github.shuoros.jterminal.util;

import io.github.shuoros.jterminal.ansi.Color;
import io.github.shuoros.jterminal.exception.IncorrectXTermException;

/**
 * 
 * @author Soroush Shemshadi
 * @version 0.2.0
 * @since 0.2.0
 *
 */
public class ColorUtils {

	/**
	 * a private constructor to hide the implicit public one
	 */
	private ColorUtils() {
		throw new IllegalStateException("Utility class");
	}

	public static Color xTerm(int code) {
		if (code > 255 || code < 0) {
			throw new IncorrectXTermException("Your code : " + code);
		}
		return Color.WHITE.xTerm(String.valueOf(code));
	}

}
