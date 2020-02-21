package no.hvl.dat109;

enum Utleiegruppe{
	A, B, C, D;  // A = liten bil, B = mellomstor bil, C = stor bil, D = stasjonsvogn 
}

public class Bil {
	private Integer registreringsNr;
	private String merke;
	private String modell;
	private String farge;
	private Utleiegruppe utleiegruppe;
	private boolean ledig;
	
	public Bil(Integer registreringsNr, String merke, String modell, String farge, Utleiegruppe utleiegruppe, boolean ledig) {
		this.registreringsNr = registreringsNr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.utleiegruppe = utleiegruppe;
		this.ledig = ledig;
	}

	public Integer getRegistreringsNr() {
		return registreringsNr;
	}

	public void setRegistreringsNr(Integer registreringsNr) {
		this.registreringsNr = registreringsNr;
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public Utleiegruppe getUtleiegruppe() {
		return utleiegruppe;
	}

	public void setUtleiegruppe(Utleiegruppe utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}

	public boolean isLedig() {
		return ledig;
	}

	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}
	
}
