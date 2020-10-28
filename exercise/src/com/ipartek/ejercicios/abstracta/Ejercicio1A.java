package com.ipartek.ejercicios.abstracta;

public class Ejercicio1A {

	public static void main(String[] args) {

		// No se pueden instanciar objetos de una clase abstract
		// ObjetoGrafico og = new ObjetoGrafico();

		LineaColor lc1 = new LineaColor();

		// No se pueden instanciar objetos de una clase abstract
		// Rectangulo r = new Rectangulo();
		RectanuloColor rc = new RectanuloColor();

		// todos usan el metodo implementado en ObjetoGrafico

		lc1.mover(45, 88);
		rc.mover(78, 100);

		// cada uno tiene si propio metodo implementado

		lc1.dibujar();
		rc.dibujar();

	}

}
