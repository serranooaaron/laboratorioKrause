package com.laboratorio;

public class Bicicleta {

	private int ruedas;
	private int asientos;
	private String nombre;

	public Bicicleta(int ruedas, int asientos, String nombre) {
		this.ruedas = ruedas;
		this.asientos = asientos;
		this.nombre = nombre;
	}
	
	public int getRuedas() {
		return this.ruedas ;
	}
	public int getAsientos() {
		return this.asientos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String toString() {
		return "Bicicleta: [Ruedas=" + ruedas + ", Asientos=" + asientos + ", Nombre=" + nombre + "]";
	}
}
