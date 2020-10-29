package com.ipartek.ejercicios.interfaces.app.principal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.ipartek.ejercicios.interfaces.app.clases.Patinete;

class PatineteTest {

	@Test
	void testAcelerar() {
//con el patinete apagado
		Patinete p = new Patinete();
		p.Acelerar(30);
		assertFalse(p.isEstaArrancado(), "deberia estar parado");
		assertEquals(0, p.getVelocidadActual(), "no deberia de acelerar esta apagao");
		// ahora con el patinete encendido
		p.arrancar();
		p.Acelerar(40);
		assertEquals(40, p.getVelocidadActual(), "vamos acalerando a la velocidad indicada");

	}

	@Test
	void testFrenar() {
		Patinete p = new Patinete();
		p.arrancar();
		p.Acelerar(50);
		p.Frenar(10);
		assertEquals(40, p.getVelocidadActual(), "vamos acalerando a la velocidad indicada");

	}

	@Test
	void testApagar() {
		Patinete p = new Patinete();
		p.arrancar();
		p.Acelerar(50);
		p.Frenar(10);
		assertEquals(40, p.getVelocidadActual(), "vamos acalerando a la velocidad indicada");
		try {
			p.apagar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
