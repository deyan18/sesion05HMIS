package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {
	
	public String coincide(String p1, String p2) {
		String salida = "";
		
		for(int i = 0; i<p1.length(); i++) {
			if(p2.contains(Character.toString(p1.charAt(i)))) {
				salida+= p1.charAt(i);
			}
		}
		
		return salida;
	}
}
