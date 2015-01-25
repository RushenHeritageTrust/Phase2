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
@Table(name = "eventasset")
public class Eventasset implements Serializable {
	private static final long serialVersionUID = 1L;
	private Assets assets;
	private Integer eventAssetEventLength;
	private String eventAssetEventPeriod;
	private String eventAssetEventType;
	private Date eventAssetFirstOccurance;
	private Integer eventAssetId;
	private Date eventAssetLastOccurance;
	private byte[] eventAssetReocurring;

	public Eventasset() {
	}

	/**
	 * Constructor for Eventasset.
	 * 
	 * @param assets
	 *            Assets
	 * @param eventAssetReocurring
	 *            byte[]
	 */
	public Eventasset(Assets assets, byte[] eventAssetReocurring) {
		this.assets = assets;
		this.eventAssetReocurring = eventAssetReocurring;
	}

	/**
	 * Constructor for Eventasset.
	 * 
	 * @param assets
	 *            Assets
	 * @param eventAssetEventType
	 *            String
	 * @param eventAssetReocurring
	 *            byte[]
	 * @param eventAssetFirstOccurance
	 *            Date
	 * @param eventAssetLastOccurance
	 *            Date
	 * @param eventAssetEventLength
	 *            Integer
	 * @param eventAssetEventPeriod
	 *            String
	 */
	public Eventasset(Assets assets, String eventAssetEventType,
			byte[] eventAssetReocurring, Date eventAssetFirstOccurance,
			Date eventAssetLastOccurance, Integer eventAssetEventLength,
			String eventAssetEventPeriod) {
		this.assets = assets;
		this.eventAssetEventType = eventAssetEventType;
		this.eventAssetReocurring = eventAssetReocurring;
		this.eventAssetFirstOccurance = eventAssetFirstOccurance;
		this.eventAssetLastOccurance = eventAssetLastOccurance;
		this.eventAssetEventLength = eventAssetEventLength;
		this.eventAssetEventPeriod = eventAssetEventPeriod;
	}

	/**
	 * Method getAssets.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eventAsset_asset_id", nullable = false)
	public Assets getAssets() {
		return assets;
	}

	/**
	 * Method getEventAssetEventLength.
	 * 
	
	 * @return Integer */
	@Column(name = "eventAsset_eventLength")
	public Integer getEventAssetEventLength() {
		return eventAssetEventLength;
	}

	/**
	 * Method getEventAssetEventPeriod.
	 * 
	
	 * @return String */
	@Column(name = "eventAsset_eventPeriod", length = 45)
	public String getEventAssetEventPeriod() {
		return eventAssetEventPeriod;
	}

	/**
	 * Method getEventAssetEventType.
	 * 
	
	 * @return String */
	@Column(name = "eventAsset_eventType", length = 45)
	public String getEventAssetEventType() {
		return eventAssetEventType;
	}

	/**
	 * Method getEventAssetFirstOccurance.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "eventAsset_firstOccurance", length = 19)
	public Date getEventAssetFirstOccurance() {
		return eventAssetFirstOccurance;
	}

	/**
	 * Method getEventAssetId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eventAsset_id", unique = true, nullable = false)
	public Integer getEventAssetId() {
		return eventAssetId;
	}

	/**
	 * Method getEventAssetLastOccurance.
	 * 
	
	 * @return Date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "eventAsset_lastOccurance", length = 19)
	public Date getEventAssetLastOccurance() {
		return eventAssetLastOccurance;
	}

	/**
	 * Method getEventAssetReocurring.
	 * 
	
	 * @return byte[] */
	@Column(name = "eventAsset_reocurring", nullable = false)
	public byte[] getEventAssetReocurring() {
		return eventAssetReocurring;
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
	 * Method setEventAssetEventLength.
	 * 
	 * @param eventAssetEventLength
	 *            Integer
	 */
	public void setEventAssetEventLength(Integer eventAssetEventLength) {
		this.eventAssetEventLength = eventAssetEventLength;
	}

	/**
	 * Method setEventAssetEventPeriod.
	 * 
	 * @param eventAssetEventPeriod
	 *            String
	 */
	public void setEventAssetEventPeriod(String eventAssetEventPeriod) {
		this.eventAssetEventPeriod = eventAssetEventPeriod;
	}

	/**
	 * Method setEventAssetEventType.
	 * 
	 * @param eventAssetEventType
	 *            String
	 */
	public void setEventAssetEventType(String eventAssetEventType) {
		this.eventAssetEventType = eventAssetEventType;
	}

	/**
	 * Method setEventAssetFirstOccurance.
	 * 
	 * @param eventAssetFirstOccurance
	 *            Date
	 */
	public void setEventAssetFirstOccurance(Date eventAssetFirstOccurance) {
		this.eventAssetFirstOccurance = eventAssetFirstOccurance;
	}

	/**
	 * Method setEventAssetId.
	 * 
	 * @param eventAssetId
	 *            Integer
	 */
	public void setEventAssetId(Integer eventAssetId) {
		this.eventAssetId = eventAssetId;
	}

	/**
	 * Method setEventAssetLastOccurance.
	 * 
	 * @param eventAssetLastOccurance
	 *            Date
	 */
	public void setEventAssetLastOccurance(Date eventAssetLastOccurance) {
		this.eventAssetLastOccurance = eventAssetLastOccurance;
	}

	/**
	 * Method setEventAssetReocurring.
	 * 
	 * @param eventAssetReocurring
	 *            byte[]
	 */
	public void setEventAssetReocurring(byte[] eventAssetReocurring) {
		this.eventAssetReocurring = eventAssetReocurring;
	}
}