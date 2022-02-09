package cat.ajbarcelona.fdpl;

public class Alumne {
	
	private String nom;
	private byte edat;
	private boolean titolUniversitari;
	private boolean atur;
	
	public Alumne() {
	
	}
	
	public Alumne(String nom, byte edat, boolean titolUniversitari, boolean atur) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.titolUniversitari = titolUniversitari;
		this.atur = atur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public byte getEdat() {
		return edat;
	}

	public void setEdat(byte edat) {
		this.edat = edat;
	}

	public boolean isTitolUniversitari() {
		return titolUniversitari;
	}

	public void setTitolUniversitari(boolean titolUniversitari) {
		this.titolUniversitari = titolUniversitari;
	}

	public boolean isAtur() {
		return atur;
	}

	public void setAtur(boolean atur) {
		this.atur = atur;
	}

	@Override
	public String toString() {
		return "Alumne [nom=" + nom + ", edat=" + edat + ", titolUniversitari=" + titolUniversitari + ", atur=" + atur
				+ "]";
	}

}
