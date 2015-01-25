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
@Table(name = "media")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;
	private Assets assets;
	private String mediaFilePath;
	private Integer mediaId;
	private String mediaThumbnail;
	private Integer mediaType;
	private String mediaUrl;

	public Media() {
	}

	/**
	 * Constructor for Media.
	 * 
	 * @param assets
	 *            Assets
	 */
	public Media(Assets assets) {
		this.assets = assets;
	}

	/**
	 * Constructor for Media.
	 * 
	 * @param assets
	 *            Assets
	 * @param mediaThumbnail
	 *            String
	 * @param mediaFilePath
	 *            String
	 * @param mediaUrl
	 *            String
	 * @param mediaType
	 *            Integer
	 */
	public Media(Assets assets, String mediaThumbnail, String mediaFilePath,
			String mediaUrl, Integer mediaType) {
		this.assets = assets;
		this.mediaThumbnail = mediaThumbnail;
		this.mediaFilePath = mediaFilePath;
		this.mediaUrl = mediaUrl;
		this.mediaType = mediaType;
	}

	/**
	 * Method getAssets.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "media_asset_id", nullable = false)
	public Assets getAssets() {
		return assets;
	}

	/**
	 * Method getMediaFilePath.
	 * 
	
	 * @return String */
	@Column(name = "media_filePath")
	public String getMediaFilePath() {
		return mediaFilePath;
	}

	/**
	 * Method getMediaId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "media_id", unique = true, nullable = false)
	public Integer getMediaId() {
		return mediaId;
	}

	/**
	 * Method getMediaThumbnail.
	 * 
	
	 * @return String */
	@Column(name = "media_thumbnail")
	public String getMediaThumbnail() {
		return mediaThumbnail;
	}

	/**
	 * Method getMediaType.
	 * 
	
	 * @return Integer */
	@Column(name = "media_type")
	public Integer getMediaType() {
		return mediaType;
	}

	/**
	 * Method getMediaUrl.
	 * 
	
	 * @return String */
	@Column(name = "media_url")
	public String getMediaUrl() {
		return mediaUrl;
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
	 * Method setMediaFilePath.
	 * 
	 * @param mediaFilePath
	 *            String
	 */
	public void setMediaFilePath(String mediaFilePath) {
		this.mediaFilePath = mediaFilePath;
	}

	/**
	 * Method setMediaId.
	 * 
	 * @param mediaId
	 *            Integer
	 */
	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}

	/**
	 * Method setMediaThumbnail.
	 * 
	 * @param mediaThumbnail
	 *            String
	 */
	public void setMediaThumbnail(String mediaThumbnail) {
		this.mediaThumbnail = mediaThumbnail;
	}

	/**
	 * Method setMediaType.
	 * 
	 * @param mediaType
	 *            Integer
	 */
	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * Method setMediaUrl.
	 * 
	 * @param mediaUrl
	 *            String
	 */
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}
}