package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Objectasset;

/**
 * Home object for domain model class Objectasset.
 *
 * @see com.rht.rht2.entities.Objectasset
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class ObjectassetHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(ObjectassetHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Objectasset */
	public Objectasset findById(Integer id) {
		log.debug("getting Objectasset instance with id: " + id);
		try {
			Objectasset instance = entityManager.find(Objectasset.class, id);
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
	 *            Objectasset
	
	 * @return Objectasset */
	public Objectasset merge(Objectasset detachedInstance) {
		log.debug("merging Objectasset instance");
		try {
			Objectasset result = entityManager.merge(detachedInstance);
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
	 *            Objectasset
	 */
	public void persist(Objectasset transientInstance) {
		log.debug("persisting Objectasset instance");
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
	 *            Objectasset
	 */
	public void remove(Objectasset persistentInstance) {
		log.debug("removing Objectasset instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
