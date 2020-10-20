package EstructurasCondicionales;
import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main(String args []) {
		
	int num1=0;
	int i=0;
	Scanner sc=new Scanner(System.in);//ESTAMOS CREANDO UNA CLASE Y LE ANIADIREMOS INFORMACION POR ESO ES EL SYSTEM IN.
	
	do {
		System.out.println("dame un numero entre 50 y 0");
		num1=Integer.parseInt(sc.nextLine());
		
		if(i ==3) {
			System.out.println("por favor dame el nuemro correctamente");
			
		}
		else {
			i=i+1;
		}
		
		
	} while (num1>50||num1<0||i==3);

	System.out.println("numero correcto "+num1);
	sc.close();		
		
		
	}

}
