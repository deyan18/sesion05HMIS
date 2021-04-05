package ual.hmis.sesion05.ejercicio3;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio2.Ejercicio2;


class Ejercicio3Test {

	@CsvSource({
		"-1,numero erroneo",
		"0,*****",
		"1,*****",
		"5,*****",
		"6,******",
		"12,************",
		"13,************",
	})
	
	@ParameterizedTest(name = "{index} => Con num ({0}) sale {1}")
	void testAsteriscos(int num, String salida) {
		Ejercicio3 e3 = new Ejercicio3();

		assertEquals(salida, e3.asteriscos(num));
	}
	
}