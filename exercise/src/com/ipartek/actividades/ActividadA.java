package com.ipartek.actividades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A) Realizar un programa en java que realice la siguiente función: <br>
 * Crear un array de 5 notas que almacenara en formato double. Una vez creado
 * dicho array se rellenaran dichos elementos leyéndolo desde el teclado. Una
 * vez creado el contenido, se calculara la media de las notas así como se
 * mostraran las notas más altas y más bajas de dicho array.
 * 
 * @author HP
 *
 */

public class ActividadA {
	// variables globales
	static Scanner sc = null;
	static ArrayList<Double> notas = new ArrayList<Double>();

	public static void main(String[] args) {
		// variable local
		int contador = 0;
		Double note = 0d;
		do {
			sc = new Scanner(System.in);
			System.out.println("ingresa la nota " + (contador + 1));

			note = Double.parseDouble(sc.nextLine());

			notas.add(note);

			contador = contador + 1;

		} while (contador < 5);
//mostrar las notas
		System.out.println("sus notas son");
		System.out.println(notas);
// calcular la media
		media();
// calcular nota mas baja
		baja();

// calcular nota mas Alta
		alta();

	}// main

	private static void alta() {
		// TODO Auto-generated method stub
		Double max = 0d;

		System.out.println("la nota mas alta es");
		for (double nota : notas) {

			if (max < nota) {
				max = nota;

			}

		}
		System.out.println(max);

	}

	private static void baja() {
		// TODO Auto-generated method stub
		double min = 10;

		System.out.println("la nota mas baja es");
		for (double nota : notas) {
			if (min > nota) {
				min = nota;

			}
		}
		System.out.println(min);

	}

	private static void media() {
		// TODO Auto-generated method stub
		double acumulado = 0;
		double media = 0;

		System.out.println("la media es");
		for (double nota : notas) {

			acumulado = acumulado + nota;

		}
		media = acumulado / notas.size();
		System.out.println(media);

	}

}
