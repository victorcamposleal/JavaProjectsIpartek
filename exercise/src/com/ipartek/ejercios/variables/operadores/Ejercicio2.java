package com.ipartek.ejercios.variables.operadores;
/**
 * Ejercicio 2
Realizar una pequeña calculadora. 
Para ello se crearan 10 variables de distintos tipos numéricos. 
Una vez creadas dichas variables y asignadas desde código valores 
(se recomienda valores entre -10 y 10) realizar las siguientes operaciones:
<ul>
<li>La suma de todos los números</li>
<li>La resta de todos los números</li>
<li>La media de todos los números</li>
</ul>
 * @author HP
 *
 */
public class Ejercicio2 {
	
	public static void main(String[] args) {
	float numero1=10f;
	float numero2=2f;
	float numero3=5f;
	float numero4=3f;
	float numero5=8f;
	float numero6=5f;
	float numero7=3f;
	float numero8=7;
	float numero9=9f;
	float numero10=5f;
	
	System.out.println((numero1)+(numero2)+(numero3)+(numero4)+(numero5)+(numero6)+(numero7)+(numero8)+(numero9)+(numero10));
	System.out.println(numero1-numero2-numero3-numero4-numero5-numero6-numero7-numero8-numero9-numero10);	
    System.out.println(((numero1)+(numero2)+(numero3)+(numero4)+(numero5)+(numero6)+(numero7)+(numero8)+(numero9)+(numero10))/10);
	
	// declarando un array en java se dclrara asi array[]={2,4,5,6,5}
	
	int temperaturas[]= {56,78,87,56,7,3,4};
	String diasSemanas[]= {"lunes","martes","mieroles","jueves","Viernes","Sabado","Domingo"};				
	float sumatoria=0;
	
	for (int i = 0; i < temperaturas.length; i++) {
		System.out.println(diasSemanas[i]+" hace "+temperaturas[i]);
		sumatoria= (sumatoria+temperaturas[i]);
		
	}
	//TODO mejorar ejemplo
	float mediaSemana=sumatoria/temperaturas.length;
	
	//otra manera de imporimir las cosas
	System.out.printf("los grados de la semana son %s",mediaSemana);
	System.out.println(mediaSemana);
	}
	


}
