package com.ipartek.actividades;

import java.util.Scanner;

/**
 * B) Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <li>Calcular la letra del dni
 * <li>Calcular medida de cm a pulgadas
 * <li>Salir <br>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 * 
 * @author HP
 *
 */
public class ActividadB {
//variables Globales
	static Scanner sc = null;
	static String option = "";

	// locales variables
//option dni
	private static final String OPTION_ID = "1";
//option pulgadas
	private static final String OPTION_P = "2";
//option Salir	
	private static final String OPTION_OU = "S";
//Boolean to conitnue asking	
	private static boolean repeat = false;

	public static void main(String[] args) {
		System.out.println("Hola bienvenido a la APP");
		sc = new Scanner(System.in);
		do {
			iniciarMenu();
			switch (option) {
			case OPTION_ID:
				calcularDni();
				break;

			case OPTION_P:
				calcularMedida();
				break;

			case OPTION_OU:
				System.out.println("**************bye*************");
				repeat = true;

				break;

			default:
				System.out.println("Por favor selecciona correctamente");
				break;
			}

		} while (!repeat);
	}// main

	// metodos

	private static void calcularMedida() {
		// TODO Auto-generated method stub
		// Declaramos la variable isError
		boolean isError = true;
		do {
			try {
				System.out.println("Ingrese la medida en cm que quiere calcular");
				double medida = Double.parseDouble(sc.nextLine());
				double pulgadas = medida / 2.54d;
				System.out.println("la medida en pulgadas es: " + pulgadas);
				isError = false;
			} catch (Exception e) {
				System.out.println("Tiene que ser un numero ");
				isError = true;

			}
		} while (isError);

	}

	private static void calcularDni() {
		// TODO
		boolean isError = true;
		do {
			System.out.println("Ingrese los numeros del DNI");
			String numeros = sc.nextLine();
			try {
				String calculaDni = Utilities.calculoletra(numeros);
				System.out.println(calculaDni);
				isError = false;
			} catch (Exception e) {

				System.out.println(e.getMessage());

			}
		} while (isError);

	}

	private static void iniciarMenu() {

		System.out.println("************************************");
		System.out.println(" 1.- Calcular el dni");
		System.out.println(" 2.-Convertir medida de cm a pulgadas");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		option = sc.nextLine();
	}

}
