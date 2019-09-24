package it.sisthema.lab.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import it.sisthema.lab.beans.Spedizione;
import it.sisthema.lab.dao.SpedizioneDao;

public class SpedizioneDaoImpl implements SpedizioneDao{
	

	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	    @Override
	    public int count() {
	        return jdbcTemplate.queryForObject("select count(*) from spedizioni", Integer.class);
	    }

	    @Override
	    public int save(Spedizione spedizione) {
	        return jdbcTemplate.update("insert into spedizioni (spedizione, descrizione) values(?,?)", spedizione.getSpedizione(),
	        		spedizione.getDescrizione());
	    }

	    @Override
	    public int update(Spedizione spedizione) {
	        return jdbcTemplate.update("update documents set categoria = ?, descrizione = ?",
	        		spedizione.getSpedizione(), spedizione.getDescrizione());
	    }

	    @Override
	    public int deleteById(Long id) {
	        return jdbcTemplate.update("delete spedizioni where id = ?", id);
	    }

	    @Override
	    public List<Spedizione> findAll() {
	        return jdbcTemplate.query("select * from spedizioni", (rs, rowNum) -> new Spedizione(rs.getLong("id"), rs.getString("spedizione"), rs.getString("descrizione")));
	    }

	    @Override
	    public Spedizione findById(Long id) {
	        return (Spedizione) jdbcTemplate.queryForObject("select * from spedizioni where id = ?", new Object[] { id },
	                (rs, rowNum) -> new Spedizione(rs.getLong("id"), rs.getString("spedizione"), rs.getString("descrizione")));
	    }


}
