package com.ipartek.apps.cartas;

public class Carta {

	private Palo palo;
	private int numero;
	private Card card;

	public Carta(Palo palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}

	public Carta(Palo palo, Card card) {
		super();
		this.palo = palo;
		this.card = card;
	}

	// getters y setters
	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}

}
