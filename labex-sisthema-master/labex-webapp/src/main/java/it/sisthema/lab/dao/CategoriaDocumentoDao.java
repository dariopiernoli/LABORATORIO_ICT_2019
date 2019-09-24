package it.sisthema.lab.dao;

import java.util.List;

import it.sisthema.lab.beans.CategoriaDocumento;

public interface CategoriaDocumentoDao {
	int count();

    int save(CategoriaDocumento documento);

    int update(CategoriaDocumento documento);

    int deleteById(Long id);

    List<CategoriaDocumento > findAll();

    CategoriaDocumento findById(Long id);


}
