package test.concordion.assertequals;

import junit.framework.TestCase;

public class SaludoTest extends TestCase {

	public SaludoTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetSaludo() {
		Saludo saludo = new Saludo();
		assertEquals(saludo.getSaludo(), "Hellow World!");
	}

}
