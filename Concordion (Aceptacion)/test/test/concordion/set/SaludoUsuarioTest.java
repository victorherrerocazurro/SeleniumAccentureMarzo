package test.concordion.set;

import org.concordion.integration.junit3.ConcordionTestCase;

public class SaludoUsuarioTest extends ConcordionTestCase {
    
	public String saludaA(String nombre) {
        return "Hola " + nombre + "!";
    }
}
