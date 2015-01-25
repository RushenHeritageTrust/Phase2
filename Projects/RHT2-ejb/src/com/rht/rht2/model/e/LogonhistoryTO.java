package com.rht.rht2.model.e;

import javax.annotation.Generated;

/**
 * LogonhistoryTO is a Querydsl bean type
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.BeanSerializer")
public class LogonhistoryTO {

	private Integer loginHistoryId;

	private Integer loginHistoryUserId;

	private String logonHistoryDate;

	/**
	 * Method getLoginHistoryId.
	 * 
	
	 * @return Integer */
	public Integer getLoginHistoryId() {
		return loginHistoryId;
	}

	/**
	 * Method getLoginHistoryUserId.
	 * 
	
	 * @return Integer */
	public Integer getLoginHistoryUserId() {
		return loginHistoryUserId;
	}

	/**
	 * Method getLogonHistoryDate.
	 * 
	
	 * @return String */
	public String getLogonHistoryDate() {
		return logonHistoryDate;
	}

	/**
	 * Method setLoginHistoryId.
	 * 
	 * @param loginHistoryId
	 *            Integer
	 */
	public void setLoginHistoryId(Integer loginHistoryId) {
		this.loginHistoryId = loginHistoryId;
	}

	/**
	 * Method setLoginHistoryUserId.
	 * 
	 * @param loginHistoryUserId
	 *            Integer
	 */
	public void setLoginHistoryUserId(Integer loginHistoryUserId) {
		this.loginHistoryUserId = loginHistoryUserId;
	}

	/**
	 * Method setLogonHistoryDate.
	 * 
	 * @param logonHistoryDate
	 *            String
	 */
	public void setLogonHistoryDate(String logonHistoryDate) {
		this.logonHistoryDate = logonHistoryDate;
	}

}
