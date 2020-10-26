package com.ipartek.ejercicios.listas;

import java.util.ArrayList;

import com.ipartek.pojo.Carta;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja. Para crear
 * dicha lista se creara una clase de tipo carta, que tendrá un número entero
 * para el valor de la carta, así como un string con el palo de la baraja
 * (copas, espadas, oros, bastos). Crear la baraja con las cartas ordenadas por
 * palos, y luego por números. Barajar dicha baraja y mostrar las cartas.
 * 
 * @author Victor campos Leal
 *
 */
public class Ejercicio4 {
	static ArrayList<Carta> cartas = new ArrayList<Carta>();

	public static void main(String args[]) {
		Carta c = new Carta();
		c.setPalo("oros");

		c = new Carta();
		c.setPalo("copas");

		c = new Carta();
		c.setPalo("espadas");

		c = new Carta();
		c.setPalo("bastos");

	}

}
