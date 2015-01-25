package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Metavalue;

/**
 * Home object for domain model class Metavalue.
 *
 * @see com.rht.rht2.entities.Metavalue
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class MetavalueHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(MetavalueHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Metavalue */
	public Metavalue findById(Integer id) {
		log.debug("getting Metavalue instance with id: " + id);
		try {
			Metavalue instance = entityManager.find(Metavalue.class, id);
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
	 *            Metavalue
	
	 * @return Metavalue */
	public Metavalue merge(Metavalue detachedInstance) {
		log.debug("merging Metavalue instance");
		try {
			Metavalue result = entityManager.merge(detachedInstance);
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
	 *            Metavalue
	 */
	public void persist(Metavalue transientInstance) {
		log.debug("persisting Metavalue instance");
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
	 *            Metavalue
	 */
	public void remove(Metavalue persistentInstance) {
		log.debug("removing Metavalue instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
