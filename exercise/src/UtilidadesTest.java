import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ipartek.Utilidades;

class UtilidadesTest {
	Utilidades util = new Utilidades();

	@Test
	void testCalcularVueltas() throws Exception {
		float resultado = util.calcularVueltas(100, 100);
		float esperado = 0;

		assertEquals(esperado, resultado);

		// fail hace que la prueba falle automaticamente
	}

	@Test

	void testImprimirNUmeroLoteria() throws Exception {

		util.imprimirNumeroLoteria(1);
		util.imprimirNumeroLoteria(2);
		util.imprimirNumeroLoteria(3);
		try {
			util.imprimirNumeroLoteria(4);
			fail("deberia haber lanzado la excepcion");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test

	void testCalculadora() throws Exception {

		util.imprimirNumeroLoteria(1);
		util.imprimirNumeroLoteria(2);
		util.imprimirNumeroLoteria(3);
		try {
			util.imprimirNumeroLoteria(4);
			fail("deberia haber lanzado la excepcion");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

}
