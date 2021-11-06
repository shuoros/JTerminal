package io.github.shuoros.jterminal.exception;

/**
 * 
 * @author Soroush Shemshadi
 * @version 0.2.0
 * @since 0.2.0
 *
 */
public class IncorrectRgbException extends RuntimeException {

	private static final long serialVersionUID = 8993567659307710905L;

	public IncorrectRgbException() {
		super("RGB attributes must be in range of 0 to 255");
	}

	public IncorrectRgbException(String error) {
		super("RGB attributes must be in range of 0 to 255, " + error);
	}

}
