package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Meta;

/**
 * Home object for domain model class Meta.
 *
 * @see com.rht.rht2.entities.Meta
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class MetaHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(MetaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Meta */
	public Meta findById(Integer id) {
		log.debug("getting Meta instance with id: " + id);
		try {
			Meta instance = entityManager.find(Meta.class, id);
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
	 *            Meta
	
	 * @return Meta */
	public Meta merge(Meta detachedInstance) {
		log.debug("merging Meta instance");
		try {
			Meta result = entityManager.merge(detachedInstance);
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
	 *            Meta
	 */
	public void persist(Meta transientInstance) {
		log.debug("persisting Meta instance");
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
	 *            Meta
	 */
	public void remove(Meta persistentInstance) {
		log.debug("removing Meta instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
