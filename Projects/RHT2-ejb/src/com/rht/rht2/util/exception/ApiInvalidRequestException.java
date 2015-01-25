package com.rht.rht2.util.exception;

/**
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class ApiInvalidRequestException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 4352610684319701049L;

	/**
	 * Constructor for ApiInvalidRequestException.
	 * 
	 * @param string
	 *            String
	 */
	public ApiInvalidRequestException(String string) {
		super(string);
	}

}
