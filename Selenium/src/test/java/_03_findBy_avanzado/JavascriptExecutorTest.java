package _03_findBy_avanzado;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutorTest {
	
	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		  
		driver.get("https://es.wikipedia.org/w/index.php?title=Especial:Buscar&search=&fulltext=Buscar&profile=advanced");
	}
	
	
	@Test
	public void findAdvancedSearchComponentsWithjQuerySelectors() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		@SuppressWarnings("unchecked")
		List<WebElement> elementsChecked = (List<WebElement>)js.executeScript("return jQuery.find(':checked')");
		
		@SuppressWarnings("unchecked")
		List<WebElement> elementsUnChecked = (List<WebElement>)js.executeScript("return jQuery.find('input:checkbox:not(:checked)')");
		
		assertEquals(elementsChecked.size(), 3);
		assertEquals(elementsUnChecked.size(), 27);
	}
	
	
	@AfterClass
	public static void tearDown() throws Exception {		  
		driver.quit();
	}
	
}
