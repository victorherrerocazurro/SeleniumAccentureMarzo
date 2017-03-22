package test.concordion.ejercicio;

import modelo.User;

import org.concordion.integration.junit3.ConcordionTestCase;

public class ComprobacionUsuarioValidadoTest extends ConcordionTestCase {
	public User getUser(String usuario, String password){
		User user = new User(usuario,password);
		return user;
	}
}
