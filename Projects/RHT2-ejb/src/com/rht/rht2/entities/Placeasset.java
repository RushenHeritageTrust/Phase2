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
@Table(name = "placeasset")
public class Placeasset implements Serializable {
	private static final long serialVersionUID = 1L;
	private Assets assets;
	private String placeAssetAddress1;
	private String placeAssetAddress2;
	private String placeAssetArea;
	private Integer placeAssetId;
	private String placeAssetLocationName;
	private String placeAssetNumberName;
	private String placeAssetParish;
	private String placeAssetTown;

	public Placeasset() {
	}

	/**
	 * Constructor for Placeasset.
	 * 
	 * @param assets
	 *            Assets
	 */
	public Placeasset(Assets assets) {
		this.assets = assets;
	}

	/**
	 * Constructor for Placeasset.
	 * 
	 * @param assets
	 *            Assets
	 * @param placeAssetLocationName
	 *            String
	 * @param placeAssetNumberName
	 *            String
	 * @param placeAssetAddress1
	 *            String
	 * @param placeAssetAddress2
	 *            String
	 * @param placeAssetTown
	 *            String
	 * @param placeAssetParish
	 *            String
	 * @param placeAssetArea
	 *            String
	 */
	public Placeasset(Assets assets, String placeAssetLocationName,
			String placeAssetNumberName, String placeAssetAddress1,
			String placeAssetAddress2, String placeAssetTown,
			String placeAssetParish, String placeAssetArea) {
		this.assets = assets;
		this.placeAssetLocationName = placeAssetLocationName;
		this.placeAssetNumberName = placeAssetNumberName;
		this.placeAssetAddress1 = placeAssetAddress1;
		this.placeAssetAddress2 = placeAssetAddress2;
		this.placeAssetTown = placeAssetTown;
		this.placeAssetParish = placeAssetParish;
		this.placeAssetArea = placeAssetArea;
	}

	/**
	 * Method getAssets.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "placeAsset_asset_id", nullable = false)
	public Assets getAssets() {
		return assets;
	}

	/**
	 * Method getPlaceAssetAddress1.
	 * 
	
	 * @return String */
	@Column(name = "placeAsset_address1", length = 45)
	public String getPlaceAssetAddress1() {
		return placeAssetAddress1;
	}

	/**
	 * Method getPlaceAssetAddress2.
	 * 
	
	 * @return String */
	@Column(name = "placeAsset_address2", length = 45)
	public String getPlaceAssetAddress2() {
		return placeAssetAddress2;
	}

	/**
	 * Method getPlaceAssetArea.
	 * 
	
	 * @return String */
	@Column(name = "placeAsset_area", length = 45)
	public String getPlaceAssetArea() {
		return placeAssetArea;
	}

	/**
	 * Method getPlaceAssetId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "placeAsset_id", unique = true, nullable = false)
	public Integer getPlaceAssetId() {
		return placeAssetId;
	}

	/**
	 * Method getPlaceAssetLocationName.
	 * 
	
	 * @return String */
	@Column(name = "placeAsset_locationName", length = 45)
	public String getPlaceAssetLocationName() {
		return placeAssetLocationName;
	}

	/**
	 * Method getPlaceAssetNumberName.
	 * 
	
	 * @return String */
	@Column(name = "placeAsset_numberName", length = 45)
	public String getPlaceAssetNumberName() {
		return placeAssetNumberName;
	}

	/**
	 * Method getPlaceAssetParish.
	 * 
	
	 * @return String */
	@Column(name = "placeAsset_parish", length = 45)
	public String getPlaceAssetParish() {
		return placeAssetParish;
	}

	/**
	 * Method getPlaceAssetTown.
	 * 
	
	 * @return String */
	@Column(name = "placeAsset_town", length = 45)
	public String getPlaceAssetTown() {
		return placeAssetTown;
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
	 * Method setPlaceAssetAddress1.
	 * 
	 * @param placeAssetAddress1
	 *            String
	 */
	public void setPlaceAssetAddress1(String placeAssetAddress1) {
		this.placeAssetAddress1 = placeAssetAddress1;
	}

	/**
	 * Method setPlaceAssetAddress2.
	 * 
	 * @param placeAssetAddress2
	 *            String
	 */
	public void setPlaceAssetAddress2(String placeAssetAddress2) {
		this.placeAssetAddress2 = placeAssetAddress2;
	}

	/**
	 * Method setPlaceAssetArea.
	 * 
	 * @param placeAssetArea
	 *            String
	 */
	public void setPlaceAssetArea(String placeAssetArea) {
		this.placeAssetArea = placeAssetArea;
	}

	/**
	 * Method setPlaceAssetId.
	 * 
	 * @param placeAssetId
	 *            Integer
	 */
	public void setPlaceAssetId(Integer placeAssetId) {
		this.placeAssetId = placeAssetId;
	}

	/**
	 * Method setPlaceAssetLocationName.
	 * 
	 * @param placeAssetLocationName
	 *            String
	 */
	public void setPlaceAssetLocationName(String placeAssetLocationName) {
		this.placeAssetLocationName = placeAssetLocationName;
	}

	/**
	 * Method setPlaceAssetNumberName.
	 * 
	 * @param placeAssetNumberName
	 *            String
	 */
	public void setPlaceAssetNumberName(String placeAssetNumberName) {
		this.placeAssetNumberName = placeAssetNumberName;
	}

	/**
	 * Method setPlaceAssetParish.
	 * 
	 * @param placeAssetParish
	 *            String
	 */
	public void setPlaceAssetParish(String placeAssetParish) {
		this.placeAssetParish = placeAssetParish;
	}

	/**
	 * Method setPlaceAssetTown.
	 * 
	 * @param placeAssetTown
	 *            String
	 */
	public void setPlaceAssetTown(String placeAssetTown) {
		this.placeAssetTown = placeAssetTown;
	}
}