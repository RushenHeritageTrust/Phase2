package com.rht.rht2.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "accountstatus", uniqueConstraints = { @javax.persistence.UniqueConstraint(columnNames = { "Status" }) })
public class Accountstatus implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer accountStatusId;
	private String status;
	private Set<Users> userses = new HashSet(0);

	public Accountstatus() {
	}

	/**
	 * Constructor for Accountstatus.
	 * 
	 * @param status
	 *            String
	 */
	public Accountstatus(String status) {
		this.status = status;
	}

	/**
	 * Constructor for Accountstatus.
	 * 
	 * @param status
	 *            String
	 * @param userses
	 *            Set<Users>
	 */
	public Accountstatus(String status, Set<Users> userses) {
		this.status = status;
		this.userses = userses;
	}

	/**
	 * Method getAccountStatusId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accountStatus_id", unique = true, nullable = false)
	public Integer getAccountStatusId() {
		return accountStatusId;
	}

	/**
	 * Method getStatus.
	 * 
	
	 * @return String */
	@Column(name = "Status", unique = true, nullable = false, length = 45)
	public String getStatus() {
		return status;
	}

	/**
	 * Method getUserses.
	 * 
	
	 * @return Set<Users> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accountstatus")
	public Set<Users> getUserses() {
		return userses;
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

	/**
	 * Method setUserses.
	 * 
	 * @param userses
	 *            Set<Users>
	 */
	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}
}