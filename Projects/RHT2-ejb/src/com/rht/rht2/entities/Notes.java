package com.rht.rht2.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "notes")
public class Notes implements Serializable {
	private static final long serialVersionUID = 1L;
	private Assets assets;
	private Date notesCreatedOn;
	private Integer notesId;
	private String notesNote;
	private Users users;

	public Notes() {
	}

	/**
	 * Constructor for Notes.
	 * 
	 * @param users
	 *            Users
	 * @param assets
	 *            Assets
	 * @param notesNote
	 *            String
	 * @param notesCreatedOn
	 *            Date
	 */
	public Notes(Users users, Assets assets, String notesNote,
			Date notesCreatedOn) {
		this.users = users;
		this.assets = assets;
		this.notesNote = notesNote;
		this.notesCreatedOn = notesCreatedOn;
	}

	/**
	 * Method getAssets.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "notes_asset_id", nullable = false)
	public Assets getAssets() {
		return assets;
	}

	/**
	 * Method getNotesCreatedOn.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "notes_createdOn", nullable = false, length = 19)
	public Date getNotesCreatedOn() {
		return notesCreatedOn;
	}

	/**
	 * Method getNotesId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "notes_id", unique = true, nullable = false)
	public Integer getNotesId() {
		return notesId;
	}

	/**
	 * Method getNotesNote.
	 * 
	
	 * @return String */
	@Column(name = "notes_note", nullable = false)
	public String getNotesNote() {
		return notesNote;
	}

	/**
	 * Method getUsers.
	 * 
	
	 * @return Users */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "notes_user_id", nullable = false)
	public Users getUsers() {
		return users;
	}

	/**
	 * Method setAssets.
	 * 
	 * @param assets
	 *            Assets
	 */
	public void setAssets(Assets assets) {
		this.assets = assets;
	}

	/**
	 * Method setNotesCreatedOn.
	 * 
	 * @param notesCreatedOn
	 *            Date
	 */
	public void setNotesCreatedOn(Date notesCreatedOn) {
		this.notesCreatedOn = notesCreatedOn;
	}

	/**
	 * Method setNotesId.
	 * 
	 * @param notesId
	 *            Integer
	 */
	public void setNotesId(Integer notesId) {
		this.notesId = notesId;
	}

	/**
	 * Method setNotesNote.
	 * 
	 * @param notesNote
	 *            String
	 */
	public void setNotesNote(String notesNote) {
		this.notesNote = notesNote;
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