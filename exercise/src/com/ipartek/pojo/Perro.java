package com.ipartek.pojo;

public class Perro extends Mamifero {
//varibles para todo el sistema
	public static final int EDAD_MIN = 0;
	public static final int EDAD_MAX = 120;
	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	private int id;

	private String raza;
	private int edad;
	private boolean isVacunado;

	// Constructores
	///////////////////////////////////////

	public Perro() {
		super("sin nombre");

		this.raza = "";
		this.isVacunado = true;
		this.edad = EDAD_MIN;
		this.id = 0;
	}

	// otro constructor sobrecargado
	public Perro(String nombre) {
		super(nombre);

		this.raza = "";
		this.isVacunado = true;
		this.edad = EDAD_MIN;
		this.id = 0;
	}

//getters y setters

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean getIsVacunado() {
		return isVacunado;
	}

	public void setIsVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	public int getEdad() {
		return edad;
	}

// SET EDAD HAS TO THROW AN EXCEPTION SO IT CAN WORK PROPERLY
	public void setEdad(int edad) throws Exception {

		if (edad < EDAD_MIN || edad > EDAD_MAX) {

			throw new Exception(String
					.format("error en la edad no es correcta vuelve a meter la edad de nuevo debe ser %s %s", 0, 120));

		}
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", raza=" + raza + ", edad=" + edad + ", isVacunado=" + isVacunado + ", getPatas()="
				+ getPatas() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	// WE ADD THE TO STRING

}
