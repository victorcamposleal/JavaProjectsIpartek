package com.ipartek.pojo;

public class Perro extends Mamifero {
//varibles para todo el sistema
	public static final int EDAD_MIN = 0;
	public static final int EDAD_MAX = 120;

	public static final String RAZA_POR_DEFECTO = "cruce";
	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	private int id;

	private String raza;
	private int edad;
	private float peso;
	private boolean isVacunado;

	// Constructores
	///////////////////////////////////////

	public Perro() {
		super("sin nombre");

		this.id = 0;
		this.raza = "";
		this.peso = 0f;
		this.edad = EDAD_MIN;
		this.isVacunado = true;
	}

	// otro constructor sobrecargado
	public Perro(String nombre) {
		super(nombre);

		this.raza = "";
		this.isVacunado = true;
		this.edad = EDAD_MIN;
		this.id = 0;
	}

	public Perro(String nombre, String raza, float peso, boolean isVacunado) {
		this(nombre);
		this.raza = raza;
		this.peso = peso;
		this.isVacunado = isVacunado;

	}

	public Perro(int id, String nombre, String raza, float peso, boolean isVacunado) {
		this(nombre);
		this.raza = raza;
		this.peso = peso;
		this.isVacunado = isVacunado;
		this.id = id;
	}

//getters y setters

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		if (raza != null) {

			if (raza.trim().isEmpty()) {
				raza = RAZA_POR_DEFECTO;
			}
			this.raza = raza;

		} else {
			this.raza = RAZA_POR_DEFECTO;
		}
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso < 0) {
			this.peso = 0;
		} else {
			this.peso = peso;
		}
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
		return "Perro [id=" + id + ", raza=" + raza + ", edad=" + edad + ", peso=" + peso + ", isVacunado=" + isVacunado
				+ ", Nombre=" + getNombre() + "]";
	}

	// WE ADD THE TO STRING

}
