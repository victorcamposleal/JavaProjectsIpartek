package com.ipartek.ejercicios.interfaces.app.interfaces;

public interface IVehiculo {

	int VEL_MAX_COCHE = 150;
	int VEL_MAX_BICI = 50;
	int VEL_MAX_PATINETE = 80;

	/**
	 * este metodo se utilizara para arrancar
	 */

	void arracnar();

	/**
	 * este metodo se utilizara para acelerar
	 */
	void Acelerar(int incrementoVel);

	/**
	 * este metodo se utilizara para frenar
	 */
	void Frenar(int decrementoVel);

	/**
	 * este metodo se utilizara para apagar
	 */

	void apagar();

}
