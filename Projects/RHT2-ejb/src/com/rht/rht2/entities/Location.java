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
@Table(name = "location", uniqueConstraints = { @javax.persistence.UniqueConstraint(columnNames = { "location_label" }) })
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;
	private Set<Assets> assetses = new HashSet(0);
	private Integer locationId;
	private String locationLabel;
	private Float locationLat;
	private Float locationLong;
	private String locationPostcode;

	public Location() {
	}

	/**
	 * Constructor for Location.
	 * 
	 * @param locationLabel
	 *            String
	 */
	public Location(String locationLabel) {
		this.locationLabel = locationLabel;
	}

	/**
	 * Constructor for Location.
	 * 
	 * @param locationLabel
	 *            String
	 * @param locationLat
	 *            Float
	 * @param locationLong
	 *            Float
	 * @param locationPostcode
	 *            String
	 * @param assetses
	 *            Set<Assets>
	 */
	public Location(String locationLabel, Float locationLat,
			Float locationLong, String locationPostcode, Set<Assets> assetses) {
		this.locationLabel = locationLabel;
		this.locationLat = locationLat;
		this.locationLong = locationLong;
		this.locationPostcode = locationPostcode;
		this.assetses = assetses;
	}

	/**
	 * Method getAssetses.
	 * 
	
	 * @return Set<Assets> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
	public Set<Assets> getAssetses() {
		return assetses;
	}

	/**
	 * Method getLocationId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id", unique = true, nullable = false)
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * Method getLocationLabel.
	 * 
	
	 * @return String */
	@Column(name = "location_label", unique = true, nullable = false)
	public String getLocationLabel() {
		return locationLabel;
	}

	/**
	 * Method getLocationLat.
	 * 
	
	 * @return Float */
	@Column(name = "location_lat", precision = 12, scale = 0)
	public Float getLocationLat() {
		return locationLat;
	}

	/**
	 * Method getLocationLong.
	 * 
	
	 * @return Float */
	@Column(name = "location_long", precision = 12, scale = 0)
	public Float getLocationLong() {
		return locationLong;
	}

	/**
	 * Method getLocationPostcode.
	 * 
	
	 * @return String */
	@Column(name = "location_postcode", length = 8)
	public String getLocationPostcode() {
		return locationPostcode;
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
	 * Method setLocationId.
	 * 
	 * @param locationId
	 *            Integer
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/**
	 * Method setLocationLabel.
	 * 
	 * @param locationLabel
	 *            String
	 */
	public void setLocationLabel(String locationLabel) {
		this.locationLabel = locationLabel;
	}

	/**
	 * Method setLocationLat.
	 * 
	 * @param locationLat
	 *            Float
	 */
	public void setLocationLat(Float locationLat) {
		this.locationLat = locationLat;
	}

	/**
	 * Method setLocationLong.
	 * 
	 * @param locationLong
	 *            Float
	 */
	public void setLocationLong(Float locationLong) {
		this.locationLong = locationLong;
	}

	/**
	 * Method setLocationPostcode.
	 * 
	 * @param locationPostcode
	 *            String
	 */
	public void setLocationPostcode(String locationPostcode) {
		this.locationPostcode = locationPostcode;
	}
}