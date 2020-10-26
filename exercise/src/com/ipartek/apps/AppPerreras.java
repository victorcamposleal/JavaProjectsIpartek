package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAOArrayList;
import com.ipartek.pojo.Perro;

/**
 * in this excercise we will realize a CRUD APP about dogs CRUD stands for
 * Create Read Update Delte
 * 
 * @author HP
 *
 */

public class AppPerreras {

//We have to declare Global variables

	static private Scanner sc = null;
	static private PerroDAOArrayList modelo = new PerroDAOArrayList();

	static private String opcion = "";// option selected by the menu;

//locales variables

	private static final String OPTION_LI = "1";
	private static final String OPTION_CR = "2";
	private static final String OPTION_EL = "3";
	private static final String OPTION_MO = "4";
	private static final String OPTION_OU = "S";
	private static boolean repeat = false;

	public static void main(String[] args) {

		System.out.println("******Welcome to the appp**********");
		sc = new Scanner(System.in);
		// method to initialize data

		// method to show menu

		do {
			mostarMenu();
			switch (opcion) {
			case OPTION_LI:
				listar();
				break;

			case OPTION_CR:
				crear();
				break;

			case OPTION_EL:
				borrar();
				break;

			case OPTION_MO:
				modificar();
				break;

			case OPTION_OU:

				System.out.println("************bye****************");
				repeat = true;
				break;

			default:
				System.out.println("please select a valid option");
				break;
			}

		} while (!repeat);
		// !OPCION_SALIR.equalsIgnoreCase(opcion)

		sc.close();
	}// main

	private static void modificar() {
		// TODO generar y modificar
		ArrayList<Perro> perros = modelo.listar();

		System.out.println("what you wish to modify ");
		System.out.println("1.Name ");
		System.out.println("2.Years");
		System.out.println("3.Breed");
		System.out.println("4.isVaccinated");

		String option = sc.nextLine();
		System.out.println("ingrese el nombre del que quiere modificar");
		String dname = sc.nextLine();
		boolean repetidor = true;

		do {
			switch (option) {
			case "1":
				System.out.println("ingrese el nuevo nombre");
				String newName = sc.nextLine();
				for (Perro perro : perros) {
					if (dname.equals(perro.getNombre())) {

						perro.setNombre(newName);
						break;
					}
					repetidor = false;
				}
				break;

			case "2":
				System.out.println("ingrese la nueva edad");
				int newYear = Integer.parseInt(sc.nextLine());
				for (Perro perro : perros) {
					if (dname.equals(perro.getNombre())) {
						try {
							perro.setEdad(newYear);
							break;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}
					repetidor = false;
				}
				break;

			case "3":
				System.out.println("ingrese la nueva Raza");
				String newRaza = sc.nextLine();
				for (Perro perro : perros) {
					if (dname.equals(perro.getNombre())) {

						perro.setRaza(newRaza);
						break;
					}
					repetidor = false;
				}
				break;

			case "4":
				System.out.println("Vacunado S (yes) o N (no)");
				String newVacunado = sc.nextLine();
				boolean vacuna = true;
				if (newVacunado.equals("s")) {
					vacuna = true;

				}

				if (newVacunado.equals("n")) {
					vacuna = false;

				}

				for (Perro perro : perros) {
					if (dname.equals(perro.getNombre())) {

						perro.setIsVacunado(vacuna);
						break;
					}
					repetidor = false;
				}
				break;

			default:
				System.out.println("eliga una opcion valida");
				repetidor = false;
				break;
			}
		} while (repetidor);
	}

	// ******************all the methods we will use in this
	// application************************
	private static void borrar() {
		System.out.println("dime un el nombre del perro que quieres eliminar");
		String dnombre = sc.nextLine();
		ArrayList<Perro> perros = modelo.listar();
		for (Perro perro : perros) {
			if (dnombre.equals(perro.getNombre())) {

				perros.remove(perro);
				break;
			}
		}

	}

	private static void crear() {
		ArrayList<Perro> perros = modelo.listar();
		Perro p = new Perro();

		System.out.println("introduce un nombre");
		p.setNombre(sc.nextLine());
		try {
			System.out.println("introduce una edad");
			p.setEdad(Integer.parseInt(sc.nextLine()));
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		perros.add(p);

	}

	private static void listar() {

		ArrayList<Perro> perros = modelo.listar();
		for (Perro perro : perros) {
			System.out.printf(" %s [%s] %d years %n", perro.getNombre(), perro.getRaza(), perro.getEdad());

		}

	}

	private static void mostarMenu() {

		System.out.println("************************************");
		System.out.println(" 1.- Listar todos los perros");
		System.out.println(" 2.- Crear un perro");
		System.out.println(" 3.- Dar de baja un Perro");
		System.out.println(" 4.-modificar perro");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();
	}
}
