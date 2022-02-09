package cat.ajbarcelona.fdpl;

public class Punt {

	private int posicioX;
	private int posicioY;
	
	public Punt() {
		
	}
	
	public Punt(int posicioX, int posicioY) {
		this.posicioX = posicioX;
		this.posicioY = posicioY;
	}

	public int getPosicioX() {
		return posicioX;
	}

	public void setPosicioX(int posicioX) {
		this.posicioX = posicioX;
	}

	public int getPosicioY() {
		return posicioY;
	}

	public void setPosicioY(int posicioY) {
		this.posicioY = posicioY;
	}

	@Override
	public String toString() {
		return "Punt [posicioX=" + posicioX + ", posicioY=" + posicioY + "]";
	}	
	
}
