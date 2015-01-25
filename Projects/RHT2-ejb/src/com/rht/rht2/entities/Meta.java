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
@Table(name = "meta")
public class Meta implements Serializable {
	private static final long serialVersionUID = 1L;
	private Assets assets;
	private Integer metaId;
	private Metaname metaname;
	private Metavalue metavalue;

	public Meta() {
	}

	/**
	 * Constructor for Meta.
	 * 
	 * @param metavalue
	 *            Metavalue
	 * @param metaname
	 *            Metaname
	 * @param assets
	 *            Assets
	 */
	public Meta(Metavalue metavalue, Metaname metaname, Assets assets) {
		this.metavalue = metavalue;
		this.metaname = metaname;
		this.assets = assets;
	}

	/**
	 * Method getAssets.
	 * 
	
	 * @return Assets */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "meta_asset_id", nullable = false)
	public Assets getAssets() {
		return assets;
	}

	/**
	 * Method getMetaId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "meta_id", unique = true, nullable = false)
	public Integer getMetaId() {
		return metaId;
	}

	/**
	 * Method getMetaname.
	 * 
	
	 * @return Metaname */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "meta_metaName_id", nullable = false)
	public Metaname getMetaname() {
		return metaname;
	}

	/**
	 * Method getMetavalue.
	 * 
	
	 * @return Metavalue */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "meta_metaValue_id", nullable = false)
	public Metavalue getMetavalue() {
		return metavalue;
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
	 * Method setMetaId.
	 * 
	 * @param metaId
	 *            Integer
	 */
	public void setMetaId(Integer metaId) {
		this.metaId = metaId;
	}

	/**
	 * Method setMetaname.
	 * 
	 * @param metaname
	 *            Metaname
	 */
	public void setMetaname(Metaname metaname) {
		this.metaname = metaname;
	}

	/**
	 * Method setMetavalue.
	 * 
	 * @param metavalue
	 *            Metavalue
	 */
	public void setMetavalue(Metavalue metavalue) {
		this.metavalue = metavalue;
	}
}