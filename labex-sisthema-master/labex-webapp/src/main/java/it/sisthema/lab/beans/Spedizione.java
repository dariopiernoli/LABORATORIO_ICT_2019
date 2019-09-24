package it.sisthema.lab.beans;

import java.io.Serializable;

public class Spedizione implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String spedizione;
	private String descrizione;
	
	public Spedizione(String spedizione, String descrizione) {
		super();
		this.spedizione = spedizione;
		this.descrizione = descrizione;
	}

	public Spedizione(Long id, String spedizione, String descrizione) {
		super();
		this.id = id;
		this.spedizione = spedizione;
		this.descrizione = descrizione;
	}

	public Spedizione() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getSpedizione() {
		return spedizione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSpedizione(String spedizione) {
		this.spedizione = spedizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	

}
