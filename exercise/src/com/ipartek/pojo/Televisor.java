package com.ipartek.pojo;

public class Televisor extends Electrodomestico {
	private int pulgadas;

	public Televisor() {
		super();
		this.pulgadas = 0;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + "Televisor [pulgadas=" + pulgadas + "]";
	}

}
