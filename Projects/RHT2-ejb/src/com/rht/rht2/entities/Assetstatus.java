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
@Table(name = "assetstatus", uniqueConstraints = { @javax.persistence.UniqueConstraint(columnNames = { "assetStatus_description" }) })
public class Assetstatus implements Serializable {
	private static final long serialVersionUID = 1L;
	private Set<Assets> assetses = new HashSet(0);
	private String assetStatusDescription;
	private Integer assetStatusId;

	public Assetstatus() {
	}

	/**
	 * Constructor for Assetstatus.
	 * 
	 * @param assetStatusDescription
	 *            String
	 */
	public Assetstatus(String assetStatusDescription) {
		this.assetStatusDescription = assetStatusDescription;
	}

	/**
	 * Constructor for Assetstatus.
	 * 
	 * @param assetStatusDescription
	 *            String
	 * @param assetses
	 *            Set<Assets>
	 */
	public Assetstatus(String assetStatusDescription, Set<Assets> assetses) {
		this.assetStatusDescription = assetStatusDescription;
		this.assetses = assetses;
	}

	/**
	 * Method getAssetses.
	 * 
	
	 * @return Set<Assets> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetstatus")
	public Set<Assets> getAssetses() {
		return assetses;
	}

	/**
	 * Method getAssetStatusDescription.
	 * 
	
	 * @return String */
	@Column(name = "assetStatus_description", unique = true, nullable = false, length = 45)
	public String getAssetStatusDescription() {
		return assetStatusDescription;
	}

	/**
	 * Method getAssetStatusId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "assetStatus_id", unique = true, nullable = false)
	public Integer getAssetStatusId() {
		return assetStatusId;
	}

	/**
	 * Method setAssetses.
	 * 
	 * @param assetses
	 *            Set<Assets>
	 */
	public void setAssetses(Set<Assets> assetses) {
		this.assetses = assetses;
	}

	/**
	 * Method setAssetStatusDescription.
	 * 
	 * @param assetStatusDescription
	 *            String
	 */
	public void setAssetStatusDescription(String assetStatusDescription) {
		this.assetStatusDescription = assetStatusDescription;
	}

	/**
	 * Method setAssetStatusId.
	 * 
	 * @param assetStatusId
	 *            Integer
	 */
	public void setAssetStatusId(Integer assetStatusId) {
		this.assetStatusId = assetStatusId;
	}
}