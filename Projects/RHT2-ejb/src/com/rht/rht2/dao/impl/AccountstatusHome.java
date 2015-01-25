package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Accountstatus;

/**
 * Home object for domain model class Accountstatus.
 *
 * @see com.rht.rht2.entities.Accountstatus
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class AccountstatusHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(AccountstatusHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	
	 * @return Accountstatus * @see com.rht.rht2.dao.AccountstatusDAO#findById(Integer) */

	public Accountstatus findById(Integer id) {
		log.debug("getting Accountstatus instance with id: " + id);
		try {
			Accountstatus instance = entityManager
					.find(Accountstatus.class, id);
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
	 *            Accountstatus
	
	
	 * @return Accountstatus * @see com.rht.rht2.dao.AccountstatusDAO#merge(Accountstatus) */

	public Accountstatus merge(Accountstatus detachedInstance) {
		log.debug("merging Accountstatus instance");
		try {
			Accountstatus result = entityManager.merge(detachedInstance);
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
	 *            Accountstatus
	
	 * @see com.rht.rht2.dao.AccountstatusDAO#persist(Accountstatus) */

	public void persist(Accountstatus transientInstance) {
		log.debug("persisting Accountstatus instance");
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
	 *            Accountstatus
	
	 * @see com.rht.rht2.dao.AccountstatusDAO#remove(Accountstatus) */

	public void remove(Accountstatus persistentInstance) {
		log.debug("removing Accountstatus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
