package com.ipartek.ejercicios.interfaces.app.principal;

import com.ipartek.ejercicios.interfaces.app.clases.Patinete;

public class EjercicioAutos {
	public static void main(String[] args) {

		Patinete patin = new Patinete();
		patin.arracnar();
		patin.Acelerar(1);
		patin.Acelerar(30);
		patin.Frenar(5);
		patin.apagar();

	}

}
