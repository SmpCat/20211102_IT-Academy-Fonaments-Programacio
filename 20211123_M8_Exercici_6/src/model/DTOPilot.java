package model;

public class DTOPilot extends DTOEmpleat {
	
	private int estatura;
	private int pes;
	
	private static final double PLUS_PERILLOSITAT = 50000;
	
	public DTOPilot() {
		
	}

	public DTOPilot(String nom, String primerCognom, int edat, int antiguitat, int estatura, int pes) {
		super(nom, primerCognom, edat, antiguitat);
		this.estatura = estatura;
		this.pes = pes;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public int getPes() {
		return pes;
	}

	public void setPes(int pes) {
		this.pes = pes;
	}

	public static double getPlusPerillositat() {
		return PLUS_PERILLOSITAT;
	}

	@Override
	public String toString() {
		return "Pilot [estatura=" + estatura + ", pes=" + pes + ", toString()=" + super.toString() + "]";
	}

	public double sou() {
		return SOU_BASE + (PLUS_ANTIGUITAT * antiguitat) + PLUS_PERILLOSITAT;
	}
}
