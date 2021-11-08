package io.github.shuoros.jterminal.ansi;

/**
 * Enumeration of ANSI escape codes.
 * 
 * @author Soroush Shemshadi
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/ANSI_escape_code#Escape_sequences">Wikipedia,
 *      for a list of all codes available</a>
 * @see <a href=
 *      "https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences/33206814#33206814">StackOverflow,
 *      for a list of codes with examples</a>
 * @version 0.1.0
 * @since 0.1.0
 *
 */
public enum Attribute {

	/**
	 * {@code 0 Reset / Normal}
	 */
	CLEAR("0"),
	/**
	 * {@code 38;5; Set foreground color}
	 */
	FOREGROUND("38;5;"),
	/**
	 * {@code 38;2; Set foreground color in RGB}
	 */
	FOREGROUND_RGB("38;2;"),
	/**
	 * {@code 48;5; Set background color}
	 */
	BACKGROUND("48;5;"),
	/**
	 * {@code 48;2; Set background color in RGB}
	 */
	BACKGROUND_RGB("48;2;");

	private String code;

	Attribute(String code) {
		this.code = code;
	}

	/**
	 * Return a string representation of this escape code.
	 */
	@Override
	public String toString() {
		return code;
	}

}
