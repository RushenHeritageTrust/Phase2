package com.rht.rht2.logic.impl;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rht.rht2.entities.Accountstatus;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.provider.CachingLocalEntityProvider;

public class AccountStatusContainer extends JPAContainer<Accountstatus> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager em;

	public AccountStatusContainer() {
		super(Accountstatus.class);
	}

	// public void filterByPresentation(Presentation presentation) {
	// removeAllContainerFilters();
	// addContainerFilter(new Compare.Equal("presentation", presentation));
	// }

	@PostConstruct
	void init() {
		setEntityProvider(new CachingLocalEntityProvider<>(Accountstatus.class,
				em));
	}

}
