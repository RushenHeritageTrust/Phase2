/*
 *
 */
package com.rht.rht2.model;

// TODO: Auto-generated Javadoc
/**
 * The Class FilterTO.
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("serial")
public class FilterTO extends PersistentItemTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8071981514405059032L;

	/** The offset. */
	protected int offset;

	/** The page. */
	protected int page;

	/** The page size. */
	protected int pageSize;

	/** The permission values. */
	protected String permissionValues;

	/** The search criteria. */
	protected String searchCriteria;

	/** The search field values. */
	protected String searchFieldValues;

	/** The site id. */
	protected int siteID;

	/** The sort ascending. */
	protected boolean sortAscending;

	/** The sorted column. */
	protected String sortedColumn;

	/** The system only. */
	protected boolean systemOnly;

	/** The username. */
	protected String username;

	/**
	 * Instantiates a new filter to.
	 */
	public FilterTO() {
	}

	/**
	 * Gets the offset.
	 *
	 * 
	
	 * @return the offset */
	public int getOffset() {
		return offset;
	}

	/**
	 * Gets the page.
	 *
	 * 
	
	 * @return the page */
	public int getPage() {
		return page;
	}

	/**
	 * Gets the page size.
	 *
	 * 
	
	 * @return the page size */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * Gets the permission values.
	 *
	 * 
	
	 * @return the permission values */
	public String getPermissionValues() {
		return permissionValues;
	}

	/**
	 * Gets the search criteria.
	 *
	 * 
	
	 * @return the search criteria */
	public String getSearchCriteria() {
		return searchCriteria;
	}

	/**
	 * Gets the search field values.
	 *
	 * 
	
	 * @return the search field values */
	public String getSearchFieldValues() {
		return searchFieldValues;
	}

	/**
	 * Gets the site id.
	 *
	 * 
	
	 * @return the site id */
	public int getSiteID() {
		return siteID;
	}

	/**
	 * Gets the sorted column.
	 *
	 * 
	
	 * @return the sorted column */
	public String getSortedColumn() {
		return sortedColumn;
	}

	/**
	 * Gets the username.
	 *
	 * 
	
	 * @return the username */
	public String getUsername() {
		return username;
	}

	/**
	 * Checks if is sort ascending.
	 *
	 * 
	
	 * @return true, if is sort ascending */
	public boolean isSortAscending() {
		return sortAscending;
	}

	/**
	 * Checks if is system only.
	 *
	 * 
	
	 * @return true, if is system only */
	public boolean isSystemOnly() {
		return systemOnly;
	}

	/**
	 * Sets the offset.
	 *
	 * @param offset
	 *            the new offset
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Sets the page.
	 *
	 * @param page
	 *            the new page
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * Sets the page size.
	 *
	 * @param pageSize
	 *            the new page size
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * Sets the permission values.
	 *
	 * @param permissionValues
	 *            the new permission values
	 */
	public void setPermissionValues(String permissionValues) {
		this.permissionValues = permissionValues;
	}

	/**
	 * Sets the search criteria.
	 *
	 * @param searchCriteria
	 *            the new search criteria
	 */
	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	/**
	 * Sets the search field values.
	 *
	 * @param searchFieldValues
	 *            the new search field values
	 */
	public void setSearchFieldValues(String searchFieldValues) {
		this.searchFieldValues = searchFieldValues;
	}

	/**
	 * Sets the site id.
	 *
	 * @param siteID
	 *            the new site id
	 */
	public void setSiteID(int siteID) {
		this.siteID = siteID;
	}

	/**
	 * Sets the sort ascending.
	 *
	 * @param sortAscending
	 *            the new sort ascending
	 */
	public void setSortAscending(boolean sortAscending) {
		this.sortAscending = sortAscending;
	}

	/**
	 * Sets the sorted column.
	 *
	 * @param sortedColumn
	 *            the new sorted column
	 */
	public void setSortedColumn(String sortedColumn) {
		this.sortedColumn = sortedColumn;
	}

	/**
	 * Sets the system only.
	 *
	 * @param systemOnly
	 *            the new system only
	 */
	public void setSystemOnly(boolean systemOnly) {
		this.systemOnly = systemOnly;
	}

	/**
	 * Sets the username.
	 *
	 * @param username
	 *            the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}
