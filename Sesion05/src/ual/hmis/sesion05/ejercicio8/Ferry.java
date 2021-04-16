package ual.hmis.sesion05.ejercicio8;

import java.util.ArrayList;

public class Ferry {
	ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	int maxPasajeros;
	int maxVehiculos;
	int maxPeso;
	int totalPasajeros;
	int totalPeso;
	
	boolean embarcarVehiculo (Vehiculo v) {
	
	
		vehiculos.add(v); 
		
		
		if(superadoMaximoPeso()) {
			vehiculos.remove(v);
			return false;
		}

		return true;
	}
	int totalVehiculos() {
		// devuelve el numero total de vehiculos embarcados
		return vehiculos.size();

	}
	boolean vacio() {
		// verdadero si no hay ningun vehiculo
		return vehiculos.isEmpty();

	}
	boolean superadoMaximoVehiculos() {
		return totalVehiculos() > maxVehiculos;
	}
	
	boolean superadoMaximoPeso() {
		for(Vehiculo v: vehiculos) {
			totalPeso += v.peso;
		}

		return totalPeso > maxPeso;
	}
	
}
