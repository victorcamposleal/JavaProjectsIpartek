package com.ipartek;

public class ProbarFunciones {
//variable Global

	public static void main(String args[]) throws Exception {
		Utilidades util = new Utilidades();

		boolean isError = true;

//probando los nombres
		do {
			try {
				String nombre = util.pedirNombre();
				System.out.println(nombre);
				isError = false;
			}

			catch (Exception e) {

				System.out.println(e.getMessage());

			}
		} while (isError);

		System.out.println("Terminamos programa nombre.");
//probando la loteria
		int opcion = 3;
		try {
			util.imprimirNumeroLoteria(opcion);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		System.out.println("Terminamos programa Loteria.");

		// Probando programa vueltas

		float dinero = 800f;
		float precio = 90f;
		float vuelta = util.calcularVueltas(dinero, precio);
		System.out.println(vuelta);

		System.out.println("Terminamos programa vuelta.");
	}

}
