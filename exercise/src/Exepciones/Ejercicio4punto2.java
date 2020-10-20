package Exepciones;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.Persona;

public class Ejercicio4punto2 {
	public static void main(String[] args) {

		// creamos un Array List
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		try {

			// creamos las personas

			do {

// nombre del objeto principal y la variable que utilizaremos

				Persona p = new Persona();
				System.out.println("introduce un nombre");
				p.setNombre(sc.nextLine());
				System.out.println("introduce una edad");
				p.setEdad(Integer.parseInt(sc.nextLine()));

				personas.add(p);

				contador = contador + 1;

			} while (contador < 3);

		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}

		finally {
			// hacemos un for each para mostrar los datos en pantalla
			for (Persona p : personas) {
				System.out.println(p);
				sc.close();

			}

		}

	}
}
