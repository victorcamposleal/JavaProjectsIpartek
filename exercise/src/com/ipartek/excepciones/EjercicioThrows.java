package com.ipartek.excepciones;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * Make a program that given the 8 numbers of the DNI,it gives you back the
 * correct letter
 * 
 * @author HP
 *
 */
public class EjercicioThrows {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isError = true;

		do {
			System.out.println("por favor inserta los numeros del DNI");

			String dniNumbers = sc.nextLine();
			try {
				char dniLetter = Utilidades.calculateLetter(dniNumbers);
				System.out.println("Your DNI complete is " + dniNumbers + dniLetter);
				isError = false;

			} catch (Exception e) {
				System.out.println("not valid dni: " + e.getMessage());

			}

		} while (isError);
		sc.close();

	}

}
