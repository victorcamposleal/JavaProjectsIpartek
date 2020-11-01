package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAOSqlite;
import com.ipartek.modelo.PerroDao;
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
	static private PerroDao modelo = new PerroDAOSqlite();

	static private String opcion = "";// option selected by the menu;

//locales variables

	private static final String OPTION_LI = "1";
	private static final String OPTION_CR = "2";
	private static final String OPTION_EL = "3";
	private static final String OPTION_MO = "4";
	private static final String OPTION_OU = "S";
	private static boolean repeat = false;

	public static void main(String[] args) throws Exception {

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

	private static void modificar() throws Exception {
		// TODO generar y modificar
		ArrayList<Perro> perros = modelo.listar();
		System.out.println("what you wish to modify ");
		System.out.println("1.Name ");
		System.out.println("2.Wheight");
		System.out.println("3.Breed");
		System.out.println("4.isVaccinated");

		String option = sc.nextLine();
		boolean repetidor = true;
		boolean repetidori = true;
		String dname2 = "";

		System.out.println("ingrese el nombre del que quiere modificar");
		do {

			String dname = sc.nextLine();

			for (Perro perro6 : perros) {
				if (dname.equals(perro6.getNombre())) {
					dname2 = dname;
					repetidori = false;
					break;
				}

			}
			if (repetidori) {
				System.out.println("el nombre no existe ingrese correctamente el nombre quiere modificar");
			}
		} while (repetidori);

		do {
			switch (option) {
			case "1":
				System.out.println("ingrese el nuevo nombre");
				String newName = sc.nextLine();

				for (Perro perro : perros) {
					if (dname2.equals(perro.getNombre())) {

						perro.setNombre(newName);
						modelo.modificar(perro);
						break;
					}
					repetidor = false;
				}
				break;

			case "2":
				System.out.println("ingrese  nuevo Peso");

				float newWeight = Float.parseFloat(sc.nextLine());
				for (Perro perro : perros) {

					if (dname2.equals(perro.getNombre())) {

						try {
							perro.setPeso(newWeight);
							modelo.modificar(perro);
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
					if (dname2.equals(perro.getNombre())) {

						perro.setRaza(newRaza);
						modelo.modificar(perro);
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
					if (dname2.equals(perro.getNombre())) {

						perro.setIsVacunado(vacuna);
						modelo.modificar(perro);
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
	private static void borrar() throws Exception {

		ArrayList<Perro> perros = modelo.listar();
		System.out.println("dime un el nombre del perro que quieres eliminar");
		boolean repetidori = true;
		String dnombre2 = "";
		do {
			String dnombre = sc.nextLine();
			for (Perro perro6 : perros) {
				if (dnombre.equals(perro6.getNombre())) {
					dnombre2 = dnombre;
					repetidori = false;
					break;
				}

			}
			if (repetidori) {
				System.out.println("el nombre ingresado no existe intente de nuevo");
			}
		} while (repetidori);

		for (Perro perro : perros) {
			if (dnombre2.equals(perro.getNombre())) {
				modelo.eliminar(perro.getId());
				System.out.println("el perro se ha eliminado correctamente");

				break;
			}
		}

	}

	private static void crear() {

		Perro p = new Perro();
		System.out.println("introduce un nombre");
		p.setNombre(sc.nextLine());
		System.out.println("introduce una Raza");
		p.setRaza(sc.nextLine());
		System.out.println("introduce un peso");
		p.setPeso(Float.parseFloat(sc.nextLine()));
		System.out.println("esta vacunado?");
		p.setIsVacunado(Boolean.parseBoolean(sc.nextLine()));

		try {
			modelo.crear(p);
			System.out.println("Perro creado corretamente");
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	private static void listar() {
		ArrayList<Perro> perros = modelo.listar();
		for (Perro perro : perros) {
			System.out.printf(" %s %s %s kg %n", perro.getNombre(), perro.getRaza(), perro.getPeso());

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
