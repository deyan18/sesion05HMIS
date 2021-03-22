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
		// Embarca un vehículo añadiéndolo a la lista
	
		vehiculos.add(v); 
		
		
		if(superadoMaximoPeso()) {
			vehiculos.remove(v);
			return false;
		}

		return true;
	}
	int totalVehiculos() {
		// devuelve el número total de vehículos embarcados
		return vehiculos.size();

	}
	boolean vacio() {
		// verdadero si no hay ningún vehículo
		return vehiculos.isEmpty();

	}
	boolean superadoMaximoVehiculos() {
		 // verdadero si el número total de los vehículos supera el máximo
		return totalVehiculos() > maxVehiculos;
	}
	
	boolean superadoMaximoPeso() {
		 // verdadero si el peso total de los vehículos supera el máximo
		for(Vehiculo v: vehiculos) {
			totalPeso += v.peso;
		}

		return totalPeso > maxPeso;
	}
	
}
