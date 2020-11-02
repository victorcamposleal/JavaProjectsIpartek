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
				if (dname.equalsIgnoreCase(perro6.getNombre())) {
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
					if (dname2.equalsIgnoreCase(perro.getNombre())) {

						perro.setNombre(newName);
						modelo.modificar(perro);
						repetidor = false;
						break;
					}
				}
				break;

			case "2":
				System.out.println("ingrese  nuevo Peso");

				float newWeight = Float.parseFloat(sc.nextLine());
				for (Perro perro : perros) {

					if (dname2.equalsIgnoreCase(perro.getNombre())) {

						try {
							perro.setPeso(newWeight);
							modelo.modificar(perro);
							repetidor = false;
							break;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}
				}
				break;

			case "3":
				System.out.println("ingrese la nueva Raza");
				String newRaza = sc.nextLine();
				for (Perro perro : perros) {
					if (dname2.equalsIgnoreCase(perro.getNombre())) {

						perro.setRaza(newRaza);
						modelo.modificar(perro);
						repetidor = false;
						break;
					}
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
					if (dname2.equalsIgnoreCase(perro.getNombre())) {

						perro.setIsVacunado(vacuna);
						modelo.modificar(perro);
						repetidor = false;
						break;
					}
				}
				break;

			default:
				System.out.println("eliga una opcion valida");
				repetidor = false;
				break;
			}
		} while (repetidor);
		System.out.println("Perro Modificado correctamente");
	}

	// ******************all the methods we will use in this
	// application************************
	private static void borrar() throws Exception {

		ArrayList<Perro> perros = modelo.listar();
		System.out.println("introduce el id del perro que quieres eliminar");
		boolean repetidori = true;
		String dnombre2 = "";
		int idSelect2 = 0;
		String opcion = "";

		do {
			int idSelect = Integer.parseInt(sc.nextLine());
			for (Perro perro6 : perros) {
				if (idSelect == (perro6.getId())) {
					idSelect2 = idSelect;
					dnombre2 = perro6.getNombre();
					repetidori = false;
					break;
				}

			}
			if (repetidori) {
				System.out.println("el id ingresado no existe intente de nuevo con el id correcto");
			}
		} while (repetidori);

		System.out.printf("el perro que quieres eliminar a %s estas seguro que quieres eliminar a un perro? s o n:",
				dnombre2);
		opcion = sc.nextLine();

		if (opcion.equals("s")) {

			System.out.printf(
					"el perro que quieres eliminar es [%s] escribe su nombre excatamente como indican los corchetes",
					dnombre2);
			do {
				String dnombre = sc.nextLine();
				for (Perro perro6 : perros) {
					if (dnombre.equalsIgnoreCase(perro6.getNombre())) {
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
				if (dnombre2.equalsIgnoreCase(perro.getNombre())) {
					modelo.eliminar(perro.getId());
					System.out.println("el perro se ha eliminado correctamente");

					break;
				}
			}
		}

		else {
			System.out.printf("%n  volvemos al menu %n");
		}

		/*
		 * boolean flag = true; int id = 0; Perro pEliminar = null;
		 * 
		 * // buscar perro por id do {
		 * System.out.println("Dime el ID del perro para eliminar:"); id =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * pEliminar = modelo.recuperar(id); if ( pEliminar == null ) {
		 * System.out.println("*Lo sentimos pero no existe ese perro"); }else { flag =
		 * false; }
		 * 
		 * } while (flag);
		 * 
		 * 
		 * flag = true; // pedir confirmacion de nombre para eliminar do { System.out.
		 * printf("Por favor escribe [%s] para eliminar o \"s\" para [S]alir\n",
		 * pEliminar.getNombre() ); String nombre = sc.nextLine();
		 * 
		 * if ( OP_SALIR.equalsIgnoreCase(nombre)) { break; // salimos del bucle
		 * 
		 * }else { // comprobar nombre
		 * 
		 * if ( pEliminar.getNombre().equalsIgnoreCase(nombre)) {
		 * 
		 * try { modelo.eliminar(id); flag = false;
		 * System.out.println("Hemos dado de baja al perro");
		 * 
		 * }catch (Exception e) { e.printStackTrace(); }
		 * 
		 * }else { System.out.println("**No coincide el nombre**"); } }
		 * 
		 * } while (flag);
		 */

	}

	private static void crear() {

		boolean isFallo = true;
		boolean isFallo2 = true;

		Perro p = new Perro();
		System.out.println("introduce un nombre");
		p.setNombre(sc.nextLine());
		System.out.println("introduce una Raza");
		p.setRaza(sc.nextLine());
		System.out.println("introduce un peso");
		do {
			try {
				p.setPeso(Float.parseFloat(sc.nextLine()));
				isFallo = false;

			} catch (Exception e) {
				System.out.println("el peso tiene que tener un valor numerico ingrese el peso otra vez");

			}
		} while (isFallo);
		System.out.println("esta vacunado?");
		p.setIsVacunado(Boolean.parseBoolean(sc.nextLine()));
		do {
			try {
				modelo.crear(p);
				System.out.println("Perro creado corretamente");
				System.out.println(p);
				isFallo2 = false;
			} catch (Exception e) {
				System.out.println("el nombre ingresado ya esxiste por favor ingrese un nombre nuevo");
				p.setNombre(sc.nextLine());

			}
		} while (isFallo2);

	}

	private static void listar() {
		ArrayList<Perro> perros = modelo.listar();
		for (Perro perro : perros) {
			System.out.printf("%2s %15s %13s %13s kg %13s %n", perro.getId(), perro.getNombre(), perro.getRaza(),
					perro.getPeso(), (perro.getIsVacunado()) ? "vacunado" : "*Sin Vacunar*");

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
