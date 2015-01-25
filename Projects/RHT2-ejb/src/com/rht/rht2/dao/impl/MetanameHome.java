package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Metaname;

/**
 * Home object for domain model class Metaname.
 *
 * @see com.rht.rht2.entities.Metaname
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class MetanameHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(MetanameHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Metaname */
	public Metaname findById(Integer id) {
		log.debug("getting Metaname instance with id: " + id);
		try {
			Metaname instance = entityManager.find(Metaname.class, id);
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
	 *            Metaname
	
	 * @return Metaname */
	public Metaname merge(Metaname detachedInstance) {
		log.debug("merging Metaname instance");
		try {
			Metaname result = entityManager.merge(detachedInstance);
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
	 *            Metaname
	 */
	public void persist(Metaname transientInstance) {
		log.debug("persisting Metaname instance");
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
	 *            Metaname
	 */
	public void remove(Metaname persistentInstance) {
		log.debug("removing Metaname instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
