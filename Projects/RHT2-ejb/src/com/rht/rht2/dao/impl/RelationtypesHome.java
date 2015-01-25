package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Relationtypes;

/**
 * Home object for domain model class Relationtypes.
 *
 * @see com.rht.rht2.entities.Relationtypes
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class RelationtypesHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(RelationtypesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Relationtypes */
	public Relationtypes findById(Integer id) {
		log.debug("getting Relationtypes instance with id: " + id);
		try {
			Relationtypes instance = entityManager
					.find(Relationtypes.class, id);
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
	 *            Relationtypes
	
	 * @return Relationtypes */
	public Relationtypes merge(Relationtypes detachedInstance) {
		log.debug("merging Relationtypes instance");
		try {
			Relationtypes result = entityManager.merge(detachedInstance);
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
	 *            Relationtypes
	 */
	public void persist(Relationtypes transientInstance) {
		log.debug("persisting Relationtypes instance");
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
	 *            Relationtypes
	 */
	public void remove(Relationtypes persistentInstance) {
		log.debug("removing Relationtypes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
