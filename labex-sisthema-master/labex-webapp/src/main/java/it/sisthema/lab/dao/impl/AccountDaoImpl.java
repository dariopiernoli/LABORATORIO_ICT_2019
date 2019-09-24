package it.sisthema.lab.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import it.sisthema.lab.beans.Account;
import it.sisthema.lab.dao.AccountDao;

public class AccountDaoImpl implements AccountDao{
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	    @Override
	    public int count() {
	        return jdbcTemplate.queryForObject("select count(*) from accounts", Integer.class);
	    }

	    @Override
	    public int save(Account account) {
	        return jdbcTemplate.update("insert into accounts (nome, cognome, telefono) values(?,?,?)", account.getNome(),
	                account.getCognome(), account.getCf(), account.getDenominazione(), account.getPiva());
	    }

	    @Override
	    public int update(Account account) {
	        return jdbcTemplate.update("update accounts set nome = ?, cognome = ?, telefono = ? where id = ?",
	                account.getNome(), account.getCognome(), account.getCf(), account.getDenominazione(), account.getPiva(), account.getId());
	    }

	    @Override
	    public int deleteById(Long id) {
	        return jdbcTemplate.update("delete accounts where id = ?", id);
	    }

	    @Override
	    public List<Account> findAll() {
	        return jdbcTemplate.query("select * from accounts", (rs, rowNum) -> new Account(rs.getLong("id"),
	                rs.getString("nome"), rs.getString("cognome"), rs.getString("cf"), rs.getString("denominazione"), rs.getString("piva")));
	    }

	    @Override
	    public Account findById(Long id) {
	        return (Account) jdbcTemplate.queryForObject("select * from accounts where id = ?", new Object[] { id },
	                (rs, rowNum) -> new Account(rs.getLong("id"), rs.getString("nome"), rs.getString("cognome"),
	                		 rs.getString("cf"), rs.getString("denominazione"), rs.getString("piva")));
	    }


}
