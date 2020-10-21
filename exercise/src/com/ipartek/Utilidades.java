package com.ipartek;

/**
 * Here we will have the logic of behind the DNI calculator
 * 
 * @author HP
 *
 */

public class Utilidades {

	static public char calculateLetter(String numeros) throws Exception {

		char letterDni[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		if (numeros == null) {
// lanzamos la excpecion
			throw new Exception("los numeros del dni no pueden ser null");

		}

		if (numeros.length() != 8) {
//lanzamos la excepTion
			throw new Exception("el dni debe de tener una longitud de 8");

		}

		int calculoDni = Integer.parseInt(numeros) % 23;

		return (letterDni[calculoDni]);

	}

}
