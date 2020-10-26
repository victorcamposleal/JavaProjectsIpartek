package com.ipartek.estructuras.repetitivas;

/**
 * Mostrar con bucles for anidados las tablas de multiplicar del 0 al 10
 * 
 * @author HP
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			for (int j = 0; j <= 10; j++) {

				System.out.println(" the result of " + j + " x " + i + " = " + (j) * i);
			}

		}

	}

}
