package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Assets;

/**
 * Home object for domain model class Assets.
 *
 * @see com.rht.rht2.entities.Assets
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class AssetsHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(AssetsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Assets */
	public Assets findById(Integer id) {
		log.debug("getting Assets instance with id: " + id);
		try {
			Assets instance = entityManager.find(Assets.class, id);
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
	 *            Assets
	
	 * @return Assets */
	public Assets merge(Assets detachedInstance) {
		log.debug("merging Assets instance");
		try {
			Assets result = entityManager.merge(detachedInstance);
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
	 *            Assets
	 */
	public void persist(Assets transientInstance) {
		log.debug("persisting Assets instance");
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
	 *            Assets
	 */
	public void remove(Assets persistentInstance) {
		log.debug("removing Assets instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
