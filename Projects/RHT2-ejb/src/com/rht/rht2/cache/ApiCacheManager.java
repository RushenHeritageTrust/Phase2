/*
 *
 */
package com.rht.rht2.cache;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rht.rht2.enums.ApiNamedCache;

// TODO: Auto-generated Javadoc
/**
 * This class ensures that we only ever create one cache manager.
 *
 * @author Administrator
 *
 * @version $Revision: 1.0 $
 */

@ApplicationScoped
public class ApiCacheManager {

	/** The cache manager. */
	private EmbeddedCacheManager cacheManager;

	/** The config xml. */
	private final String CONFIG_XML = "META-INF/infinispan.xml";

	/** The logger. */
	private final Logger LOGGER = LoggerFactory
			.getLogger(ApiCacheManager.class);

	/**
	 * Instantiates a new api cache manager.
	 */
	public ApiCacheManager() {

	}

	/**
	 * Flush cache.
	 *
	 * @param cache
	 *            the cache
	 */
	public void flushCache(ApiNamedCache cache) {
		try {
			if (getDefaultCacheManager().getCache(cache.getCacheName()) != null) {
				getDefaultCacheManager().getCache(cache.getCacheName()).clear();
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the default cache manager.
	 *
	 * 
	
	 * @return the default cache manager */
	public EmbeddedCacheManager getDefaultCacheManager() {
		return cacheManager;
	}

	/**
	 * Inits the.
	 */
	@PostConstruct
	public void init() {
		try {
			if (cacheManager == null) {
				cacheManager = new DefaultCacheManager(CONFIG_XML);
			} else {
				LOGGER.info("Cache manager already created.");
			}
		} catch (final IOException e) {
			// restart infinispan if not cleanly shutdown
			e.printStackTrace();
			try {
				LOGGER.info("Restarting Infinispan CacheManager..");
				if (cacheManager != null) {
					cacheManager.stop();
				}

				cacheManager = new DefaultCacheManager(CONFIG_XML);
			} catch (final IOException ioe) {
				ioe.printStackTrace();
			}

		}
	}

}
