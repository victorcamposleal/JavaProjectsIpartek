package com.ipartek.apps.cartas;

public class Ejercicio {

	public static void main(String[] args) {
		BarajaPoker bj = new BarajaPoker();
		bj.crear();
		bj.mostrar();
		bj.barajar();
		bj.ordenarNumero();

		BarajaSpanish bs = new BarajaSpanish();
		bs.crear();
		bs.mostrarsp();
		bs.barajarsp();

	}

}
