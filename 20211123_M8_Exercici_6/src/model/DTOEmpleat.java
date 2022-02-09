package model;

public abstract class DTOEmpleat {
	
	private String nom;
	private String primerCognom;
	private int edat;
	protected int antiguitat;

	protected static final double SOU_BASE = 50000;
	protected static final double PLUS_ANTIGUITAT = 10000;
	
	public DTOEmpleat() {
		
	}

	public DTOEmpleat(String nom, String primerCognom, int edat, int antiguitat) {
		this.nom = nom;
		this.primerCognom = primerCognom;
		this.edat = edat;
		this.antiguitat = antiguitat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrimerCognom() {
		return primerCognom;
	}

	public void setPrimerCognom(String primerCognom) {
		this.primerCognom = primerCognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public int getAntiguitat() {
		return antiguitat;
	}

	public void setAntiguitat(int antiguitat) {
		this.antiguitat = antiguitat;
	}

	public static double getSouBase() {
		return SOU_BASE;
	}
	
	@Override
	public String toString() {
		return "Treballador [nom=" + nom + ", primerCognom=" + primerCognom + ", edat=" + edat + ", antiguitat="
				+ antiguitat + "]";
	}

	public abstract double sou();

}
