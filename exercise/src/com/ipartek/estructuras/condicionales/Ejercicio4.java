package com.ipartek.estructuras.condicionales;

/**
 * Por favor escoja una opción: • A: calcular área de un triangulo • B: calcular
 * el área de un cuadrado • C: calcular el área de un circulo • D: calcular el
 * área de un pentágono
 * 
 * @author HP
 *
 */
public class Ejercicio4 {
	public static void main(String[] args) {

		String option = "c";
		float base = 35f;
		float altura = 45f;
		float radio = 30f;
		float lado = 34;
		switch (option) {
		case "a":

			System.out.println((base * altura) / 2);

			break;

		case "b":

			System.out.println((base * altura));

			break;

		case "c":

			System.out.println((3.1416 * radio));

			break;

		case "d":

			System.out.println((1 / 4) * Math.sqrt(5 * (5 + 2 * (Math.sqrt(5))) * (lado * lado)));

			break;

		default:
			System.out.println("no haz elegido una option");

			break;

		}

	}

}
