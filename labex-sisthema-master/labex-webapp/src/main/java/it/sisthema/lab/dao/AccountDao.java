package it.sisthema.lab.dao;

import java.util.List;

import it.sisthema.lab.beans.Account;

public interface AccountDao {

	 int count();

	    int save(Account account);

	    int update(Account account);

	    int deleteById(Long id);

	    List<Account > findAll();

	    Account findById(Long id);

}
