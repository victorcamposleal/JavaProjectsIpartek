package com.ipartek.pojo;

/**
 * este objeto se utilizara en ejercicios de lista
 * 
 * @author HP
 *
 */
public class Jugador {

	// atributos
	private String nombre;
	private int dorsal;

	// constructor por defecto
	public Jugador() {
		super();
		this.nombre = "";
		this.dorsal = 0;

	}

//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + "]";
	}

}
