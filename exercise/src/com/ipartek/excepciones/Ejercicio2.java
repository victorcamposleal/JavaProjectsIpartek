package com.ipartek.excepciones;

//importamos el scanner para poder utilizarlo
import java.util.Scanner;

/**
 * 
 * 
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� y luego calcule �a/b�. Pruebe a introducir b=0 y ver que hace el programa con la divisi�n por cero. 
Pruebe a introducir b=�Carlos� para ver c�mo se comporta el programa. A�ada excepciones para recoger estas excepciones y avisar del problema al usuario

 * @author HP
 *
 */
public class Ejercicio2 {

	public static void main(String[]args){
		boolean isError=true;
		int a=0;
		int b=0;
		int resultado;
		
		//scanner le llamamos sc es un system in para recibir datos
		Scanner sc= new Scanner(System.in);
		do {
				try {
				System.out.println("introduce un numero");
				//sc.nexteline nos devuelve un string es por eso que le pones Integer.parseint para convertirlo a un entero
				a=Integer.parseInt(sc.nextLine());
				isError=false;
				}catch(Exception e){
					System.out.println("inserta el numero a");
					}
			
			
			} while (isError);
			
			do {
		
				
				try {
					System.out.println("introduce un numero");
					b =Integer.parseInt(sc.nextLine());
					isError=false;
					}catch(Exception e){
						System.out.println("inserta el numero b");
						}
		
			
			} while (isError);
	// que se elimine de la memoria		
sc.close();


			
System.out.println("tus numeros son"+a+"y"+b);	
		
	} 
	
	
	
}
