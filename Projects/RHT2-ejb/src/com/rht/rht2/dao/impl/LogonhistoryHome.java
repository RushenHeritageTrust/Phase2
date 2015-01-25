package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Logonhistory;

/**
 * Home object for domain model class Logonhistory.
 *
 * @see com.rht.rht2.entities.Logonhistory
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class LogonhistoryHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(LogonhistoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Logonhistory */
	public Logonhistory findById(Integer id) {
		log.debug("getting Logonhistory instance with id: " + id);
		try {
			Logonhistory instance = entityManager.find(Logonhistory.class, id);
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
	 *            Logonhistory
	
	 * @return Logonhistory */
	public Logonhistory merge(Logonhistory detachedInstance) {
		log.debug("merging Logonhistory instance");
		try {
			Logonhistory result = entityManager.merge(detachedInstance);
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
	 *            Logonhistory
	 */
	public void persist(Logonhistory transientInstance) {
		log.debug("persisting Logonhistory instance");
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
	 *            Logonhistory
	 */
	public void remove(Logonhistory persistentInstance) {
		log.debug("removing Logonhistory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
