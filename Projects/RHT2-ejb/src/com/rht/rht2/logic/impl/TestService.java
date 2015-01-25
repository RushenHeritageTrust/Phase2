package com.rht.rht2.logic.impl;

import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.rht.rht2.dao.impl.AccountstatusHome;
import com.rht.rht2.entities.Accountstatus;

@ApplicationScoped
@Singleton
public class TestService {

	@Inject
	AccountstatusHome accountStatusDao;

	public Accountstatus addAccountstatus() {
		Accountstatus p = new Accountstatus();

		accountStatusDao.persist(p);
		return p;
	}

	public void updateAccountstatus(Accountstatus accountstatus) {

		accountStatusDao.merge(accountstatus);
	}

	public void deleteAccountstatus(Accountstatus accountstatus) {

		accountStatusDao.remove(accountstatus);
	}

}
