package com.rht.rht2.web;

import com.rht.rht2.entities.Accountstatus;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

public class RHTcontainers {

	public static String PERSISTENCE_NAME = "RHT2-ejb";

	private static RHTcontainers INSTANCE;

	private static JPAContainer<Accountstatus> accountStatusContainer;

	public static RHTcontainers getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new RHTcontainers();
		}
		return INSTANCE;

	}

	private RHTcontainers() {
		getAccountStatusContainer();

	}

	public JPAContainer<Accountstatus> getAccountStatusContainer() {
		if (accountStatusContainer == null) {
			accountStatusContainer = JPAContainerFactory.make(
					Accountstatus.class, PERSISTENCE_NAME);
		}
		return accountStatusContainer;
	}

}
