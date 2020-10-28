package com.ipartek.ejercicios.interfaces;

public class Acumulador implements IModificacion {

	private int valor;

	public Acumulador() {
		super();
		this.valor = 0;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Acumulador [valor=" + valor + "]";
	}

	@Override
	public void incremento(int a) {
		// TODO Auto-generated method stub
		this.valor += a;
	}

}
