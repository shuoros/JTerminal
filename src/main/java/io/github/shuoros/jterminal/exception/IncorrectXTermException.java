package io.github.shuoros.jterminal.exception;

/**
 * Exception class for incorrect XTerm code.
 * 
 * @author Soroush Shemshadi
 * @version 0.2.0
 * @since 0.2.0
 *
 */
public class IncorrectXTermException extends RuntimeException {

	private static final long serialVersionUID = 4550673035078428068L;

	public IncorrectXTermException() {
		super("XTerm code must be in range of 0 to 255");
	}

	public IncorrectXTermException(String error) {
		super("XTerm code must be in range of 0 to 255, " + error);
	}

}
