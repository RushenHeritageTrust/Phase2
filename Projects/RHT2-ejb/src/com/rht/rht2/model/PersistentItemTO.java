/*
 *
 */
package com.rht.rht2.model;

// TODO: Auto-generated Javadoc
/**
 * TODO: make abstract.
 *
 * @author Administrator
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("serial")
public class PersistentItemTO implements PersistentItem {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3042747476977620820L;

	/** The created by. */
	protected String createdBy;

	/** The created by id. */
	protected int createdByID;

	/** The description. */
	protected String description;

	/** The id. */
	protected int id;

	/**
	 * Instantiates a new persistent item to.
	 */
	public PersistentItemTO() {
	}

	/**
	 * Instantiates a new persistent item to.
	 *
	 * @param id
	 *            the id
	 */
	public PersistentItemTO(int id) {
		this.id = id;
	}

	/**
	 * Instantiates a new persistent item to.
	 *
	 * @param id
	 *            the id
	 * @param description
	 *            the description
	 */
	public PersistentItemTO(int id, String description) {
		this.id = id;
		this.description = description;
	}

	/**
	 * Instantiates a new persistent item to.
	 *
	 * @param description
	 *            the description
	 */
	public PersistentItemTO(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PersistentItemTO)) {
			return false;
		}
		final PersistentItemTO pi = (PersistentItemTO) obj;
		return pi.id == id;
	}

	/**
	 * Gets the created by.
	 *
	 *
	
	 * @return the created by */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Gets the created by id.
	 *
	 *
	
	 * @return the created by id */
	public int getCreatedByID() {
		return createdByID;
	}

	/**
	 * Method getDescription.
	 * @return String
	 * @see com.rht.rht2.model.PersistentItem#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * Method getId.
	 * @return int
	 * @see com.rht.rht2.model.PersistentItem#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Method setDescription.
	 * @param description String
	 * @see com.rht.rht2.model.PersistentItem#setDescription(String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Method setId.
	 * @param id int
	 * @see com.rht.rht2.model.PersistentItem#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}

}
