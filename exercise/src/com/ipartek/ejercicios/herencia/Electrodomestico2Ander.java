package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Televisor;
import com.ipartek.pojo.TipoPantalla;

/**
 * Realizar el mismo ejercicio que en EjecicioElectrodomesticos, pero esta vez
 * hay que crear nuevos constructores para poder crear instancias con todos los
 * atributos.<br>
 * por ejemplo: <br>
 * 
 * <pre>
 *   
 *      TelevisionPlana tv = new TelevisionPlana("tele", 300, .., ..  );
 * </pre>
 * 
 * @see EjecicioElectrodomesticos
 * @author ur00
 *
 */
public class Electrodomestico2Ander {

	// declaro variable global
	static Scanner sc = null;
	static ArrayList<TipoPantalla> pantallas = new ArrayList<TipoPantalla>();
	static ArrayList<Electrodomestico> lista = new ArrayList<>();

	// tambien pudimos haber metido un static ArrayList<Electrodomestico> pantallas
	// = new ArrayList<>();
	static String opcion = "";
	static int contador = 0;

	public static void main(String[] args) {
		lista.add(new Electrodomestico("balay", 300));
		lista.add(new Televisor("LG", 350, 45));
		lista.add(new TipoPantalla("SAMSUNG", 500, 40, "LED"));

		for (Electrodomestico elect : lista) {
			if (elect instanceof Televisor) {
				// podemos castear usando (Television)y asi nos permite acceder alos metodos de
				// esa clase
				System.out.println(((Televisor) elect).getPulgadas());

			}

			if (elect instanceof TipoPantalla) {
				// se puede castear y asignar a una variable
				System.out.println(((TipoPantalla) elect).getPantalla());
				TipoPantalla tvps = (TipoPantalla) elect;
				tvps.getPantalla();

			}
		}

		for (TipoPantalla pantalla : pantallas) {

			System.out.println(pantalla);

		}

		sc.close();
	}

}
