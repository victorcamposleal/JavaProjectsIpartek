package com.ipartek.apps.cartas;

import java.util.ArrayList;

public class BarajaPoker extends Baraja {

	static final int NUM_PALOS[] = { 1, 2, 3, 4 };
	static final String NOMBRES_PALOS[] = { "Trebol", "Espadas", "Corazones", "diamantes" };

//EL OBJETO DE

	ArrayList<Carta> mazo = getMazo();

	@Override
	void crear() {

		for (int i = 0; i < NOMBRES_PALOS.length; i++) {

			Palo p = new Palo(NUM_PALOS[i], NOMBRES_PALOS[i]);

			for (int j = 1; j <= 13; j++) {

				mazo.add(new Carta(p, j));

			}
		}

		setMazo(mazo);

	}

}
