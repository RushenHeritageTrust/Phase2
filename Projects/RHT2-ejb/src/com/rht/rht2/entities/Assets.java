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
@Table(name = "assets", uniqueConstraints = { @javax.persistence.UniqueConstraint(columnNames = { "asset_labelEng" }) })
public class Assets implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date assetAuditOn;
	private Date assetCreatedOn;
	private Date assetEndDate;
	private Integer assetId;
	private String assetLabelEng;
	private String assetLabelManx;
	private Date assetModOn;
	private Assets assets;
	private Set<Assets> assetses = new HashSet(0);
	private Date assetStartDate;
	private Assetstatus assetstatus;
	private Set<Eventasset> eventassets = new HashSet(0);
	private Location location;
	private Set<Media> medias = new HashSet(0);
	private Set<Meta> metas = new HashSet<Meta>();
	private Set<Notes> noteses = new HashSet(0);
	private Set<Objectasset> objectassets = new HashSet(0);
	private Set<Personasset> personassets = new HashSet(0);
	private Set<Placeasset> placeassets = new HashSet(0);
	private Users usersByAssetAuditByUserId;
	private Users usersByAssetCreatedByUserId;

	private Users usersByAssetModByUserId;

	public Assets() {
	}

	/**
	 * Constructor for Assets.
	 * 
	 * @param assets
	 *            Assets
	 * @param usersByAssetCreatedByUserId
	 *            Users
	 * @param location
	 *            Location
	 * @param usersByAssetAuditByUserId
	 *            Users
	 * @param usersByAssetModByUserId
	 *            Users
	 * @param assetstatus
	 *            Assetstatus
	 * @param assetLabelEng
	 *            String
	 * @param assetStartDate
	 *            Date
	 * @param assetCreatedOn
	 *            Date
	 */
	public Assets(Assets assets, Users usersByAssetCreatedByUserId,
			Location location, Users usersByAssetAuditByUserId,
			Users usersByAssetModByUserId, Assetstatus assetstatus,
			String assetLabelEng, Date assetStartDate, Date assetCreatedOn) {
		this.assets = assets;
		this.usersByAssetCreatedByUserId = usersByAssetCreatedByUserId;
		this.location = location;
		this.usersByAssetAuditByUserId = usersByAssetAuditByUserId;
		this.usersByAssetModByUserId = usersByAssetModByUserId;
		this.assetstatus = assetstatus;
		this.assetLabelEng = assetLabelEng;
		this.assetStartDate = assetStartDate;
		this.assetCreatedOn = assetCreatedOn;
	}

	/**
	 * Constructor for Assets.
	 * 
	 * @param assets
	 *            Assets
	 * @param usersByAssetCreatedByUserId
	 *            Users
	 * @param location
	 *            Location
	 * @param usersByAssetAuditByUserId
	 *            Users
	 * @param usersByAssetModByUserId
	 *            Users
	 * @param assetstatus
	 *            Assetstatus
	 * @param assetLabelEng
	 *            String
	 * @param assetLabelManx
	 *            String
	 * @param assetStartDate
	 *            Date
	 * @param assetEndDate
	 *            Date
	 * @param assetCreatedOn
	 *            Date
	 * @param assetModOn
	 *            Date
	 * @param assetAuditOn
	 *            Date
	 * @param metas
	 *            Set<Meta>
	 * @param placeassets
	 *            Set<Placeasset>
	 * @param eventassets
	 *            Set<Eventasset>
	 * @param noteses
	 *            Set<Notes>
	 * @param personassets
	 *            Set<Personasset>
	 * @param medias
	 *            Set<Media>
	 * @param assetses
	 *            Set<Assets>
	 * @param objectassets
	 *            Set<Objectasset>
	 */
	public Assets(Assets assets, Users usersByAssetCreatedByUserId,
			Location location, Users usersByAssetAuditByUserId,
			Users usersByAssetModByUserId, Assetstatus assetstatus,
			String assetLabelEng, String assetLabelManx, Date assetStartDate,
			Date assetEndDate, Date assetCreatedOn, Date assetModOn,
			Date assetAuditOn, Set<Meta> metas, Set<Placeasset> placeassets,
			Set<Eventasset> eventassets, Set<Notes> noteses,
			Set<Personasset> personassets, Set<Media> medias,
			Set<Assets> assetses, Set<Objectasset> objectassets) {
		this.assets = assets;
		this.usersByAssetCreatedByUserId = usersByAssetCreatedByUserId;
		this.location = location;
		this.usersByAssetAuditByUserId = usersByAssetAuditByUserId;
		this.usersByAssetModByUserId = usersByAssetModByUserId;
		this.assetstatus = assetstatus;
		this.assetLabelEng = assetLabelEng;
		this.assetLabelManx = assetLabelManx;
		this.assetStartDate = assetStartDate;
		this.assetEndDate = assetEndDate;
		this.assetCreatedOn = assetCreatedOn;
		this.assetModOn = assetModOn;
		this.assetAuditOn = assetAuditOn;
		this.metas = metas;
		this.placeassets = placeassets;
		this.eventassets = eventassets;
		this.noteses = noteses;
		this.personassets = personassets;
		this.medias = medias;
		this.assetses = assetses;

		this.objectassets = objectassets;
	}

	/**
	 * Method getAssetAuditOn.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "asset_auditOn", length = 19)
	public Date getAssetAuditOn() {
		return assetAuditOn;
	}

	/**
	 * Method getAssetCreatedOn.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "asset_createdOn", nullable = false, length = 19)
	public Date getAssetCreatedOn() {
		return assetCreatedOn;
	}

	/**
	 * Method getAssetEndDate.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "asset_endDate", length = 19)
	public Date getAssetEndDate() {
		return assetEndDate;
	}

	/**
	 * Method getAssetId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_id", unique = true, nullable = false)
	public Integer getAssetId() {
		return assetId;
	}

	/**
	 * Method getAssetLabelEng.
	 * 
	
	 * @return String */
	@Column(name = "asset_labelEng", unique = true, nullable = false)
	public String getAssetLabelEng() {
		return assetLabelEng;
	}

	/**
	 * Method getAssetLabelManx.
	 * 
	
	 * @return String */
	@Column(name = "asset_labelManx")
	public String getAssetLabelManx() {
		return assetLabelManx;
	}

	/**
	 * Method getAssetModOn.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "asset_modOn", length = 19)
	public Date getAssetModOn() {
		return assetModOn;
	}

	/**
	 * Method getAssets.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asset_changeFor_id", nullable = false)
	public Assets getAssets() {
		return assets;
	}

	/**
	 * Method getAssetses.
	 * 
	
	 * @return Set<Assets> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assets")
	public Set<Assets> getAssetses() {
		return assetses;
	}

	/**
	 * Method getAssetStartDate.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "asset_startDate", nullable = false, length = 19)
	public Date getAssetStartDate() {
		return assetStartDate;
	}

	/**
	 * Method getAssetstatus.
	 * 
	
	 * @return Assetstatus */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asset_assetStatus_id", nullable = false)
	public Assetstatus getAssetstatus() {
		return assetstatus;
	}

	/**
	 * Method getEventassets.
	 * 
	
	 * @return Set<Eventasset> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assets")
	public Set<Eventasset> getEventassets() {
		return eventassets;
	}

	/**
	 * Method getLocation.
	 * 
	
	 * @return Location */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asset_location_id", nullable = false)
	public Location getLocation() {
		return location;
	}

	/**
	 * Method getMedias.
	 * 
	
	 * @return Set<Media> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assets")
	public Set<Media> getMedias() {
		return medias;
	}

	/**
	 * Method getMetas.
	 * 
	
	 * @return Set<Meta> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assets")
	public Set<Meta> getMetas() {
		return metas;
	}

	/**
	 * Method getNoteses.
	 * 
	
	 * @return Set<Notes> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assets")
	public Set<Notes> getNoteses() {
		return noteses;
	}

	/**
	 * Method getObjectassets.
	 * 
	
	 * @return Set<Objectasset> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assets")
	public Set<Objectasset> getObjectassets() {
		return objectassets;
	}

	/**
	 * Method getPersonassets.
	 * 
	
	 * @return Set<Personasset> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assets")
	public Set<Personasset> getPersonassets() {
		return personassets;
	}

	/**
	 * Method getPlaceassets.
	 * 
	
	 * @return Set<Placeasset> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assets")
	public Set<Placeasset> getPlaceassets() {
		return placeassets;
	}

	/**
	 * Method getUsersByAssetAuditByUserId.
	 * 
	
	 * @return Users */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asset_auditBy_user_id", nullable = false)
	public Users getUsersByAssetAuditByUserId() {
		return usersByAssetAuditByUserId;
	}

	/**
	 * Method getUsersByAssetCreatedByUserId.
	 * 
	
	 * @return Users */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asset_createdBy_user_id", nullable = false)
	public Users getUsersByAssetCreatedByUserId() {
		return usersByAssetCreatedByUserId;
	}

	/**
	 * Method getUsersByAssetModByUserId.
	 * 
	
	 * @return Users */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asset_modBy_user_id", nullable = false)
	public Users getUsersByAssetModByUserId() {
		return usersByAssetModByUserId;
	}

	/**
	 * Method setAssetAuditOn.
	 * 
	 * @param assetAuditOn
	 *            Date
	 */
	public void setAssetAuditOn(Date assetAuditOn) {
		this.assetAuditOn = assetAuditOn;
	}

	/**
	 * Method setAssetCreatedOn.
	 * 
	 * @param assetCreatedOn
	 *            Date
	 */
	public void setAssetCreatedOn(Date assetCreatedOn) {
		this.assetCreatedOn = assetCreatedOn;
	}

	/**
	 * Method setAssetEndDate.
	 * 
	 * @param assetEndDate
	 *            Date
	 */
	public void setAssetEndDate(Date assetEndDate) {
		this.assetEndDate = assetEndDate;
	}

	/**
	 * Method setAssetId.
	 * 
	 * @param assetId
	 *            Integer
	 */
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	/**
	 * Method setAssetLabelEng.
	 * 
	 * @param assetLabelEng
	 *            String
	 */
	public void setAssetLabelEng(String assetLabelEng) {
		this.assetLabelEng = assetLabelEng;
	}

	/**
	 * Method setAssetLabelManx.
	 * 
	 * @param assetLabelManx
	 *            String
	 */
	public void setAssetLabelManx(String assetLabelManx) {
		this.assetLabelManx = assetLabelManx;
	}

	/**
	 * Method setAssetModOn.
	 * 
	 * @param assetModOn
	 *            Date
	 */
	public void setAssetModOn(Date assetModOn) {
		this.assetModOn = assetModOn;
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
	 * Method setAssetses.
	 * 
	 * @param assetses
	 *            Set<Assets>
	 */
	public void setAssetses(Set<Assets> assetses) {
		this.assetses = assetses;
	}

	/**
	 * Method setAssetStartDate.
	 * 
	 * @param assetStartDate
	 *            Date
	 */
	public void setAssetStartDate(Date assetStartDate) {
		this.assetStartDate = assetStartDate;
	}

	/**
	 * Method setAssetstatus.
	 * 
	 * @param assetstatus
	 *            Assetstatus
	 */
	public void setAssetstatus(Assetstatus assetstatus) {
		this.assetstatus = assetstatus;
	}

	/**
	 * Method setEventassets.
	 * 
	 * @param eventassets
	 *            Set<Eventasset>
	 */
	public void setEventassets(Set<Eventasset> eventassets) {
		this.eventassets = eventassets;
	}

	/**
	 * Method setLocation.
	 * 
	 * @param location
	 *            Location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * Method setMedias.
	 * 
	 * @param medias
	 *            Set<Media>
	 */
	public void setMedias(Set<Media> medias) {
		this.medias = medias;
	}

	/**
	 * Method setMetas.
	 * 
	 * @param metas
	 *            Set<Meta>
	 */
	public void setMetas(Set<Meta> metas) {
		this.metas = metas;
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
	 * Method setObjectassets.
	 * 
	 * @param objectassets
	 *            Set<Objectasset>
	 */
	public void setObjectassets(Set<Objectasset> objectassets) {
		this.objectassets = objectassets;
	}

	/**
	 * Method setPersonassets.
	 * 
	 * @param personassets
	 *            Set<Personasset>
	 */
	public void setPersonassets(Set<Personasset> personassets) {
		this.personassets = personassets;
	}

	/**
	 * Method setPlaceassets.
	 * 
	 * @param placeassets
	 *            Set<Placeasset>
	 */
	public void setPlaceassets(Set<Placeasset> placeassets) {
		this.placeassets = placeassets;
	}

	/**
	 * Method setUsersByAssetAuditByUserId.
	 * 
	 * @param usersByAssetAuditByUserId
	 *            Users
	 */
	public void setUsersByAssetAuditByUserId(Users usersByAssetAuditByUserId) {
		this.usersByAssetAuditByUserId = usersByAssetAuditByUserId;
	}

	/**
	 * Method setUsersByAssetCreatedByUserId.
	 * 
	 * @param usersByAssetCreatedByUserId
	 *            Users
	 */
	public void setUsersByAssetCreatedByUserId(Users usersByAssetCreatedByUserId) {
		this.usersByAssetCreatedByUserId = usersByAssetCreatedByUserId;
	}

	/**
	 * Method setUsersByAssetModByUserId.
	 * 
	 * @param usersByAssetModByUserId
	 *            Users
	 */
	public void setUsersByAssetModByUserId(Users usersByAssetModByUserId) {
		this.usersByAssetModByUserId = usersByAssetModByUserId;
	}
}