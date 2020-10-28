package com.ipartek.apps.cartas;

import java.util.ArrayList;

public class BarajaSpanish extends Baraja {
	int NUM_PALO[] = { 1, 2, 3, 4 };
	int NUM_carta[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	String NOMBRE_PALO[] = { "oros", "espadas", "copas", "bastos" };

	String NOMBRE_CARTAS[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ" };

	@Override
	void crear() {
		ArrayList<Carta> mazo = getMazo();

		for (int i = 0; i < NOMBRE_PALO.length; i++) {

			Palo p = new Palo(NUM_PALO[i], NOMBRE_PALO[i]);

			for (int j = 0; j < NOMBRE_CARTAS.length; j++) {

				Card c = new Card(NUM_carta[j], NOMBRE_CARTAS[j]);

				mazo.add(new Carta(p, c));

			}
			setMazo(mazo);
		}

	}

}
