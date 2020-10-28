package com.ipartek.pojo;

public class DomesticCat extends Cat {

	private boolean vacunado;
	private boolean castrado;

	public DomesticCat(String nombre) {
		super(nombre);
		this.castrado = false;
		this.vacunado = true;

	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	// el super to string me saca lo que tienen el padre + lo que tienen el hijo
	@Override
	public String toString() {
		return "DomesticCat [vacunado=" + vacunado + ", castrado=" + castrado + "]";
	}

}
