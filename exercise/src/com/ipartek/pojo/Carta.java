package com.ipartek.pojo;

/**
 * Este objeto se usara en el ejercicio de listas
 * 
 * @author Victor Campos leal
 *
 */
public class Carta {

	// atributos
	private String palo;
	private int valor;

	// constructor por defecto
	public Carta() {
		this.palo = "";
		this.valor = 0;

	}

//getters y setters
	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", valor=" + valor + "]";
	}

}
