package com.ipartek.ejemplosAnder;

import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioPaises {
	
	public static void main(String[] args) {
		ArrayList<String>paises=new ArrayList<String>();
		paises.add("Mexico");
		paises.add("Spain");
		paises.add("Brasil");
		paises.add("Gotham");
		paises.add("Utopia");
		
		// para obetner un pais
		paises.get(0);
		//paises add in a position
		paises.add(3,"Luxemburg");
		// remover un pais
		paises.remove(1);
		//ver el indice de un pais
		paises.indexOf("Spain");
		//modificar
		paises.set(3,"Italy");
		// to know the size;
		paises.size();
		
		for (Iterator <String> iterator = paises.iterator(); iterator.hasNext();) {
			String pais = (String) iterator.next();
			System.out.println(pais);
			
			
		}
		
		
		
		
		
	}

}
