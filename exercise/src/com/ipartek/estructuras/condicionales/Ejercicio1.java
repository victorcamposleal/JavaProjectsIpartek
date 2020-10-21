package com.ipartek.estructuras.condicionales;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=5;
		int d=9;
		int e=8;
		
		int max=0;
		int min=10;		
		int[] arraynumeros= {a,b,c,d,e};
	
		if (a>b) {
System.out.println("a es mayor que b");
		} else {
System.out.println("b es mayor que a");
		}
		
		if (b==d) {
System.out.println("b es igual que d");
		} else {
System.out.println("b es diferente que d");
		}
		
		
		
		
//for
for (int i = 0; i < arraynumeros.length; i++) {
	if (max<arraynumeros[i]) {
		max=arraynumeros[i];
		
	}
}
System.out.println(max);
		
for (int i = 0; i < arraynumeros.length; i++) {
	if (min>arraynumeros[i]) {
		min=arraynumeros[i];
		
	}
}
System.out.println(min);
	
		
		
		
		if (a>c) {
			System.out.println("este numero se puede dividir"+ (a/c));
					} else {
			System.out.println("el numero no es divisible");
					}
}

}
