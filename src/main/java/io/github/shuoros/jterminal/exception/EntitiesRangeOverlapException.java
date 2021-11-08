package io.github.shuoros.jterminal.exception;

/**
 * Exception class for entities overlap.
 * 
 * @author Soroush Shemshadi
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class EntitiesRangeOverlapException extends RuntimeException {

	private static final long serialVersionUID = -4646192021177285205L;

	public EntitiesRangeOverlapException() {
		super("Entities ranges must not have overlap");
	}

	public EntitiesRangeOverlapException(String error) {
		super("Entities ranges must not have overlap, " + error);
	}

}
