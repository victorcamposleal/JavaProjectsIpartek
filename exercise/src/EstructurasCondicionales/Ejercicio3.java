package EstructurasCondicionales;
/**Pedir por teclado al usuario que introduzca una distancia en cm
Una vez introducida, se solicitará que escoja a que unidad se van a convertir, introduciendo la opción por teclado
•	A convertir a metros
•	B: convertir a pulgadas
•	C: convertir a pies
•	D:convertir a yardas

 * 
 * @author HP
 *
 */
public class Ejercicio3 {

	public static void main(String[]args) {
String option="b";
float valor=35f;

switch (option) {
case "a":
	
	System.out.println(valor/100);
	
	break;
	
case "b":
	
	System.out.println((valor/2.54));
	
	break;
	
case "c":
	
	System.out.println(valor/30.48);
	
	break;
	
case "d":
	
	System.out.println(valor/91.44);
	
	break;

default:
	System.out.println("no haz elegido una option");
	break;
	
}

	
	}
}
