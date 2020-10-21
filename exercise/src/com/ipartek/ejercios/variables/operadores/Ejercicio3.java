package com.ipartek.ejercios.variables.operadores;
/**
* Realizar un programa que tenga 2 variables enteras, dividendo y divisor. Meterle valores  enteros y positivos. Realizar la operación división y mostrar el resultado en pantalla
*Repetir el mismo código con estas variaciones: entero y real, real y entero, real y real
*Por ultimo, intentar dividir en los cuatro casos anteriores entre 0 y mostrar el resultado en pantalla

 * @author HP
 *
 */
public class Ejercicio3 {
public static void main(String[]args) {
 int numero1=82;
 int numero2=9;	
 int numero3=82;
 float numero4=9f;
 float numero5=82f;
 int numero6=9;
 float numero7=82f;
 int numero8=9;
 
System.out.println("enteros positivos"+""+(numero1/numero2));
System.out.println("entero y real"+""+(numero3/numero4));
System.out.println("real y entero"+""+(numero5/numero6));
System.out.println("real y real"+""+(numero7/numero8));
System.out.println("real y real"+""+(numero7/0));

	
	
}
}
