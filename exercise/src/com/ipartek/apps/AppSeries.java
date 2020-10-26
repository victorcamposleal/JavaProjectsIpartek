package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.SeriesDAOArrayList;
import com.ipartek.pojo.Serie;

/**
 * En esta aplicacion de sries se aplicara el metdo CRUD con una interfaz
 * 
 * @author HP
 *
 */
public class AppSeries {
	// traemos las variables globales y los modelos Dao los importamos
	static private Scanner sc = null;
	static private SeriesDAOArrayList modelo = new SeriesDAOArrayList();
	static private String option = "";

	// hacemos las variables Locales

	private static final String OPTION_CR = "1";
	private static final String OPTION_R = "2";
	private static final String OPTION_UP = "3";
	private static final String OPTION_D = "4";
	private static final String OPTION_S = "S";
	private static boolean repeat = false;
// METODO PBLIC QUE ES EL CORE AQUI SE MOSTRARA EL MENU PRIMERO QUE NADA

	public static void main(String args[]) throws Exception {
		sc = new Scanner(System.in);

		do {

			showMenu();
			switch (option) {
			case OPTION_CR:
				listar();
				break;

			case OPTION_R:
				crear();
				break;

			case OPTION_UP:

				break;
			case OPTION_D:
				borrar();

				break;

			case OPTION_S:
				System.out.println("Bye thanks for using the app");
				repeat = true;

				break;

			default:
				System.out.println("Please pick a valid option");
				break;
			}
		} while (!repeat);

	}

	private static void borrar() throws Exception {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		boolean isError = true;
		int id;
		do {
			System.out.println("dame el id de la serie que quieres quitar");
			id = Integer.parseInt(sc.nextLine());
			if (id > 0) {
				isError = false;
			}
		} while (isError);

		modelo.eliminar(id);

	}

	private static void crear() {
		// TODO Auto-generated method stub

	}

	private static void listar() {
		// TODO Auto-generated method stub

		ArrayList<Serie> series = modelo.listar();

		System.out.println(series);

	}

	private static void showMenu() {
		System.out.println("*****************************");
		System.out.println("1.- Mostrar series disponibles");
		System.out.println("2.-Crear una serie ");
		System.out.println("3.-Modificar una serie ");
		System.out.println("4.-Dar de baja una serie");
		System.out.println("");
		System.out.println("S salir");
		System.out.println("*****************************");
		System.out.println("\n Selecciona una opcion del menu:");
		option = sc.nextLine();

	}

}
