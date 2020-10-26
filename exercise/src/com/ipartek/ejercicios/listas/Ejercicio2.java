package com.ipartek.ejercicios.listas;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Jugador;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo Sting y dorsal
 * de tipo int. Solicitar los datos de los jugadores por teclado, y una vez
 * introducido el primero, se insertara en la lista y se preguntara si se desea
 * introducir otro más, para lo cual el usuario escribirá S o N. En caso
 * afirmativo se volverá a pedir otro más, hasta que el usuario escriba N
 * 
 * @author HP
 *
 */
public class Ejercicio2 {

	// variables globales
	static private Scanner sc = null;
	static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	static private String option = "S";

	public static void main(String args[]) {
		sc = new Scanner(System.in);

		do {
			Jugador j = new Jugador();
			System.out.println("inserte un nombre");
			j.setNombre(sc.nextLine());
			System.out.println("Insterte un numero de jugador");
			j.setDorsal(Integer.parseInt(sc.nextLine()));
			jugadores.add(j);
			System.out.println("desea ingresar otro jugaodr S o N");
			option = sc.nextLine();

		} while (option.equals("S"));

		for (Jugador jugador : jugadores) {

			System.out.println(jugador);

		}

	}

}
