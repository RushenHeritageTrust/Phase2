package com.rht.rht2.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "relationtypes", uniqueConstraints = { @javax.persistence.UniqueConstraint(columnNames = { "relationTypes_label" }) })
public class Relationtypes implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer relationTypesId;
	private String relationTypesLabel;

	public Relationtypes() {
	}

	/**
	 * Constructor for Relationtypes.
	 * 
	 * @param relationTypesLabel
	 *            String
	 */
	public Relationtypes(String relationTypesLabel) {
		this.relationTypesLabel = relationTypesLabel;
	}

	/**
	 * Method getRelationTypesId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "relationTypes_id", unique = true, nullable = false)
	public Integer getRelationTypesId() {
		return relationTypesId;
	}

	/**
	 * Method getRelationTypesLabel.
	 * 
	
	 * @return String */
	@Column(name = "relationTypes_label", unique = true, nullable = false)
	public String getRelationTypesLabel() {
		return relationTypesLabel;
	}

	/**
	 * Method setRelationTypesId.
	 * 
	 * @param relationTypesId
	 *            Integer
	 */
	public void setRelationTypesId(Integer relationTypesId) {
		this.relationTypesId = relationTypesId;
	}

	/**
	 * Method setRelationTypesLabel.
	 * 
	 * @param relationTypesLabel
	 *            String
	 */
	public void setRelationTypesLabel(String relationTypesLabel) {
		this.relationTypesLabel = relationTypesLabel;
	}
}