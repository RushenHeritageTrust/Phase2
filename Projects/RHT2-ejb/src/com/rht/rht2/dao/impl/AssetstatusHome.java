package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Assetstatus;

/**
 * Home object for domain model class Assetstatus.
 *
 * @see com.rht.rht2.entities.Assetstatus
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class AssetstatusHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(AssetstatusHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Assetstatus */
	public Assetstatus findById(Integer id) {
		log.debug("getting Assetstatus instance with id: " + id);
		try {
			Assetstatus instance = entityManager.find(Assetstatus.class, id);
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
	 *            Assetstatus
	
	 * @return Assetstatus */
	public Assetstatus merge(Assetstatus detachedInstance) {
		log.debug("merging Assetstatus instance");
		try {
			Assetstatus result = entityManager.merge(detachedInstance);
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
	 *            Assetstatus
	 */
	public void persist(Assetstatus transientInstance) {
		log.debug("persisting Assetstatus instance");
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
	 *            Assetstatus
	 */
	public void remove(Assetstatus persistentInstance) {
		log.debug("removing Assetstatus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
