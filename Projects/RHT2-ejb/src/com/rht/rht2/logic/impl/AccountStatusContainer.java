package com.rht.rht2.logic.impl;

import javax.persistence.EntityManager;

import com.rht.rht2.entities.Accountstatus;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.addon.jpacontainer.provider.CachingLocalEntityProvider;

public class AccountStatusContainer extends JPAContainer<Accountstatus> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// @PersistenceContext
	// EntityManager em;

	public AccountStatusContainer() {
		super(Accountstatus.class);
		EntityManager em = JPAContainerFactory
				.createEntityManagerForPersistenceUnit("RHT2-ejb");
		CachingLocalEntityProvider<Accountstatus> entityProvider = new CachingLocalEntityProvider<>(
				Accountstatus.class, em);
		setEntityProvider(entityProvider);
	}

	// public void filterByPresentation(Presentation presentation) {
	// removeAllContainerFilters();
	// addContainerFilter(new Compare.Equal("presentation", presentation));
	// }

}
