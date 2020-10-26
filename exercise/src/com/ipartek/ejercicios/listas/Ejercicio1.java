package com.ipartek.ejercicios.listas;

import java.util.ArrayList;

/**
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.
 * Insertar diez nombres de alumnos en la lista Mostrar los diez nombres
 * recorriendo la lista con un foreach
 * 
 * @author HP
 *
 */
public class Ejercicio1 {
	public static void main(String args[]) {
		ArrayList<String> alumnos = new ArrayList<String>();

		alumnos.add("Victor");
		alumnos.add("Raul");
		alumnos.add("Quique");
		alumnos.add("Ander");
		alumnos.add("Iratxe");
		alumnos.add("Joaquin");
		alumnos.add("Alberto");
		alumnos.add("Lander");
		alumnos.add("Veronica");
		alumnos.add("Jorge");
		alumnos.add("Julen");
		alumnos.add("Marcelo");

		for (String alumno : alumnos) {

			System.out.println(alumno);

		}

	}

}
