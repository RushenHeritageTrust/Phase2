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
@Table(name = "metaname", uniqueConstraints = { @javax.persistence.UniqueConstraint(columnNames = { "metaName_name" }) })
public class Metaname implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer metaNameId;
	private String metaNameName;
	private Set<Meta> metas = new HashSet(0);

	public Metaname() {
	}

	/**
	 * Constructor for Metaname.
	 * 
	 * @param metaNameName
	 *            String
	 */
	public Metaname(String metaNameName) {
		this.metaNameName = metaNameName;
	}

	/**
	 * Constructor for Metaname.
	 * 
	 * @param metaNameName
	 *            String
	 * @param metas
	 *            Set<Meta>
	 */
	public Metaname(String metaNameName, Set<Meta> metas) {
		this.metaNameName = metaNameName;
		this.metas = metas;
	}

	/**
	 * Method getMetaNameId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "metaName_id", unique = true, nullable = false)
	public Integer getMetaNameId() {
		return metaNameId;
	}

	/**
	 * Method getMetaNameName.
	 * 
	
	 * @return String */
	@Column(name = "metaName_name", unique = true, nullable = false, length = 45)
	public String getMetaNameName() {
		return metaNameName;
	}

	/**
	 * Method getMetas.
	 * 
	
	 * @return Set<Meta> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metaname")
	public Set<Meta> getMetas() {
		return metas;
	}

	/**
	 * Method setMetaNameId.
	 * 
	 * @param metaNameId
	 *            Integer
	 */
	public void setMetaNameId(Integer metaNameId) {
		this.metaNameId = metaNameId;
	}

	/**
	 * Method setMetaNameName.
	 * 
	 * @param metaNameName
	 *            String
	 */
	public void setMetaNameName(String metaNameName) {
		this.metaNameName = metaNameName;
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
}