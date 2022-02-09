package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	
	public Cliente() {
		
	}

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta cuenta) {
		this.cuentas.add(cuenta);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
