package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public String asteriscos(int num) {
		if(num<0) {
			return "numero erroneo";
		}
		
		String salida = "";
		
		if(num<5) {
			num = 5;
		}else if(num>12) {
			num = 12;
		}
		
		for(int i = 0; i<num; i++) {
			salida += "*";
		}
	
		return salida;
	}
}
