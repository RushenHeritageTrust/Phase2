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
@Table(name = "assetrelations")
public class Assetrelations implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer assetRelationsId;
	private Assets assetsByAssetRelationsAssetDestId;
	private Assets assetsByAssetRelationsAssetSourceId;
	private Relationtypes relationtypes;

	public Assetrelations() {
	}

	/**
	 * Constructor for Assetrelations.
	 * 
	 * @param relationtypes
	 *            Relationtypes
	 * @param assetsByAssetRelationsAssetDestId
	 *            Assets
	 * @param assetsByAssetRelationsAssetSourceId
	 *            Assets
	 */
	public Assetrelations(Relationtypes relationtypes,
			Assets assetsByAssetRelationsAssetDestId,
			Assets assetsByAssetRelationsAssetSourceId) {
		this.relationtypes = relationtypes;
		this.assetsByAssetRelationsAssetDestId = assetsByAssetRelationsAssetDestId;
		this.assetsByAssetRelationsAssetSourceId = assetsByAssetRelationsAssetSourceId;
	}

	/**
	 * Method getAssetRelationsId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "assetRelations_id", unique = true, nullable = false)
	public Integer getAssetRelationsId() {
		return assetRelationsId;
	}

	/**
	 * Method getAssetsByAssetRelationsAssetDestId.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetRelations_asset_dest_id", nullable = false)
	public Assets getAssetsByAssetRelationsAssetDestId() {
		return assetsByAssetRelationsAssetDestId;
	}

	/**
	 * Method getAssetsByAssetRelationsAssetSourceId.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetRelations_asset_source_id", nullable = false)
	public Assets getAssetsByAssetRelationsAssetSourceId() {
		return assetsByAssetRelationsAssetSourceId;
	}

	/**
	 * Method getRelationtypes.
	 * 
	
	 * @return Relationtypes */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetRelations_relationTypes_id", nullable = false)
	public Relationtypes getRelationtypes() {
		return relationtypes;
	}

	/**
	 * Method setAssetRelationsId.
	 * 
	 * @param assetRelationsId
	 *            Integer
	 */
	public void setAssetRelationsId(Integer assetRelationsId) {
		this.assetRelationsId = assetRelationsId;
	}

	/**
	 * Method setAssetsByAssetRelationsAssetDestId.
	 * 
	 * @param assetsByAssetRelationsAssetDestId
	 *            Assets
	 */
	public void setAssetsByAssetRelationsAssetDestId(
			Assets assetsByAssetRelationsAssetDestId) {
		this.assetsByAssetRelationsAssetDestId = assetsByAssetRelationsAssetDestId;
	}

	/**
	 * Method setAssetsByAssetRelationsAssetSourceId.
	 * 
	 * @param assetsByAssetRelationsAssetSourceId
	 *            Assets
	 */
	public void setAssetsByAssetRelationsAssetSourceId(
			Assets assetsByAssetRelationsAssetSourceId) {
		this.assetsByAssetRelationsAssetSourceId = assetsByAssetRelationsAssetSourceId;
	}

	/**
	 * Method setRelationtypes.
	 * 
	 * @param relationtypes
	 *            Relationtypes
	 */
	public void setRelationtypes(Relationtypes relationtypes) {
		this.relationtypes = relationtypes;
	}
}