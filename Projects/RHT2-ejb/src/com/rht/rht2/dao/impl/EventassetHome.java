package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Eventasset;

/**
 * Home object for domain model class Eventasset.
 *
 * @see com.rht.rht2.entities.Eventasset
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class EventassetHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(EventassetHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Eventasset */
	public Eventasset findById(Integer id) {
		log.debug("getting Eventasset instance with id: " + id);
		try {
			Eventasset instance = entityManager.find(Eventasset.class, id);
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
	 *            Eventasset
	
	 * @return Eventasset */
	public Eventasset merge(Eventasset detachedInstance) {
		log.debug("merging Eventasset instance");
		try {
			Eventasset result = entityManager.merge(detachedInstance);
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
	 *            Eventasset
	 */
	public void persist(Eventasset transientInstance) {
		log.debug("persisting Eventasset instance");
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
	 *            Eventasset
	 */
	public void remove(Eventasset persistentInstance) {
		log.debug("removing Eventasset instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
