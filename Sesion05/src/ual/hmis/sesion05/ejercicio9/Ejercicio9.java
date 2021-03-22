package ual.hmis.sesion05.ejercicio9;

import java.util.ArrayList;

public class Ejercicio9 {

	public ArrayList<String> listaCadenasOrdenadas(ArrayList<String> c1, ArrayList<String> c2){
		ArrayList<String> salida = new ArrayList<String>();
		
		for(String s: c1) {
			if(c2.contains(s) && !salida.contains(s))
				salida.add(s);
		}
		
		return salida;
	}
}
