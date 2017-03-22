package test.concordion.assertTrue;

import org.concordion.integration.junit3.ConcordionTestCase;

public class ComprobacionTextoEsNumeroTest extends ConcordionTestCase {
	public boolean isNumberInteger(String texto){
		try {
			Integer.parseInt(texto);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
