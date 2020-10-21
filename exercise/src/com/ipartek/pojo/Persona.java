package com.ipartek.pojo;

public class Persona {
	// constantes 
	public static final int EDAD_MIN=0;
	public static final int EDAD_MAX=120;
	
	//atributos
	private String nombre;
	private int edad;
	
	//costructor por defecto
	
	public Persona() {
		super();
		this.nombre="";
		this.edad=EDAD_MIN;
	}

//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public int getEdad() {
		return edad;
	}
// SET EDAD HAS TO THROW AN EXCEPTION SO IT CAN WORK PROPERLY
	public void setEdad(int edad) throws Exception {
		
		if (edad<EDAD_MIN||edad>EDAD_MAX) {
			
			throw new Exception(String.format("error en la edad no es correcta vuelve a meter la edad de nuevo debe ser %s %s",0,120));
			
		}
		this.edad = edad;
	}

	// WE ADD THE TO STRING
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	} 
	
}