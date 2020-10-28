package com.ipartek.pojo;

public class Electrodomestico {
	private String nombre;
	private int precio;

	public Electrodomestico() {
		super();
		this.nombre = "";
		this.precio = 0;

	}

	public Electrodomestico(String nombre, int precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
