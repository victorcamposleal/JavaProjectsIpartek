package com.ipartek.ejercicios.abstracta;

public abstract class ObjetoGrafico {

	int x;
	int y;

	void mover(int x, int y) {

		this.x = x;
		this.y = y;

	}

	/**
	 * Todavia no se como lo van hacer mis hijos, pero les voy a obligar. <br>
	 * Por eso declaramos abstract el metodo y la clase.
	 */
	abstract void dibujar();

}
