/*
 *
 */
package com.rht.rht2.util;

// TODO: Auto-generated Javadoc
/**
 * A utility class to hold frequently used String functions.
 *
 * @author Daragh Connolly
 *
 * @version $Revision: 1.0 $
 */
public class StringHelper {

	/**
	 * Checks if supplied String is not null and contains at least one
	 * character.
	 *
	 * @param s
	 *            supplied String
	 * 
	
	 * @return true if supplied String is not null and contains at least one
	 *         character, else null. */
	public static boolean isStringPopulated(final String s) {
		return s != null && !s.trim().isEmpty();
	}

}
