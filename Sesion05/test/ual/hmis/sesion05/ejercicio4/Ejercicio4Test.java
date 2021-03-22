package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;

class Ejercicio4Test {
	@ParameterizedTest (name = "{index} => Con p1 = {0} y p2 = {1} sale = {2}")
	@CsvSource({"hola, adios, oa",
				"adios, hola, ao",
				})
	
	void testCoincide(String p1, String p2, String salida) {
		Ejercicio4 c = new Ejercicio4();
		assertEquals(salida, c.coincide(p1, p2));
		
	} 
}
