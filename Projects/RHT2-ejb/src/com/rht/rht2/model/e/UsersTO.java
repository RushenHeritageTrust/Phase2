package com.rht.rht2.model.e;

import javax.annotation.Generated;

/**
 * UsersTO is a Querydsl bean type
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.BeanSerializer")
public class UsersTO {

	private Integer userAccountStatusId;

	private Integer userCreatedById;

	private java.sql.Timestamp userCreatedOn;

	private Integer userId;

	private java.sql.Timestamp userLastLogOn;

	private Integer userModById;

	private java.sql.Timestamp userModOn;

	private String userPassword;

	private String userUsername;

	/**
	 * Method getUserAccountStatusId.
	 * 
	
	 * @return Integer */
	public Integer getUserAccountStatusId() {
		return userAccountStatusId;
	}

	/**
	 * Method getUserCreatedById.
	 * 
	
	 * @return Integer */
	public Integer getUserCreatedById() {
		return userCreatedById;
	}

	/**
	 * Method getUserCreatedOn.
	 * 
	
	 * @return java.sql.Timestamp */
	public java.sql.Timestamp getUserCreatedOn() {
		return userCreatedOn;
	}

	/**
	 * Method getUserId.
	 * 
	
	 * @return Integer */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * Method getUserLastLogOn.
	 * 
	
	 * @return java.sql.Timestamp */
	public java.sql.Timestamp getUserLastLogOn() {
		return userLastLogOn;
	}

	/**
	 * Method getUserModById.
	 * 
	
	 * @return Integer */
	public Integer getUserModById() {
		return userModById;
	}

	/**
	 * Method getUserModOn.
	 * 
	
	 * @return java.sql.Timestamp */
	public java.sql.Timestamp getUserModOn() {
		return userModOn;
	}

	/**
	 * Method getUserPassword.
	 * 
	
	 * @return String */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * Method getUserUsername.
	 * 
	
	 * @return String */
	public String getUserUsername() {
		return userUsername;
	}

	/**
	 * Method setUserAccountStatusId.
	 * 
	 * @param userAccountStatusId
	 *            Integer
	 */
	public void setUserAccountStatusId(Integer userAccountStatusId) {
		this.userAccountStatusId = userAccountStatusId;
	}

	/**
	 * Method setUserCreatedById.
	 * 
	 * @param userCreatedById
	 *            Integer
	 */
	public void setUserCreatedById(Integer userCreatedById) {
		this.userCreatedById = userCreatedById;
	}

	/**
	 * Method setUserCreatedOn.
	 * 
	 * @param userCreatedOn
	 *            java.sql.Timestamp
	 */
	public void setUserCreatedOn(java.sql.Timestamp userCreatedOn) {
		this.userCreatedOn = userCreatedOn;
	}

	/**
	 * Method setUserId.
	 * 
	 * @param userId
	 *            Integer
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * Method setUserLastLogOn.
	 * 
	 * @param userLastLogOn
	 *            java.sql.Timestamp
	 */
	public void setUserLastLogOn(java.sql.Timestamp userLastLogOn) {
		this.userLastLogOn = userLastLogOn;
	}

	/**
	 * Method setUserModById.
	 * 
	 * @param userModById
	 *            Integer
	 */
	public void setUserModById(Integer userModById) {
		this.userModById = userModById;
	}

	/**
	 * Method setUserModOn.
	 * 
	 * @param userModOn
	 *            java.sql.Timestamp
	 */
	public void setUserModOn(java.sql.Timestamp userModOn) {
		this.userModOn = userModOn;
	}

	/**
	 * Method setUserPassword.
	 * 
	 * @param userPassword
	 *            String
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * Method setUserUsername.
	 * 
	 * @param userUsername
	 *            String
	 */
	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

}
