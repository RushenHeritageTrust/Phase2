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
@Table(name = "metavalue", uniqueConstraints = { @javax.persistence.UniqueConstraint(columnNames = { "metaValue_name" }) })
public class Metavalue implements Serializable {
	private static final long serialVersionUID = 1L;
	private Set<Meta> metas = new HashSet(0);
	private Integer metaValueId;
	private String metaValueName;

	public Metavalue() {
	}

	/**
	 * Constructor for Metavalue.
	 * 
	 * @param metaValueName
	 *            String
	 */
	public Metavalue(String metaValueName) {
		this.metaValueName = metaValueName;
	}

	/**
	 * Constructor for Metavalue.
	 * 
	 * @param metaValueName
	 *            String
	 * @param metas
	 *            Set<Meta>
	 */
	public Metavalue(String metaValueName, Set<Meta> metas) {
		this.metaValueName = metaValueName;
		this.metas = metas;
	}

	/**
	 * Method getMetas.
	 * 
	
	 * @return Set<Meta> */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metavalue")
	public Set<Meta> getMetas() {
		return metas;
	}

	/**
	 * Method getMetaValueId.
	 * 
	
	 * @return Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "metaValue_id", unique = true, nullable = false)
	public Integer getMetaValueId() {
		return metaValueId;
	}

	/**
	 * Method getMetaValueName.
	 * 
	
	 * @return String */
	@Column(name = "metaValue_name", unique = true, nullable = false, length = 45)
	public String getMetaValueName() {
		return metaValueName;
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
	 * Method setMetaValueId.
	 * 
	 * @param metaValueId
	 *            Integer
	 */
	public void setMetaValueId(Integer metaValueId) {
		this.metaValueId = metaValueId;
	}

	/**
	 * Method setMetaValueName.
	 * 
	 * @param metaValueName
	 *            String
	 */
	public void setMetaValueName(String metaValueName) {
		this.metaValueName = metaValueName;
	}
}