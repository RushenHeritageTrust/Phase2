/*
 *
 */
package com.rht.rht2.cache;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.infinispan.Cache;
import org.infinispan.manager.EmbeddedCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rht.rht2.enums.ApiNamedCache;

// TODO: Auto-generated Javadoc
/**
 * Database protection cache Holds vales for 1 min to stop query abuse.
 *
 * @author Administrator
 *
 * @version $Revision: 1.0 $
 */

@Singleton
public class ApiShortCacheManager {

	/** The cache manager. */
	@Inject
	private ApiCacheManager cacheManager;

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	/**
	 * Instantiates a new api short cache manager.
	 */
	public ApiShortCacheManager() {

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
						ApiNamedCache.CACHE_API_SHORT.getCacheName());
			} else {
				LOGGER.error("Api Cache Manager or default cache manager is null");
			}
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Gets the cache manager.
	 *
	 * 
	
	 * @return the cache manager */
	public EmbeddedCacheManager getCacheManager() {

		try {
			if (cacheManager != null
					&& cacheManager.getDefaultCacheManager() != null) {
				return cacheManager.getDefaultCacheManager();
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
