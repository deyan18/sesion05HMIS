package ual.hmis.sesion05.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio8Test {
	Ferry f;
	@BeforeEach
	void setUp() {
		f = new Ferry();
		f.maxPasajeros = 30;
		f.maxPeso = 10000;
		f.maxVehiculos = 2;
	}
	@ParameterizedTest (name = "{index} => Con vehiculo de {0} pasajeros, {1} ruedas y peso {2} sale {3}")
	@CsvSource({"3, 4, 9900, true",
				"3, 4, 124122, false",})
	
	void testEmbarcar(int pasajeros, int ruedas, int peso, boolean salida) {
		assertEquals(salida, f.embarcarVehiculo(new Vehiculo(pasajeros, ruedas,peso)));
	}
	
	@ParameterizedTest (name = "{index} => Con vehiculo de {0} pasajeros, {1} ruedas y peso {2}")
	@CsvSource({"3, 4, 1245"})
	
	void testVacio(int pasajeros, int ruedas, int peso) {
		assertTrue(f.vacio());
		f.embarcarVehiculo(new Vehiculo(pasajeros, ruedas,peso));
		assertFalse(f.vacio());
	}
	
	@ParameterizedTest (name = "{index} => Con vehiculo de {0} pasajeros, {1} ruedas y peso {2}")
	@CsvSource({"3, 4, 1241"})
	
	void testSuperadoTotalVehiculos(int pasajeros, int ruedas, int peso) {
		f.embarcarVehiculo(new Vehiculo(pasajeros, ruedas,peso));
		assertFalse(f.superadoMaximoVehiculos());
		f.embarcarVehiculo(new Vehiculo(pasajeros, ruedas,peso));
		f.embarcarVehiculo(new Vehiculo(pasajeros, ruedas,peso));
		assertTrue(f.superadoMaximoVehiculos());
	}

}
