package com.rht.rht2.model.e;

import javax.annotation.Generated;

/**
 * AccountstatusTO is a Querydsl bean type
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.BeanSerializer")
public class AccountstatusTO {

	private Integer accountStatusId;

	private String status;

	/**
	 * Method getAccountStatusId.
	 * 
	
	 * @return Integer */
	public Integer getAccountStatusId() {
		return accountStatusId;
	}

	/**
	 * Method getStatus.
	 * 
	
	 * @return String */
	public String getStatus() {
		return status;
	}

	/**
	 * Method setAccountStatusId.
	 * 
	 * @param accountStatusId
	 *            Integer
	 */
	public void setAccountStatusId(Integer accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	/**
	 * Method setStatus.
	 * 
	 * @param status
	 *            String
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
