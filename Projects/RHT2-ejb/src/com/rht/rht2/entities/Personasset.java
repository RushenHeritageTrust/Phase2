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
@Table(name = "personasset")
public class Personasset implements Serializable {
	private static final long serialVersionUID = 1L;
	private Assets assets;
	private String personAssetForename;
	private Integer personAssetId;
	private String personAssetMaidenName;
	private String personAssetOtherName;
	private String personAssetTitle;
	private String personsAssetSurname;

	public Personasset() {
	}

	/**
	 * Constructor for Personasset.
	 * 
	 * @param assets
	 *            Assets
	 * @param personsAssetSurname
	 *            String
	 */
	public Personasset(Assets assets, String personsAssetSurname) {
		this.assets = assets;
		this.personsAssetSurname = personsAssetSurname;
	}

	/**
	 * Constructor for Personasset.
	 * 
	 * @param assets
	 *            Assets
	 * @param personsAssetSurname
	 *            String
	 * @param personAssetTitle
	 *            String
	 * @param personAssetMaidenName
	 *            String
	 * @param personAssetOtherName
	 *            String
	 * @param personAssetForename
	 *            String
	 */
	public Personasset(Assets assets, String personsAssetSurname,
			String personAssetTitle, String personAssetMaidenName,
			String personAssetOtherName, String personAssetForename) {
		this.assets = assets;
		this.personsAssetSurname = personsAssetSurname;
		this.personAssetTitle = personAssetTitle;
		this.personAssetMaidenName = personAssetMaidenName;
		this.personAssetOtherName = personAssetOtherName;
		this.personAssetForename = personAssetForename;
	}

	/**
	 * Method getAssets.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personAsset_asset_id", nullable = false)
	public Assets getAssets() {
		return assets;
	}

	/**
	 * Method getPersonAssetForename.
	 * 
	
	 * @return String */
	@Column(name = "personAsset_forename", length = 45)
	public String getPersonAssetForename() {
		return personAssetForename;
	}

	/**
	 * Method getPersonAssetId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personAsset_id", unique = true, nullable = false)
	public Integer getPersonAssetId() {
		return personAssetId;
	}

	/**
	 * Method getPersonAssetMaidenName.
	 * 
	
	 * @return String */
	@Column(name = "personAsset_maidenName", length = 45)
	public String getPersonAssetMaidenName() {
		return personAssetMaidenName;
	}

	/**
	 * Method getPersonAssetOtherName.
	 * 
	
	 * @return String */
	@Column(name = "personAsset_otherName", length = 45)
	public String getPersonAssetOtherName() {
		return personAssetOtherName;
	}

	/**
	 * Method getPersonAssetTitle.
	 * 
	
	 * @return String */
	@Column(name = "personAsset_title", length = 45)
	public String getPersonAssetTitle() {
		return personAssetTitle;
	}

	/**
	 * Method getPersonsAssetSurname.
	 * 
	
	 * @return String */
	@Column(name = "personsAsset_surname", nullable = false, length = 45)
	public String getPersonsAssetSurname() {
		return personsAssetSurname;
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
	 * Method setPersonAssetForename.
	 * 
	 * @param personAssetForename
	 *            String
	 */
	public void setPersonAssetForename(String personAssetForename) {
		this.personAssetForename = personAssetForename;
	}

	/**
	 * Method setPersonAssetId.
	 * 
	 * @param personAssetId
	 *            Integer
	 */
	public void setPersonAssetId(Integer personAssetId) {
		this.personAssetId = personAssetId;
	}

	/**
	 * Method setPersonAssetMaidenName.
	 * 
	 * @param personAssetMaidenName
	 *            String
	 */
	public void setPersonAssetMaidenName(String personAssetMaidenName) {
		this.personAssetMaidenName = personAssetMaidenName;
	}

	/**
	 * Method setPersonAssetOtherName.
	 * 
	 * @param personAssetOtherName
	 *            String
	 */
	public void setPersonAssetOtherName(String personAssetOtherName) {
		this.personAssetOtherName = personAssetOtherName;
	}

	/**
	 * Method setPersonAssetTitle.
	 * 
	 * @param personAssetTitle
	 *            String
	 */
	public void setPersonAssetTitle(String personAssetTitle) {
		this.personAssetTitle = personAssetTitle;
	}

	/**
	 * Method setPersonsAssetSurname.
	 * 
	 * @param personsAssetSurname
	 *            String
	 */
	public void setPersonsAssetSurname(String personsAssetSurname) {
		this.personsAssetSurname = personsAssetSurname;
	}
}