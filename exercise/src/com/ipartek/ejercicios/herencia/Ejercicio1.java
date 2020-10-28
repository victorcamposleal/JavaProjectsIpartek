package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Televisor;
import com.ipartek.pojo.TipoPantalla;

/**
 * Realizar las siguientes jerarqu�as de herencia: tendremos una clase padre que
 * se llamara Electrodom�stico. Dicha clase contara con los atributos nombre y
 * precio. Se realizaran todos los constructores, m�todos get y set necesarios
 * Una vez creada dicha clase, se creara una serie de clases hijas. La primera
 * ser� la clase televisor. Dicha clase contara con el atributo pulgadas, as�
 * como con todos los constructores y m�todos necesarios para rellenar sus
 * atributos, incluidos los del padre Tambi�n se creara una clase
 * televisionPlana, que heredara de televisi�n, tendr� el atributo string tipo
 * de pantalla ( tft, plasma,..) y constructores, m�todos get y set para
 * rellenar los datos de los objetos que se creen, incluyendo todos los
 * atributos de los objetos de las clases padres de las que heredan Una vez
 * creado esta jerarqu�a de herencia, realizar un programa que nos pida insertar
 * televisiones planas dentro de un array de electrodom�sticos. Dicho array
 * constara de 5 electodomesticos, pero lo rellenaremos con objetos de tipo
 * televisi�nPlana.
 ** 
 * @author Victor Campos Leal
 *
 */

public class Ejercicio1 {

	// declaro variable global
	static Scanner sc = null;
	static ArrayList<TipoPantalla> pantallas = new ArrayList<TipoPantalla>();
	static ArrayList<Electrodomestico> lista = new ArrayList<>();

	// tambien pudimos haber metido un static ArrayList<Electrodomestico> pantallas
	// = new ArrayList<>();
	static String opcion = "";
	static int contador = 0;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		do {

			TipoPantalla p = new TipoPantalla();
			System.out.println("ingrese tipo de electrodomestico");
			p.setNombre(sc.nextLine());
			System.out.println("ingrese el precio");
			p.setPrecio(Integer.parseInt(sc.nextLine()));
			System.out.println("ingrese el numero de pulgadas");
			p.setPulgadas(Integer.parseInt(sc.nextLine()));
			System.out.println("ingrese el tipo de pantalla");
			p.setPantalla(sc.nextLine());
			pantallas.add(p);

			contador = contador + 1;

		} while (contador < 1);

		Electrodomestico plancha = new Electrodomestico();
		plancha.setNombre("Balay");
		plancha.setPrecio(300);
		lista.add(plancha);

		Televisor tele = new Televisor();
		tele.setNombre("LG");
		tele.setPrecio(350);
		tele.setPulgadas(45);
		lista.add(tele);

		TipoPantalla tvp = new TipoPantalla();
		tvp.setNombre("samsung");
		tvp.setPrecio(500);
		tvp.setPulgadas(40);
		tvp.setPantalla("led");
		lista.add(tvp);

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
				tvp.getPantalla();

			}
		}

		for (TipoPantalla pantalla : pantallas) {

			System.out.println(pantalla);

		}

		sc.close();
	}

}
