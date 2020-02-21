package no.hvl.dat109;

public class Utleiekontor {

		private int kontorNr;
		private String adresse;
		private int telefonNr;
		
		public Utleiekontor(int kontorNr, String adresse, int telefonNr) {
			this.kontorNr = kontorNr;
			this.adresse = adresse;
			this.telefonNr = telefonNr;
		}

		public int getKontorNr() {
			return kontorNr;
		}

		public void setKontorNr(int kontorNr) {
			this.kontorNr = kontorNr;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public int getTelefonNr() {
			return telefonNr;
		}

		public void setTelefonNr(int telefonNr) {
			this.telefonNr = telefonNr;
		}
		
		
}
