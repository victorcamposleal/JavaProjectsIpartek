package com.ipartek.ejercicios.interfaces.app.clases;

import com.ipartek.ejercicios.interfaces.app.interfaces.IVehiculo;

public class Patinete implements IVehiculo {

	private int velocidadActual;
	private boolean estaArrancado;

	public Patinete() {
		super();
		this.velocidadActual = 0;
		this.estaArrancado = false;
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
		if (estaArrancado) {
			setVelocidadActual(incrementoVel + velocidadActual);
			if (velocidadActual < VEL_MAX_PATINETE) {
				System.out.printf("el patinente va a %s Km/h %n", velocidadActual);

			} else if (velocidadActual >= VEL_MAX_PATINETE) {
				setVelocidadActual(VEL_MAX_PATINETE);
				System.out.println("no se puede superar la velocidad maxima del patinte ");
			}
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

	public void apagar() throws Exception {

		if (estaArrancado && velocidadActual > 0) {
			throw new Exception("no puedes apagarme estoy encendido y voy a mas de 0");
		}

		else if (velocidadActual == 0) {
			setEstaArrancado(false);
		}

		else {
			System.out.println("no puedes apagarme estoy encendido y voy a mas de 0");
		}

	}

	public void arrancar() {
		// TODO Auto-generated method stub
		if (!estaArrancado) {
			setEstaArrancado(true);
		}
	}

}
