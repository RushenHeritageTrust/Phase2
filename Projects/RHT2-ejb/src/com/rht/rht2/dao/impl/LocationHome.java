package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Location;

/**
 * Home object for domain model class Location.
 *
 * @see com.rht.rht2.entities.Location
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class LocationHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(LocationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Location */
	public Location findById(Integer id) {
		log.debug("getting Location instance with id: " + id);
		try {
			Location instance = entityManager.find(Location.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/**
	 * Method merge.
	 *
	 * @param detachedInstance
	 *            Location
	
	 * @return Location */
	public Location merge(Location detachedInstance) {
		log.debug("merging Location instance");
		try {
			Location result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/**
	 * Method persist.
	 *
	 * @param transientInstance
	 *            Location
	 */
	public void persist(Location transientInstance) {
		log.debug("persisting Location instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	/**
	 * Method remove.
	 *
	 * @param persistentInstance
	 *            Location
	 */
	public void remove(Location persistentInstance) {
		log.debug("removing Location instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
