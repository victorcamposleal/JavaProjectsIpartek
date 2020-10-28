package com.ipartek.pojo;

import javax.swing.JOptionPane;

public class Mamifero {
//atributos
	private int patas;
	private String nombre;

	public void imprimirPatas() {
		JOptionPane.showMessageDialog(null, " Tiene " + patas + " patas\n", "Mamifero",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public Mamifero(String nombre) {
		super();
		this.nombre = nombre;
		this.patas = 4;
	}

	// getters y setters
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
