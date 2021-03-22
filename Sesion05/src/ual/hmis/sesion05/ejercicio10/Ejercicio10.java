package ual.hmis.sesion05.ejercicio10;

public class Ejercicio10 {
	
	public int convertirCadenaEntero(String cadena) {
		int salida;
		try {
			salida = Integer.parseInt(cadena);
		}catch(Exception e) {
			return -1;
		}
		
		if(salida <=-32768 || salida >= 32768)
			return -1;
		
		return salida;
	}
}
