package test.concordion.assertequals;

import org.concordion.integration.junit3.ConcordionTestCase;

public class HelloWorldTest extends ConcordionTestCase {
	
	public String getSaludo() {
		Saludo saludo = new Saludo();
		assertEquals(saludo.getSaludo(), "Hello World!");
		return saludo.getSaludo();
    }
}
