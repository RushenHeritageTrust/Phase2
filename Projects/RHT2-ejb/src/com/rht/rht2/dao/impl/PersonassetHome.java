package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Personasset;

/**
 * Home object for domain model class Personasset.
 *
 * @see com.rht.rht2.entities.Personasset
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class PersonassetHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(PersonassetHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Personasset */
	public Personasset findById(Integer id) {
		log.debug("getting Personasset instance with id: " + id);
		try {
			Personasset instance = entityManager.find(Personasset.class, id);
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
	 *            Personasset
	
	 * @return Personasset */
	public Personasset merge(Personasset detachedInstance) {
		log.debug("merging Personasset instance");
		try {
			Personasset result = entityManager.merge(detachedInstance);
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
	 *            Personasset
	 */
	public void persist(Personasset transientInstance) {
		log.debug("persisting Personasset instance");
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
	 *            Personasset
	 */
	public void remove(Personasset persistentInstance) {
		log.debug("removing Personasset instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
