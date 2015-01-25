package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Placeasset;

/**
 * Home object for domain model class Placeasset.
 *
 * @see com.rht.rht2.entities.Placeasset
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class PlaceassetHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(PlaceassetHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Placeasset */
	public Placeasset findById(Integer id) {
		log.debug("getting Placeasset instance with id: " + id);
		try {
			Placeasset instance = entityManager.find(Placeasset.class, id);
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
	 *            Placeasset
	
	 * @return Placeasset */
	public Placeasset merge(Placeasset detachedInstance) {
		log.debug("merging Placeasset instance");
		try {
			Placeasset result = entityManager.merge(detachedInstance);
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
	 *            Placeasset
	 */
	public void persist(Placeasset transientInstance) {
		log.debug("persisting Placeasset instance");
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
	 *            Placeasset
	 */
	public void remove(Placeasset persistentInstance) {
		log.debug("removing Placeasset instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
