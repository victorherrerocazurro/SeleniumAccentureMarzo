package test.concordion;

import junit.framework.Test;
import junit.framework.TestSuite;
import test.concordion.assertTrue.ComprobacionTextoEsNumeroTest;
import test.concordion.assertequals.HelloWorldTest;
import test.concordion.execute.objeto.SepararNombreTest;
import test.concordion.execute.tabla.SepararNombreTablaSimplificadoTest;
import test.concordion.execute.tabla.SepararNombreTablaTest;
import test.concordion.execute.vacio.Despertador;
import test.concordion.set.SaludoUsuarioTest;
import test.concordion.verifyrow.BusquedaColeccionTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(HelloWorldTest.class);
		suite.addTestSuite(ComprobacionTextoEsNumeroTest.class);
		suite.addTestSuite(SepararNombreTest.class);
		suite.addTestSuite(SepararNombreTablaTest.class);
		suite.addTestSuite(SepararNombreTablaSimplificadoTest.class);
		suite.addTestSuite(Despertador.class);
		suite.addTestSuite(SaludoUsuarioTest.class);
		suite.addTestSuite(BusquedaColeccionTest.class);
		//$JUnit-END$
		return suite;
	}

}
