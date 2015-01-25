package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Media;

/**
 * Home object for domain model class Media.
 *
 * @see com.rht.rht2.entities.Media
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class MediaHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(MediaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Media */
	public Media findById(Integer id) {
		log.debug("getting Media instance with id: " + id);
		try {
			Media instance = entityManager.find(Media.class, id);
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
	 *            Media
	
	 * @return Media */
	public Media merge(Media detachedInstance) {
		log.debug("merging Media instance");
		try {
			Media result = entityManager.merge(detachedInstance);
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
	 *            Media
	 */
	public void persist(Media transientInstance) {
		log.debug("persisting Media instance");
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
	 *            Media
	 */
	public void remove(Media persistentInstance) {
		log.debug("removing Media instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
