package com.ipartek.ejercicios.abstracta;

public abstract class circulo extends ObjetoGrafico {

	int diametro;

	float CalcularArea() {

		return 3.1416f * (diametro / 2);
	}

}
