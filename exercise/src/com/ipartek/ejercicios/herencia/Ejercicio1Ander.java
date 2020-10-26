package com.ipartek.ejercicios.herencia;

import com.ipartek.pojo.Dog;
import com.ipartek.pojo.DomesticCat;
import com.ipartek.pojo.Estudiante;
import com.ipartek.pojo.Profesor;

/**
 * Ejemplo de ander con la clase persona y la herencia de la clase estudiante
 * 
 * @author HP
 *
 */
public class Ejercicio1Ander {
	public static void main(String[] args) throws Exception {

		Estudiante estu = new Estudiante();
		estu.setEdad(18);
		estu.setNombre("Pepe");
		estu.setNotMedia(8.5f);

		Profesor prof = new Profesor();
		prof.setNombre("Bacterio");
		prof.setEdad(40);
		prof.setMateria("Microbiology");

		Dog d = new Dog(null, 0);
		d.setNombre("rufus");
		d.setPatas(9);

		DomesticCat c = new DomesticCat(null, 0);
		c.setCastrado(false);
		c.setNombre("rufina");
		c.setPatas(4);
		c.setVacunado(true);
		System.out.println(c);

	}

}
