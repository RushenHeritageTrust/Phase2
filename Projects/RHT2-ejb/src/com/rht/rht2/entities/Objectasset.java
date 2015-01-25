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
@Table(name = "objectasset")
public class Objectasset implements Serializable {
	private static final long serialVersionUID = 1L;
	private Assets assets;
	private Integer objectAssetId;
	private Integer objectAssetObjectAge;
	private String objectAssetObjectAgePeriod;
	private Date objectAssetObjectCreatedOn;
	private String objectAssetObjectType;

	public Objectasset() {
	}

	/**
	 * Constructor for Objectasset.
	 * 
	 * @param assets
	 *            Assets
	 */
	public Objectasset(Assets assets) {
		this.assets = assets;
	}

	/**
	 * Constructor for Objectasset.
	 * 
	 * @param assets
	 *            Assets
	 * @param objectAssetObjectType
	 *            String
	 * @param objectAssetObjectAge
	 *            Integer
	 * @param objectAssetObjectAgePeriod
	 *            String
	 * @param objectAssetObjectCreatedOn
	 *            Date
	 */
	public Objectasset(Assets assets, String objectAssetObjectType,
			Integer objectAssetObjectAge, String objectAssetObjectAgePeriod,
			Date objectAssetObjectCreatedOn) {
		this.assets = assets;
		this.objectAssetObjectType = objectAssetObjectType;
		this.objectAssetObjectAge = objectAssetObjectAge;
		this.objectAssetObjectAgePeriod = objectAssetObjectAgePeriod;
		this.objectAssetObjectCreatedOn = objectAssetObjectCreatedOn;
	}

	/**
	 * Method getAssets.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "objectAsset_asset_id", nullable = false)
	public Assets getAssets() {
		return assets;
	}

	/**
	 * Method getObjectAssetId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "objectAsset_id", unique = true, nullable = false)
	public Integer getObjectAssetId() {
		return objectAssetId;
	}

	/**
	 * Method getObjectAssetObjectAge.
	 * 
	
	 * @return Integer */
	@Column(name = "objectAsset_objectAge")
	public Integer getObjectAssetObjectAge() {
		return objectAssetObjectAge;
	}

	/**
	 * Method getObjectAssetObjectAgePeriod.
	 * 
	
	 * @return String */
	@Column(name = "objectAsset_objectAgePeriod", length = 45)
	public String getObjectAssetObjectAgePeriod() {
		return objectAssetObjectAgePeriod;
	}

	/**
	 * Method getObjectAssetObjectCreatedOn.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "objectAsset_objectCreatedOn", length = 19)
	public Date getObjectAssetObjectCreatedOn() {
		return objectAssetObjectCreatedOn;
	}

	/**
	 * Method getObjectAssetObjectType.
	 * 
	
	 * @return String */
	@Column(name = "objectAsset_objectType", length = 45)
	public String getObjectAssetObjectType() {
		return objectAssetObjectType;
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
	 * Method setObjectAssetId.
	 * 
	 * @param objectAssetId
	 *            Integer
	 */
	public void setObjectAssetId(Integer objectAssetId) {
		this.objectAssetId = objectAssetId;
	}

	/**
	 * Method setObjectAssetObjectAge.
	 * 
	 * @param objectAssetObjectAge
	 *            Integer
	 */
	public void setObjectAssetObjectAge(Integer objectAssetObjectAge) {
		this.objectAssetObjectAge = objectAssetObjectAge;
	}

	/**
	 * Method setObjectAssetObjectAgePeriod.
	 * 
	 * @param objectAssetObjectAgePeriod
	 *            String
	 */
	public void setObjectAssetObjectAgePeriod(String objectAssetObjectAgePeriod) {
		this.objectAssetObjectAgePeriod = objectAssetObjectAgePeriod;
	}

	/**
	 * Method setObjectAssetObjectCreatedOn.
	 * 
	 * @param objectAssetObjectCreatedOn
	 *            Date
	 */
	public void setObjectAssetObjectCreatedOn(Date objectAssetObjectCreatedOn) {
		this.objectAssetObjectCreatedOn = objectAssetObjectCreatedOn;
	}

	/**
	 * Method setObjectAssetObjectType.
	 * 
	 * @param objectAssetObjectType
	 *            String
	 */
	public void setObjectAssetObjectType(String objectAssetObjectType) {
		this.objectAssetObjectType = objectAssetObjectType;
	}
}