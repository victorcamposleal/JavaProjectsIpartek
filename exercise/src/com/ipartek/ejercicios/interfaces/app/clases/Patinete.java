package com.ipartek.ejercicios.interfaces.app.clases;

import com.ipartek.ejercicios.interfaces.app.interfaces.IVehiculo;

public class Patinete implements IVehiculo {

	private int velocidadActual;
	private boolean estaArrancado;

	public Patinete() {
		super();
		this.velocidadActual = 0;
		this.estaArrancado = estaArrancado;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	@Override
	public String toString() {
		return "Patinete [velocidadActual=" + velocidadActual + ", estaArrancado=" + estaArrancado + "]";
	}

	public void Acelerar(int incrementoVel) {
		if (estaArrancado && velocidadActual < VEL_MAX_PATINETE) {
			setVelocidadActual(incrementoVel + velocidadActual);
			System.out.printf("el patinente va a %s Km/h %n", velocidadActual);

		} else {

			System.out.println("debe encender el vehiculo");
		}

	}

	public void Frenar(int decrementoVel) {
		if (estaArrancado) {
			setVelocidadActual(velocidadActual - decrementoVel);
			System.out.printf("el patinete va a %s Km/h %n", velocidadActual);

		}

		else {

			System.out.println("debe encender el vehiculo");
		}

	}

	public void apagar() {

		if (velocidadActual == 0) {
			setEstaArrancado(false);
		}

		else {
			System.out.println("no puedes apagarme estoy encendido y voy a mas de 0");
		}

	}

	public void arracnar() {
		// TODO Auto-generated method stub
		setEstaArrancado(true);
	}

}
