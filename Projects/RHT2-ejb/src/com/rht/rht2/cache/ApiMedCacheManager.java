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
 * Database protection cache Holds vales for 5 min to stop query abuse.
 *
 * @author Administrator
 *
 * @version $Revision: 1.0 $
 */

@Singleton
public class ApiMedCacheManager {

	/** The cache manager. */
	@Inject
	private ApiCacheManager cacheManager;
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	/**
	 * Instantiates a new api med cache manager.
	 */
	public ApiMedCacheManager() {

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
						ApiNamedCache.CACHE_API_MED.getCacheName());
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
