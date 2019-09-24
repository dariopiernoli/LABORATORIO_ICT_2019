package it.sisthema.lab.dao;

import java.util.List;

import it.sisthema.lab.beans.Spedizione;

public interface SpedizioneDao {
	int count();

    int save(Spedizione spedizione);

    int update(Spedizione spedizione);

    int deleteById(Long id);

    List<Spedizione > findAll();

    Spedizione findById(Long id);

}
