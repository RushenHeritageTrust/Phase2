/*
 *
 */
package com.rht.rht2.cache;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.infinispan.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rht.rht2.enums.ApiNamedCache;

// TODO: Auto-generated Javadoc
/**
 * Database protection cache Holds vales for 30 min to stop query abuse. Used
 * for static data to increase performance and reduce db hits.
 *
 * @author Administrator
 *
 * @version $Revision: 1.0 $
 */

@Singleton
public class ApiLongCacheManager {

	/** The cache manager. */
	@Inject
	private ApiCacheManager cacheManager;

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	/**
	 * Instantiates a new api long cache manager.
	 */
	public ApiLongCacheManager() {

	}

	/**
	 * Gets the cache.
	 *
	 * 
	
	 * @return the cache */
	public Cache<String, Object> getCache() {
		try {
			if (cacheManager != null
					&& cacheManager.getDefaultCacheManager() != null) {
				return cacheManager.getDefaultCacheManager().getCache(
						ApiNamedCache.CACHE_API_LONG.getCacheName());
			} else {
				LOGGER.error("Api Cache Manager or default cache manager is null");
			}
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			e.printStackTrace();
		}
		return null;

	}

}
