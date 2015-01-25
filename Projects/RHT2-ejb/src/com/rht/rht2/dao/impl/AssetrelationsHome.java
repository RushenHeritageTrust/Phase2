package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Assetrelations;

/**
 * Home object for domain model class Assetrelations.
 *
 * @see com.rht.rht2.entities.Assetrelations
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class AssetrelationsHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(AssetrelationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Assetrelations */
	public Assetrelations findById(Integer id) {
		log.debug("getting Assetrelations instance with id: " + id);
		try {
			Assetrelations instance = entityManager.find(Assetrelations.class,
					id);
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
	 *            Assetrelations
	
	 * @return Assetrelations */
	public Assetrelations merge(Assetrelations detachedInstance) {
		log.debug("merging Assetrelations instance");
		try {
			Assetrelations result = entityManager.merge(detachedInstance);
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
	 *            Assetrelations
	 */
	public void persist(Assetrelations transientInstance) {
		log.debug("persisting Assetrelations instance");
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
	 *            Assetrelations
	 */
	public void remove(Assetrelations persistentInstance) {
		log.debug("removing Assetrelations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
