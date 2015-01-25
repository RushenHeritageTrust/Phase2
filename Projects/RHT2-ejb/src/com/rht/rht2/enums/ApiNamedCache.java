/*
 *
 */
package com.rht.rht2.enums;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Enum ApiNamedCache.
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
public enum ApiNamedCache implements Serializable {

	/** The cache api long. */
	CACHE_API_LONG("rht2-long-cache"), // 30 mins, // 1 min
	/** The cache api med. */
	CACHE_API_MED("rht2-med-cache"), // 5 mins
	/** The cache api short. */
	CACHE_API_SHORT("rht2-short-cache")
	/** The cache name. */
	;

	private String cacheName = null;

	/**
	 * Instantiates a new api named cache.
	 *
	 * @param cacheName
	 *            the cache name
	 */
	private ApiNamedCache(String cacheName) {
		this.cacheName = cacheName;
	}

	/**
	 * Gets the cache name.
	 *
	 * 
	
	 * @return the cache name */
	public String getCacheName() {
		return cacheName;
	}

}
