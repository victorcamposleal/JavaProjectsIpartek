package EjerciiosvarieblesOperadores;
/**
* Realizar un programa que cree una variable de cada uno de los tipos 
* de datos simples que podemos encontrar en el lenguaje de 
* programación Java, asignándoles un valor
*Una vez creadas, se mostraran por pantalla los valores 
*de cada una de ellas
*De manera adicional, se buscara por internet o otras fuentes, los valores máximos y mínimos que pueden albergar 
 * @author HP
 *
 */
public class Ejercicio1 {
	public static void main(String[]args){
	 // We declare here a String that is a Variable
	 String nombre="Victor";
	 // we declare here a number this is an integer
	 int edad=29;
	 //float when we want to use a number that have decimals we use float
	 float sueldo=6521.99f;
	 // we declare here a character here we use the single
	 char sexo= 'f';
	 //we declare a boolean varable
	 boolean isCovidAffected=true;
	 
	 System.out.println("hello" + nombre);
	 System.out.println("mi edad es" + edad);
	 System.out.println("mi sueldo es" + sueldo);
	 System.out.println("my sex is" + sexo);

	 if (isCovidAffected) {
		System.out.println("tienes que hacerte un PCR");
	} else {
System.out.println("estas sano");
	}
	 
	 switch (sexo) {
case 'm':
	
	System.out.println("eres hOMBRE");
	
	break;
	
case 'f':
	
	System.out.println("eres Mujer");
	
	break;

default:
	System.out.println("no tienes sexo");
	break;
}//switch
	// wrappers=> son clases que devuelven a las variables primitivas con ciertas utilidades
	//int=>Integer
	//float=>Float
	//char=>Character
	// boolean=>Boolean
	 
System.out.println("----------------int----------------");
System.out.println("Valor Maximo = " + Integer.MAX_VALUE);
System.out.println("Valor Min = " + Integer.MIN_VALUE);

System.out.println("1 int= "+ Integer.SIZE);
System.out.println("1 short= "+ Short.SIZE);
System.out.println("1 byte= "+ Byte.SIZE);
System.out.println("1 long= "+ Long.SIZE);


}//main


// wrappers=> son clases que devuelven a las variables primitivas con ciertas utilidades
//int=>Integer
//float=>Float
//char=>Character
// boolean=>Boolean

	
}//clase



