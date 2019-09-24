package it.sisthema.lab.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import it.sisthema.lab.beans.Contact;
import it.sisthema.lab.dao.ContactDao;

@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from contacts", Integer.class);
    }

    @Override
    public int save(Contact contact) {
        return jdbcTemplate.update("insert into contacts (nome, cognome, telefono) values(?,?,?)", contact.getNome(),
                contact.getCognome(), contact.getTelefono());
    }

    @Override
    public int update(Contact contact) {
        return jdbcTemplate.update("update contacts set nome = ?, cognome = ?, telefono = ? where id = ?",
                contact.getNome(), contact.getCognome(), contact.getTelefono(), contact.getId());
    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("delete contacts where id = ?", id);
    }

    @Override
    public List<Contact> findAll() {
        return jdbcTemplate.query("select * from contacts", (rs, rowNum) -> new Contact(rs.getLong("id"),
                rs.getString("nome"), rs.getString("cognome"), rs.getString("telefono")));
    }

    @Override
    public Contact findById(Long id) {
        return (Contact) jdbcTemplate.queryForObject("select * from contacts where id = ?", new Object[] { id },
                (rs, rowNum) -> new Contact(rs.getLong("id"), rs.getString("nome"), rs.getString("cognome"),
                        rs.getString("telefono")));
    }

}