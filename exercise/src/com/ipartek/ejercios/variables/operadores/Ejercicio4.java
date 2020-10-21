package com.ipartek.ejercios.variables.operadores;

public class Ejercicio4 {

	
	public static void main(String[]args) {
		 byte num1=(byte) 255;//no me deja guardar los valores indicados por que byte tinene un limite
		 byte num2=(byte)223;//no me deja guardar los valores indicados por que byte tinene un limite	
	
		 
		System.out.println((num1+num2));
		System.out.println((Byte.MAX_VALUE));
		System.out.println((Byte.MIN_VALUE));
		
		
		//UTILIZO LOS VALORES HEXADECIMALES
		
		byte num3 = -1; 
		  int num1entero = (num1 & 0xFF); // 255
		//  System.out.println(num1entero); 
		  
		  byte num4 = -33; 
		  int num2entero = (num2 & 0xFF); // 223
		//  System.out.println(num2entero); 
		 
		  int resultado = num1entero + num2entero;
		  
		  System.out.println("El resultado es " + resultado);

		
	

			
			
		}
}
