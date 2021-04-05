package ual.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

	@CsvSource({
		"user,pAss1,true",
		"'',pAss1,false",
		"'a',pAss1,false",
		"'a',pass1,false",
		"'user',passS1,false",
		"'user',PASS,false",
		"user,'',false",
		"nombredeusuariossuperlagruisimomayorde30caraceteres,pass,false",
		"user,unsuperpasswordlarguisimoconmasde30caracteresgigantedelto,false",
 		"user,passwordincorrect,false",
		"usuario,pass,false"
	})
	
	@ParameterizedTest(name = "{index} => Con usuario ({0}) y password ({1}) sale {2}")
	void testLogin_parametrized(String username, String password, String result) {
		Ejercicio2 e2 = new Ejercicio2();
		assertEquals(Boolean.parseBoolean(result), e2.login(username, password));
	}
	
}
