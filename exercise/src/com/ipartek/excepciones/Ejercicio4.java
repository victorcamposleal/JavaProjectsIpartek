package com.ipartek.excepciones;

import java.util.ArrayList;

import com.ipartek.pojo.Persona;

public class Ejercicio4 {

	public static void main(String[] args) {

		// creamos un Array List
		ArrayList<Persona> personas = new ArrayList<Persona>();

		try {
// creamos las personas

// nombre del objeto principal y la variable que utilizaremos
			Persona p1 = new Persona();
			p1.setNombre("pepe");
			p1.setEdad(200);

			Persona p2 = new Persona();
			p2.setNombre("lolo");
			p2.setEdad(120);

			personas.add(p1);
			personas.add(p2);

		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}

		finally {
			// hacemos un for each para mostrar los datos en pantalla
			for (Persona p : personas) {
				System.out.println(p);

			}

		}

	}
}
