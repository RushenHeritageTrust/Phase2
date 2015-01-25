package com.rht.rht2.model.e;

import javax.annotation.Generated;

/**
 * LocationTO is a Querydsl bean type
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.BeanSerializer")
public class LocationTO {

	private Integer locationId;

	private String locationLabel;

	private Float locationLat;

	private Float locationLong;

	private String locationPostcode;

	/**
	 * Method getLocationId.
	 * 
	
	 * @return Integer */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * Method getLocationLabel.
	 * 
	
	 * @return String */
	public String getLocationLabel() {
		return locationLabel;
	}

	/**
	 * Method getLocationLat.
	 * 
	
	 * @return Float */
	public Float getLocationLat() {
		return locationLat;
	}

	/**
	 * Method getLocationLong.
	 * 
	
	 * @return Float */
	public Float getLocationLong() {
		return locationLong;
	}

	/**
	 * Method getLocationPostcode.
	 * 
	
	 * @return String */
	public String getLocationPostcode() {
		return locationPostcode;
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
