package com.ipartek.actividades;

/**
 * en este archivo de utilidades tendremos los calculos de la letra del DNI y y
 * d pulgadas a centimetros
 * 
 * @author HP
 *
 */
public class Utilities {

	static public String calculoletra(String numeros) throws Exception {

		char letterDni[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		if (numeros == null) {

			throw new Exception("Los numeros del dni no pueden ser null");
		}

		if (numeros.length() != 8) {

			throw new Exception("Deben de ser 8 los numerors  del DNI ");

		}

		int letra = Integer.parseInt(numeros) % 23;

		return ("Su DNI Completo es " + numeros + letterDni[letra]);

	}

}