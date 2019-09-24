package it.sisthema.lab.beans;

import java.io.Serializable;

public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Long id;
    private String nome;
	private String cognome;
	private String denominazione;
	private String cf;
	private String piva;
	
	
	public Account(Long id, String nome, String cognome, String denominazione, String cf, String piva) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.denominazione = denominazione;
		this.cf = cf;
		this.piva = piva;
	}
	
	public Account(String nome, String cognome, String denominazione, String cf, String piva) {
		this.nome = nome;
		this.cognome = cognome;
		this.denominazione = denominazione;
		this.cf = cf;
		this.piva = piva;
	}

	public Account() {
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getDenominazione() {
		return denominazione;
	}
	public String getCf() {
		return cf;
	}
	public String getPiva() {
		return piva;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	

}
