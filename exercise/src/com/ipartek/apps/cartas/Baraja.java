package com.ipartek.apps.cartas;

import java.util.ArrayList;

public abstract class Baraja {
	private ArrayList<Carta> mazo;
//constructor del array List de tipo carta que guarda el mazo

	public Baraja() {
		super();
		this.mazo = new ArrayList<Carta>();
	}

	// getters y setters
	public ArrayList<Carta> getMazo() {

		return mazo;
	}

	public void setMazo(ArrayList<Carta> mazo) {
		this.mazo = mazo;
	}

//metodos para hacer
	/**
	 * Crear todas las cartes necesarias de la Baraja Hija
	 */
	abstract void crear();

	void mostrar() {
		for (Carta carta : getMazo()) {

			System.out.printf("%s de %s  %n", carta.getNumero(), carta.getPalo().getNombre());

		}

		System.out.println("--------------------------------------------------------");
		System.out.println("en total son " + mazo.size() + " cartas");

	}

	void mostrarsp() {
		for (Carta carta : getMazo()) {

			System.out.printf("%s de %s  %n", carta.getCard().getNombre(), carta.getPalo().getNombre());

		}

		System.out.println("--------------------------------------------------------");
		System.out.println("en total son " + mazo.size() + " cartas");

	}

	void ordenarPalo() {
	}

	void ordenarNumero() {

	}

	void barajar() {
	}

}
