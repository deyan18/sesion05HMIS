package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	public boolean login(String username, String password) {
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty()) {
			return false;
		}
		// comprobar que la longitud sea < 30
		if (username.length() >= 30 || password.length() >=30) {
			return false;
		}
		if (!comprobarPassword(password)) {
			return false;
		}
		// llamar al metodo de la bbdd
		return compruebaLoginEnBD(username, password);

	}

	public boolean compruebaLoginEnBD
	(String username, String password){
		// metodo mock (simulado)
		if (username.equals("user") && password.equals("pAss1")) {
			return true;
		}else {
			return false;
		}
	}


	public boolean comprobarPassword(String password) {
		boolean mayuscula = false;
		boolean minuscula = false;
		boolean digito = false;

		for(int i = 0; i<password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				mayuscula = true;
			}else if (Character.isLowerCase(password.charAt(i))) {
				minuscula = true;
			}
			if (Character.isDigit((password.charAt(i)))) {
				digito = true;
			}
			if (mayuscula && minuscula && digito) {
				return true;
			}
		}

		return false;
	}
}