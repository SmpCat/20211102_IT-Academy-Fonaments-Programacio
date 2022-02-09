package model;

public class Cuenta {
	
	private int numCuenta;
	private int saldo;
	
	public Cuenta() {
		
	}
	
	public Cuenta(int numCuenta, int saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}
	
	public int ingresar(int quantitat) {
		this.saldo = this.saldo + quantitat;
		return saldo;
	}
	
	public int retirar(int quantitat) {
		this.saldo = this.saldo - quantitat;
		return saldo;
	}

}
