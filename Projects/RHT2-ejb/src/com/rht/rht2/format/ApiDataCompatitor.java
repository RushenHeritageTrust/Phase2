/*
 *
 */
package com.rht.rht2.format;

import java.io.Serializable;
import java.util.Comparator;

import com.rht.rht2.model.PersistentItemTO;

// TODO: Auto-generated Javadoc
/**
 * The Class ApiDataCompatitor.
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
public class ApiDataCompatitor implements Comparator<PersistentItemTO>,
Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	/**
	 * Method compare.
	 * 
	 * @param to1
	 *            PersistentItemTO
	 * @param to2
	 *            PersistentItemTO
	
	 * @return int */
	@Override
	public int compare(PersistentItemTO to1, PersistentItemTO to2) {

		final int i1 = to1.getId();
		final int i2 = to2.getId();

		return i1 > i2 ? 1 : i1 == i2 ? 0 : -1;
	}

}
