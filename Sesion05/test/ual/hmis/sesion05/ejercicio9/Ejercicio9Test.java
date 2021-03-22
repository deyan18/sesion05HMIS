package ual.hmis.sesion05.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio9Test {
	
	ArrayList<String> c1;
	ArrayList<String> c2;
	ArrayList<String> salida;
	
	@BeforeEach
	void setUp() {
		c1 = new ArrayList<String>();
		c2 = new ArrayList<String>();
		salida = new ArrayList<String>();
	}
	
	@ParameterizedTest (name = "{index}")
	@CsvSource({"AAAA, BBBB, CCCC, DDDD, EEEE",})
	
	void testListaCadenasOrdenadas(String p1, String p2, String p3, String p4, String p5) {
		c1.add(p1);
		c1.add(p2);
		c1.add(p2);
		c1.add(p3);
		c1.add(p4);
		
		c2.add(p2);
		c2.add(p3);
		c2.add(p5);

		salida.add(p2);
		salida.add(p3);
		
		Ejercicio9 e = new Ejercicio9();
		assertEquals(salida, e.listaCadenasOrdenadas(c1, c2));
	} 
}
