package com.ipartek.exercise;
/**this is used to make the documantation for calss in java from now on
 * we will have to use this documentatuin
 * 
 * 
 * @author HP
 *
 */
public class Variables {

 public static void main(String[] args){
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
 }//main
 

}//clase
