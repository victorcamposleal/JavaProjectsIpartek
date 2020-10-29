package com.ipartek.apps.cartas;

import java.util.ArrayList;
import java.util.Collections;

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

		System.out.println(
				"--------------------------------------------------ordena por numeros------------------------------");
		ArrayList<Carta> mazoPornumero = new ArrayList<Carta>();
		int contador = 0;
		do {
			contador = contador + 1;
			for (Carta carta : mazo) {

				if (carta.getNumero() == contador) {
					mazoPornumero.add(carta);
				}
			}
		} while (contador <= 13);

		for (Carta carta : mazoPornumero) {
			System.out.printf("%s de %s  %n", carta.getNumero(), carta.getPalo().getNombre());
		}
		System.out.println("-------------------------------termina------------------------------------------");
	}

	void ordenarNumerosp() {
		ArrayList<Carta> mazoPornumero = new ArrayList<Carta>();

	}

	void barajar() {

		System.out.println("-------------------------------barajea-----------------------------------");
		Collections.shuffle(mazo);
		for (Carta card : mazo) {

			System.out.printf("%s de %s %n", card.getNumero(), card.getPalo().getNombre());
		}
		System.out.println("-------------------------------termina------------------------------------------");

	}

	void barajarsp() {
		System.out.println(
				"---------------------------------barajeamos carta Spanish------------------------------------");
		ArrayList<Carta> mazoBarajedo = new ArrayList<Carta>();

		while (mazo.size() > 0) {
			int index = (int) (Math.random() * mazo.size());
			mazoBarajedo.add(mazo.remove(index));
		}
		for (Carta Cartasp : mazoBarajedo) {

			System.out.printf("%s de %s %n", Cartasp.getCard().getNombre(), Cartasp.getPalo().getNombre());

		}
		System.out.printf("mazo barajeado son %s", mazoBarajedo.size());

		System.out.println("---------------------------------End------------------------------------");

	}
}
