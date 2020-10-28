package com.ipartek.pojo;

public class Producto {

	// atributos
	private String referencia;
	private int precio;

	public Producto() {
		super();
		this.referencia = "";
		this.precio = 0;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", precio=" + precio + "]";
	}

}
