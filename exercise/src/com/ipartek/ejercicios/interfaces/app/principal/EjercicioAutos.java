package com.ipartek.ejercicios.interfaces.app.principal;

import com.ipartek.ejercicios.interfaces.app.clases.Patinete;

public class EjercicioAutos {
	public static void main(String[] args) {

		Patinete patin = new Patinete();
		patin.isEstaArrancado();
		patin.arrancar();
		patin.Acelerar(1);
		patin.Acelerar(200);
		patin.Frenar(5);
		patin.Frenar(26);
		try {
			patin.apagar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(patin);

	}

}
