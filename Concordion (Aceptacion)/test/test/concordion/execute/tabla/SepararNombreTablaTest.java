package test.concordion.execute.tabla;

import org.concordion.integration.junit3.ConcordionTestCase;

public class SepararNombreTablaTest extends ConcordionTestCase {
	
	//El Test
	public Resultado split(String fullName) {
		Resultado result = new Resultado();
        String[] words = fullName.split(" ");
        result.nombre = words[0];
        result.apellido = words[1];
        return result;
    }

    class Resultado {
        public String nombre;
        public String apellido;
    }
}
