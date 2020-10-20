package EjemplosAnder;

/**
 * haremos un CRUD
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */

import java.util.ArrayList;
import java.util.Iterator;

import pojo.Perro;

public class EjercicioPerros {

	public static void main(String[] args) throws Exception {
		ArrayList<Perro> perros = new ArrayList<Perro>();

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

		// para obetner un pais
		System.out.println(perros.get(0));

		// para SABER SIZE;
		System.out.println(perros.size());

		// PARA SABER ELIMINAR
		for (int i = 0; i < perros.size(); i++) {
			Perro pIteracion = perros.get(i);

			if ("lassie".equals(pIteracion.getNombre())) {

				perros.remove(i);
			}

		}

		// PARA SABER cambiar

		for (int i = 0; i < perros.size(); i++) {
			Perro pIteracion = perros.get(i);

			if ("lassie".equals(pIteracion.getNombre())) {

				perros.set(i, p.setNombre("rufus"));
			}

		}

		for (Iterator<Perro> iterator = perros.iterator(); iterator.hasNext();) {
			Perro perro = (Perro) iterator.next();
			System.out.println(perro);

		}

	}

}
