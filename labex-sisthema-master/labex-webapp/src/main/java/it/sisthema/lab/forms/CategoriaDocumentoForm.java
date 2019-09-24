package it.sisthema.lab.forms;

import java.io.Serializable;

public class CategoriaDocumentoForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String categoria;
	private String descrizione;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}
