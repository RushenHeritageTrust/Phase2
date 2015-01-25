/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rht.rht2.api.util.email;

/**
 *
 * @author pwray
 * @version $Revision: 1.0 $
 */
public class EmailException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for EmailException.
	 * 
	 * @param message
	 *            String
	 * @param cause
	 *            Throwable
	 */
	public EmailException(String message, Throwable cause) {
		super(message, cause);
	}

}
