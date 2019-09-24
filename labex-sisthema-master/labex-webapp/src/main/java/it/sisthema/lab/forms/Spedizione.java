package it.sisthema.lab.forms;

import java.io.Serializable;

public class Spedizione implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	private Long id;
	private String spedizione;
	private String descrizione;

}
