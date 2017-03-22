package test.concordion.verifyrow;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.concordion.integration.junit3.ConcordionTestCase;

public class BusquedaColeccionTest extends ConcordionTestCase {
	
	private Set<String> usuariosSistema = new HashSet<String>();

    public void setUpUsuarios(String usuario) {
    	usuariosSistema.add(usuario);
    }

    public Iterable<String> resultadosBusquedaPara(String textoBuscado) {
        SortedSet<String> encontrados = new TreeSet<String>();
        for (String usuario : usuariosSistema) {
            if (usuario.contains(textoBuscado)) {
            	encontrados.add(usuario);
            }
        }
        return encontrados;
    }
}
