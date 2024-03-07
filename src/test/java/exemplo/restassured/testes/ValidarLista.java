package exemplo.restassured.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidarLista {
	
	
	Response response;
	
	@Test 
	public void validarLista () {
		
		response = RestAssured.get("https://reqres.in");
		assertEquals(200, response.getStatusCode());
	}

}
