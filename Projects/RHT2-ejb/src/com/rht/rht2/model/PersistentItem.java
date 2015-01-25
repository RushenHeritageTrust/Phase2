/*
 *
 */
package com.rht.rht2.model;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Interface PersistentItem.
 *
 * @author Rob
 * @version $Revision: 1.0 $
 */
public interface PersistentItem extends Serializable {

	/**
	 * Gets the description.
	 *
	 *
	
	 * @return the description */
	public String getDescription();

	/**
	 * Gets the id.
	 *
	 *
	
	 * @return the id */
	public int getId();

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description);

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id);
}
