package com.ipartek.pojo;

public class TipoPantalla extends Televisor {

	private String pantalla;

	public TipoPantalla() {
		super();
		this.pantalla = "";
		// TODO Auto-generated constructor stub
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return super.toString() + "TipoPantalla [pantalla=" + pantalla + "]";
	}

}
