package it.sisthema.lab.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import it.sisthema.lab.beans.CategoriaDocumento;
import it.sisthema.lab.dao.CategoriaDocumentoDao;

public class CategoriaDocumentoDaoImpl implements CategoriaDocumentoDao {
	

	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	    @Override
	    public int count() {
	        return jdbcTemplate.queryForObject("select count(*) from documents", Integer.class);
	    }

	    @Override
	    public int save(CategoriaDocumento documento) {
	        return jdbcTemplate.update("insert into documents (categoria, descrizione) values(?,?)", documento.getCategoria(),
	                documento.getDescrizione());
	    }

	    @Override
	    public int update(CategoriaDocumento documento) {
	        return jdbcTemplate.update("update documents set categoria = ?, descrizione = ?",
	        		documento.getCategoria(), documento.getDescrizione());
	    }

	    @Override
	    public int deleteById(Long id) {
	        return jdbcTemplate.update("delete documents where id = ?", id);
	    }

	    @Override
	    public List<CategoriaDocumento> findAll() {
	        return jdbcTemplate.query("select * from documents", (rs, rowNum) -> new CategoriaDocumento(rs.getLong("id"), rs.getString("categoria"), rs.getString("descrizione")));
	    }

	    @Override
	    public CategoriaDocumento findById(Long id) {
	        return (CategoriaDocumento) jdbcTemplate.queryForObject("select * from documents where id = ?", new Object[] { id },
	                (rs, rowNum) -> new CategoriaDocumento(rs.getLong("id"), rs.getString("categoria"), rs.getString("descrizione")));
	    }


}
