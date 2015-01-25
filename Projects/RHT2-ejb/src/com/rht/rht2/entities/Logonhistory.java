package com.rht.rht2.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "logonhistory")
public class Logonhistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer loginHistoryId;
	private String logonHistoryDate;
	private Users users;

	public Logonhistory() {
	}

	/**
	 * Constructor for Logonhistory.
	 * 
	 * @param users
	 *            Users
	 * @param logonHistoryDate
	 *            String
	 */
	public Logonhistory(Users users, String logonHistoryDate) {
		this.users = users;
		this.logonHistoryDate = logonHistoryDate;
	}

	/**
	 * Method getLoginHistoryId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loginHistory_id", unique = true, nullable = false)
	public Integer getLoginHistoryId() {
		return loginHistoryId;
	}

	/**
	 * Method getLogonHistoryDate.
	 * 
	
	 * @return String */
	@Column(name = "logonHistory_date", nullable = false, length = 45)
	public String getLogonHistoryDate() {
		return logonHistoryDate;
	}

	/**
	 * Method getUsers.
	 * 
	
	 * @return Users */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loginHistory_user_id", nullable = false)
	public Users getUsers() {
		return users;
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
	 * Method setLogonHistoryDate.
	 * 
	 * @param logonHistoryDate
	 *            String
	 */
	public void setLogonHistoryDate(String logonHistoryDate) {
		this.logonHistoryDate = logonHistoryDate;
	}

	/**
	 * Method setUsers.
	 * 
	 * @param users
	 *            Users
	 */
	public void setUsers(Users users) {
		this.users = users;
	}
}