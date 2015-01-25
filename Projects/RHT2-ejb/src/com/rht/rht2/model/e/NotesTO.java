package com.rht.rht2.model.e;

import javax.annotation.Generated;

/**
 * NotesTO is a Querydsl bean type
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.BeanSerializer")
public class NotesTO {

	private Integer notesAssetId;

	private java.sql.Timestamp notesCreatedOn;

	private Integer notesId;

	private String notesNote;

	private Integer notesUserId;

	/**
	 * Method getNotesAssetId.
	 * 
	
	 * @return Integer */
	public Integer getNotesAssetId() {
		return notesAssetId;
	}

	/**
	 * Method getNotesCreatedOn.
	 * 
	
	 * @return java.sql.Timestamp */
	public java.sql.Timestamp getNotesCreatedOn() {
		return notesCreatedOn;
	}

	/**
	 * Method getNotesId.
	 * 
	
	 * @return Integer */
	public Integer getNotesId() {
		return notesId;
	}

	/**
	 * Method getNotesNote.
	 * 
	
	 * @return String */
	public String getNotesNote() {
		return notesNote;
	}

	/**
	 * Method getNotesUserId.
	 * 
	
	 * @return Integer */
	public Integer getNotesUserId() {
		return notesUserId;
	}

	/**
	 * Method setNotesAssetId.
	 * 
	 * @param notesAssetId
	 *            Integer
	 */
	public void setNotesAssetId(Integer notesAssetId) {
		this.notesAssetId = notesAssetId;
	}

	/**
	 * Method setNotesCreatedOn.
	 * 
	 * @param notesCreatedOn
	 *            java.sql.Timestamp
	 */
	public void setNotesCreatedOn(java.sql.Timestamp notesCreatedOn) {
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
	 * Method setNotesUserId.
	 * 
	 * @param notesUserId
	 *            Integer
	 */
	public void setNotesUserId(Integer notesUserId) {
		this.notesUserId = notesUserId;
	}

}
