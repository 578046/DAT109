package no.hvl.dat109;

public class Bilutleieselskap {

		private String navn;
		private Integer telefonNr;
		private String firmaAdresse;
		
		public Bilutleieselskap(String navn, Integer telefonNr, String firmaAdresse) {
			this.navn = navn;
			this.telefonNr = telefonNr;
			this.firmaAdresse = firmaAdresse;
		}

		public String getNavn() {
			return navn;
		}

		public void setNavn(String navn) {
			this.navn = navn;
		}

		public Integer getTelefonNr() {
			return telefonNr;
		}

		public void setTelefonNr(Integer telefonNr) {
			this.telefonNr = telefonNr;
		}

		public String getFirmaAdresse() {
			return firmaAdresse;
		}

		public void setFirmaAdresse(String firmaAdresse) {
			this.firmaAdresse = firmaAdresse;
		}
		
		
}
