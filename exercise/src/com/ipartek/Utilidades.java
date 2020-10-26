package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

/**
 * Here we will have the logic of behind the DNI calculator
 * 
 * @author HP
 *
 */

public class Utilidades implements Funciones {

	static public char calculateLetter(String numeros) throws Exception {

		char letterDni[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		if (numeros == null) {
// lanzamos la excpecion
			throw new Exception("los numeros del dni no pueden ser null");

		}

		if (numeros.length() != 8) {
//lanzamos la excepTion
			throw new Exception("el dni debe de tener una longitud de 8");

		}

		int calculoDni = Integer.parseInt(numeros) % 23;

		return (letterDni[calculoDni]);

	}

	@Override
	public String pedirNombre() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce tu nombre");
		String nombre = sc.nextLine();
		sc.close();
		if (nombre.length() <= 1) {
			throw new Exception("El nombre no puede ser menor a un caracter");

		}

		return nombre;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {
		// TODO Auto-generated method stub

		if (tipoLoteria == LOTERIA_EUROMILLON) {
			System.out.println("You pick Euromillon");

		}

		if (tipoLoteria == LOTERIA_QUINIELA) {

			System.out.println("You pick Quiniela");

		}
		if (tipoLoteria == LOTERIA_BONOLOTO) {
			System.out.println("You pick BonoLoto");
		}

		if (tipoLoteria != LOTERIA_EUROMILLON && tipoLoteria != LOTERIA_QUINIELA && tipoLoteria != LOTERIA_BONOLOTO) {

			throw new Exception("that Lottery kdosent exsist");

		}

	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {
		float vuelta = dineroEntregado - precioProducto;

		if (precioProducto > dineroEntregado) {

			throw new Exception("te falta dinero");

		}

		return vuelta;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		// TODO Auto-generated method stub

		Serie serie = new Serie();
		Scanner sc = new Scanner(System.in);

		return serie;
	}

}
