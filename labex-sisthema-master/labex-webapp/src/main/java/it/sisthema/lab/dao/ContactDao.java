package it.sisthema.lab.dao;

import java.util.List;

import it.sisthema.lab.beans.Contact;

public interface ContactDao {

    int count();

    int save(Contact contact);

    int update(Contact contact);

    int deleteById(Long id);

    List<Contact> findAll();

    Contact findById(Long id);

}