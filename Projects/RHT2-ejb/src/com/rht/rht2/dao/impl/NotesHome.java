package com.rht.rht2.dao.impl;

// Generated 17-Jan-2015 12:10:08 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rht.rht2.dao.AbstractModuleDAOBean;
import com.rht.rht2.entities.Notes;

/**
 * Home object for domain model class Notes.
 *
 * @see com.rht.rht2.entities.Notes
 * @author Hibernate Tools
 * @version $Revision: 1.0 $
 */
@Stateless
public class NotesHome extends AbstractModuleDAOBean {

	private static final Log log = LogFactory.getLog(NotesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Method findById.
	 *
	 * @param id
	 *            Integer
	
	 * @return Notes */
	public Notes findById(Integer id) {
		log.debug("getting Notes instance with id: " + id);
		try {
			Notes instance = entityManager.find(Notes.class, id);
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
	 *            Notes
	
	 * @return Notes */
	public Notes merge(Notes detachedInstance) {
		log.debug("merging Notes instance");
		try {
			Notes result = entityManager.merge(detachedInstance);
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
	 *            Notes
	 */
	public void persist(Notes transientInstance) {
		log.debug("persisting Notes instance");
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
	 *            Notes
	 */
	public void remove(Notes persistentInstance) {
		log.debug("removing Notes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}
}
