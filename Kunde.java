package no.hvl.dat109;

public class Kunde {
	private String fornavn;
	private String etternavn;
	private String adresse;
	private Integer telefonNr;
	
	
	public Kunde(String fornavn, String etternavn, String adresse, Integer telefonNr) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.adresse = adresse;
		this.telefonNr = telefonNr;
	}
}
