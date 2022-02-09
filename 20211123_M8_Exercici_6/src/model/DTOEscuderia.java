package model;

import java.util.List;

public class DTOEscuderia {
	
	private String nom;
	private double pressupost;
	private String pais;
	private List<DTOEmpleat> empleats;
	private List<DTOCotxe> cotxes;
	
	public DTOEscuderia() {
		
	}

	public DTOEscuderia(String nom, double pressupost, String pais, List<DTOEmpleat> empleats, List<DTOCotxe> cotxes) {
		this.nom = nom;
		this.pressupost = pressupost;
		this.pais = pais;
		this.empleats = empleats;
		this.cotxes = cotxes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPressupost() {
		return pressupost;
	}

	public void setPressupost(double pressupost) {
		this.pressupost = pressupost;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<DTOEmpleat> getEmpleats() {
		return empleats;
	}

	public void setEmpleats(List<DTOEmpleat> empleats) {
		this.empleats = empleats;
	}

	public List<DTOCotxe> getCotxes() {
		return cotxes;
	}

	public void setCotxes(List<DTOCotxe> cotxes) {
		this.cotxes = cotxes;
	}

	@Override
	public String toString() {
		return "DTOEscuderia [nom=" + nom + ", pressupost=" + pressupost + ", pais=" + pais + ", empleats=" + empleats
				+ ", cotxes=" + cotxes + "]";
	}
}