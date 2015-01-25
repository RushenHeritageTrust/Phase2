package com.rht.rht2.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "users", uniqueConstraints = { @javax.persistence.UniqueConstraint(columnNames = { "user_username" }) })
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;
	private Accountstatus accountstatus;
	private Set<Assets> assetsesForAssetAuditByUserId = new HashSet(0);
	private Set<Assets> assetsesForAssetCreatedByUserId = new HashSet(0);
	private Set<Assets> assetsesForAssetModByUserId = new HashSet(0);
	private Set<Logonhistory> logonhistories = new HashSet(0);
	private Set<Notes> noteses = new HashSet(0);
	private Date userCreatedOn;
	private Integer userId;
	private Date userLastLogOn;
	private int userModById;
	private Date userModOn;
	private String userPassword;
	private Users users;
	private Set<Users> userses = new HashSet(0);
	private String userUsername;

	public Users() {
	}

	/**
	 * Constructor for Users.
	 * 
	 * @param users
	 *            Users
	 * @param accountstatus
	 *            Accountstatus
	 * @param userUsername
	 *            String
	 * @param userPassword
	 *            String
	 * @param userCreatedOn
	 *            Date
	 * @param userModById
	 *            int
	 * @param userModOn
	 *            Date
	 */
	public Users(Users users, Accountstatus accountstatus, String userUsername,
			String userPassword, Date userCreatedOn, int userModById,
			Date userModOn) {
		this.users = users;
		this.accountstatus = accountstatus;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userCreatedOn = userCreatedOn;
		this.userModById = userModById;
		this.userModOn = userModOn;
	}

	/**
	 * Constructor for Users.
	 * 
	 * @param users
	 *            Users
	 * @param accountstatus
	 *            Accountstatus
	 * @param userUsername
	 *            String
	 * @param userPassword
	 *            String
	 * @param userCreatedOn
	 *            Date
	 * @param userModById
	 *            int
	 * @param userModOn
	 *            Date
	 * @param userLastLogOn
	 *            Date
	 * @param noteses
	 *            Set<Notes>
	 * @param assetsesForAssetAuditByUserId
	 *            Set<Assets>
	 * @param assetsesForAssetCreatedByUserId
	 *            Set<Assets>
	 * @param logonhistories
	 *            Set<Logonhistory>
	 * @param assetsesForAssetModByUserId
	 *            Set<Assets>
	 * @param userses
	 *            Set<Users>
	 */
	public Users(Users users, Accountstatus accountstatus, String userUsername,
			String userPassword, Date userCreatedOn, int userModById,
			Date userModOn, Date userLastLogOn, Set<Notes> noteses,
			Set<Assets> assetsesForAssetAuditByUserId,
			Set<Assets> assetsesForAssetCreatedByUserId,
			Set<Logonhistory> logonhistories,
			Set<Assets> assetsesForAssetModByUserId, Set<Users> userses) {
		this.users = users;
		this.accountstatus = accountstatus;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userCreatedOn = userCreatedOn;
		this.userModById = userModById;
		this.userModOn = userModOn;
		this.userLastLogOn = userLastLogOn;
		this.noteses = noteses;
		this.assetsesForAssetAuditByUserId = assetsesForAssetAuditByUserId;
		this.assetsesForAssetCreatedByUserId = assetsesForAssetCreatedByUserId;
		this.logonhistories = logonhistories;
		this.assetsesForAssetModByUserId = assetsesForAssetModByUserId;
		this.userses = userses;
	}

	/**
	 * Method getAccountstatus.
	 * 
	
	 * @return Accountstatus */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_accountStatus_id", nullable = false)
	public Accountstatus getAccountstatus() {
		return accountstatus;
	}

	/**
	 * Method getAssetsesForAssetAuditByUserId.
	 * 
	
	 * @return Set<Assets> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByAssetAuditByUserId")
	public Set<Assets> getAssetsesForAssetAuditByUserId() {
		return assetsesForAssetAuditByUserId;
	}

	/**
	 * Method getAssetsesForAssetCreatedByUserId.
	 * 
	
	 * @return Set<Assets> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByAssetCreatedByUserId")
	public Set<Assets> getAssetsesForAssetCreatedByUserId() {
		return assetsesForAssetCreatedByUserId;
	}

	/**
	 * Method getAssetsesForAssetModByUserId.
	 * 
	
	 * @return Set<Assets> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByAssetModByUserId")
	public Set<Assets> getAssetsesForAssetModByUserId() {
		return assetsesForAssetModByUserId;
	}

	/**
	 * Method getLogonhistories.
	 * 
	
	 * @return Set<Logonhistory> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Logonhistory> getLogonhistories() {
		return logonhistories;
	}

	/**
	 * Method getNoteses.
	 * 
	
	 * @return Set<Notes> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Notes> getNoteses() {
		return noteses;
	}

	/**
	 * Method getUserCreatedOn.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_createdOn", nullable = false, length = 19)
	public Date getUserCreatedOn() {
		return userCreatedOn;
	}

	/**
	 * Method getUserId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return userId;
	}

	/**
	 * Method getUserLastLogOn.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_lastLogOn", length = 19)
	public Date getUserLastLogOn() {
		return userLastLogOn;
	}

	/**
	 * Method getUserModById.
	 * 
	
	 * @return int */
	@Column(name = "user_modBy_id", nullable = false)
	public int getUserModById() {
		return userModById;
	}

	/**
	 * Method getUserModOn.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_modOn", nullable = false, length = 19)
	public Date getUserModOn() {
		return userModOn;
	}

	/**
	 * Method getUserPassword.
	 * 
	
	 * @return String */
	@Column(name = "user_password", nullable = false, length = 45)
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * Method getUsers.
	 * 
	
	 * @return Users */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_createdBy_id", nullable = false)
	public Users getUsers() {
		return users;
	}

	/**
	 * Method getUserses.
	 * 
	
	 * @return Set<Users> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Users> getUserses() {
		return userses;
	}

	/**
	 * Method getUserUsername.
	 * 
	
	 * @return String */
	@Column(name = "user_username", unique = true, nullable = false, length = 45)
	public String getUserUsername() {
		return userUsername;
	}

	/**
	 * Method setAccountstatus.
	 * 
	 * @param accountstatus
	 *            Accountstatus
	 */
	public void setAccountstatus(Accountstatus accountstatus) {
		this.accountstatus = accountstatus;
	}

	/**
	 * Method setAssetsesForAssetAuditByUserId.
	 * 
	 * @param assetsesForAssetAuditByUserId
	 *            Set<Assets>
	 */
	public void setAssetsesForAssetAuditByUserId(
			Set<Assets> assetsesForAssetAuditByUserId) {
		this.assetsesForAssetAuditByUserId = assetsesForAssetAuditByUserId;
	}

	/**
	 * Method setAssetsesForAssetCreatedByUserId.
	 * 
	 * @param assetsesForAssetCreatedByUserId
	 *            Set<Assets>
	 */
	public void setAssetsesForAssetCreatedByUserId(
			Set<Assets> assetsesForAssetCreatedByUserId) {
		this.assetsesForAssetCreatedByUserId = assetsesForAssetCreatedByUserId;
	}

	/**
	 * Method setAssetsesForAssetModByUserId.
	 * 
	 * @param assetsesForAssetModByUserId
	 *            Set<Assets>
	 */
	public void setAssetsesForAssetModByUserId(
			Set<Assets> assetsesForAssetModByUserId) {
		this.assetsesForAssetModByUserId = assetsesForAssetModByUserId;
	}

	/**
	 * Method setLogonhistories.
	 * 
	 * @param logonhistories
	 *            Set<Logonhistory>
	 */
	public void setLogonhistories(Set<Logonhistory> logonhistories) {
		this.logonhistories = logonhistories;
	}

	/**
	 * Method setNoteses.
	 * 
	 * @param noteses
	 *            Set<Notes>
	 */
	public void setNoteses(Set<Notes> noteses) {
		this.noteses = noteses;
	}

	/**
	 * Method setUserCreatedOn.
	 * 
	 * @param userCreatedOn
	 *            Date
	 */
	public void setUserCreatedOn(Date userCreatedOn) {
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
	 *            Date
	 */
	public void setUserLastLogOn(Date userLastLogOn) {
		this.userLastLogOn = userLastLogOn;
	}

	/**
	 * Method setUserModById.
	 * 
	 * @param userModById
	 *            int
	 */
	public void setUserModById(int userModById) {
		this.userModById = userModById;
	}

	/**
	 * Method setUserModOn.
	 * 
	 * @param userModOn
	 *            Date
	 */
	public void setUserModOn(Date userModOn) {
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
	 * Method setUsers.
	 * 
	 * @param users
	 *            Users
	 */
	public void setUsers(Users users) {
		this.users = users;
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