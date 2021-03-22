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
		// Embarca un veh�culo a�adi�ndolo a la lista
	
		vehiculos.add(v); 
		
		
		if(superadoMaximoPeso()) {
			vehiculos.remove(v);
			return false;
		}

		return true;
	}
	int totalVehiculos() {
		// devuelve el n�mero total de veh�culos embarcados
		return vehiculos.size();

	}
	boolean vacio() {
		// verdadero si no hay ning�n veh�culo
		return vehiculos.isEmpty();

	}
	boolean superadoMaximoVehiculos() {
		 // verdadero si el n�mero total de los veh�culos supera el m�ximo
		return totalVehiculos() > maxVehiculos;
	}
	
	boolean superadoMaximoPeso() {
		 // verdadero si el peso total de los veh�culos supera el m�ximo
		for(Vehiculo v: vehiculos) {
			totalPeso += v.peso;
		}

		return totalPeso > maxPeso;
	}
	
}
