package it.sisthema.lab.beans;

import java.io.Serializable;

public class CategoriaDocumento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String categoria_documento;
	private String descrizione;
	
	public CategoriaDocumento(Long id, String categoria_documento, String descrizione) {
		super();
		this.id = id;
		this.categoria_documento = categoria_documento;
		this.descrizione = descrizione;
	}

	public CategoriaDocumento(String categoria_documento, String descrizione) {
		super();
		this.categoria_documento = categoria_documento;
		this.descrizione = descrizione;
	}

	public CategoriaDocumento() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getCategoria() {
		return categoria_documento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCategoria(String categoria_documento) {
		this.categoria_documento = categoria_documento;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}
