package ual.hmis.sesion05.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Ejercicio10Test {
	
	@ParameterizedTest (name = "{index} => Con cadena {0} sale {1}")
	@CsvSource({"-5, -5",
				"+300,300",
				"-500, -500",
				"-20, -20",
				"2 3 5, -1",
				"32768, -1",
				"-32768, -1",
				"B3, -1",
				"3.5, -1"})
	
	void testListaCadenasOrdenadas(String cadena, int salida) {
		Ejercicio10 e = new Ejercicio10();
		assertEquals(salida, e.convertirCadenaEntero(cadena));
	} 
}
