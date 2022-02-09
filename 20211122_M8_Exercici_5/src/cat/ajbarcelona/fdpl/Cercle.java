package cat.ajbarcelona.fdpl;

public class Cercle {

	Punt centre;
	int radi;
	
	public Cercle() {
		
	}

	public Cercle(Punt centre, int radi) {
		this.centre = centre;
		this.radi = radi;
	}

	public Punt getCentre() {
		return centre;
	}

	public void setCentre(Punt centre) {
		this.centre = centre;
	}

	public int getRadi() {
		return radi;
	}

	public void setRadi(int radi) {
		this.radi = radi;
	}

	@Override
	public String toString() {
		return "Cercle [centre=" + centre + ", radi=" + radi + "]";
	}
	
	public double distanciaCentres(Cercle altreCercle) {
		int x1 = this.getCentre().getPosicioX();
		int x2 = altreCercle.getCentre().getPosicioX();
		int y1 = this.getCentre().getPosicioY();
		int y2 = altreCercle.getCentre().getPosicioY();
		
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}
	
	public boolean equals(Cercle altreCercle) {
		if (distanciaCentres(altreCercle) == 0 && this.getRadi() == altreCercle.getRadi()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sonConcentrics(Cercle altreCercle) {
		if (distanciaCentres(altreCercle) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tenenIgualRadi(Cercle altreCercle) {
		if (this.getRadi() == altreCercle.getRadi()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sonTangents(Cercle altreCercle) {
		if (distanciaCentres(altreCercle) == (this.getRadi() + altreCercle.getRadi())) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sonSecants(Cercle altreCercle) {
		if ((distanciaCentres(altreCercle) >= Math.abs(this.getRadi() - altreCercle.getRadi())) &&
		    (distanciaCentres(altreCercle) <= Math.abs(this.getRadi() + altreCercle.getRadi()))) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean noEsToquen(Cercle altreCercle) {
		if (distanciaCentres(altreCercle) > this.getRadi() + altreCercle.getRadi()) {
			return true;
		} else {
			return false;
		}
	}
}
