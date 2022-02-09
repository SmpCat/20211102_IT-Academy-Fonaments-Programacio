package model;

public class DTOMecanic extends DTOEmpleat {

	private boolean estudisSuperiors;
	
	public DTOMecanic() {
		
	}

	public DTOMecanic(String nom, String primerCognom, int edat, int antiguitat, boolean estudisSuperiors) {
		super(nom, primerCognom, edat, antiguitat);
		this.estudisSuperiors = estudisSuperiors;
	}

	public boolean isEstudisSuperiors() {
		return estudisSuperiors;
	}

	public void setEstudisSuperiors(boolean estudisSuperiors) {
		this.estudisSuperiors = estudisSuperiors;
	}
	
	@Override
	public String toString() {
		return "Mecanic [estudisSuperiors=" + estudisSuperiors + ", toString()=" + super.toString() + "]";
	}

	public double sou() {
		return SOU_BASE + (PLUS_ANTIGUITAT * antiguitat);
	}
}
