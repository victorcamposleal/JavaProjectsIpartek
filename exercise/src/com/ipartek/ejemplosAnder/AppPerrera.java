package com.ipartek.ejemplosAnder;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

/**
 * in this excercise we will realize a CRUD APP about dogs CRUD stands for
 * Create Read Update Delte
 * 
 * @author HP
 *
 */

public class AppPerrera {
//We have to declare Global variables

	static Scanner sc = null;
	static ArrayList<Perro> perros = new ArrayList<Perro>();
	static String opcion = "";// option selected by the menu;

	public static void main(String[] args) {

		System.out.println("******Welcome to the appp**********");
		sc = new Scanner(System.in);
		// method to initialize data
		inicializarDatos();
		// method to show menu

		do {
			mostarMenu();
			switch (opcion) {
			case "1":
				listar();
				break;

			case "2":
				crear();
				break;

			case "3":
				borrar();
				break;

			case "4":
				modificar();
				break;

			default:
				System.out.println("please select a valid option");
				break;
			}

		} while (!opcion.equals("S"));
		// !OPCION_SALIR.equalsIgnoreCase(opcion)
		System.out.println("******bye**********");
		sc.close();
	}// main

	private static void modificar() {
		// TODO generar y modificar
		System.out.println("ingrese el nombre que quiere modificar");
		String dname = sc.nextLine();
		System.out.println("ingrese el nuevo nombre");
		String newName = sc.nextLine();
		for (Perro perro : perros) {
			if (dname.equals(perro.getNombre())) {

				perro.setNombre(newName);
				break;
			}

		}

	}

	// ******************all the methods we will use in this
	// application************************
	private static void borrar() {
		System.out.println("dime un el nombre del perro que quieres eliminar");
		String dnombre = sc.nextLine();
		for (Perro perro : perros) {
			if (dnombre.equals(perro.getNombre())) {

				perros.remove(perro);
				break;
			}
		}

	}

	private static void crear() {
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
		for (Perro perro : perros) {
			System.out.printf(" %s [%s]<br> ", perro.getNombre(), perro.getRaza());

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

	private static void inicializarDatos() {
		try {
			Perro p = new Perro();
			p.setEdad(15);
			p.setRaza("german shepard");
			p.setNombre("otto");
			perros.add(p);

			p = new Perro();
			p.setEdad(15);
			p.setRaza("chihuahua");
			p.setNombre("last");
			perros.add(p);

			p = new Perro();
			p.setEdad(7);
			p.setRaza("Border Collie");
			p.setNombre("Lassie");
			perros.add(p);

			p = new Perro();
			p.setEdad(7);
			p.setRaza("Border Collie");
			p.setNombre("pongo");
			perros.add(p);
		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
