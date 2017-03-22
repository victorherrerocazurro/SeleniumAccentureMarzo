package _03_findBy_avanzado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {
	
	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		  
		driver.get("https://es.wikipedia.org/w/index.php?title=Especial:Buscar&search=&fulltext=Buscar&profile=advanced");
	}
	
	
	@Test
	public void findAdvancedSearchComponentsWithCSSselectors() {
		
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#mw-searchoptions input[name^='ns']"));
		WebElement searchBox = driver.findElement(By.cssSelector("#searchText .oo-ui-inputWidget-input"));
		//WebElement searchBox = driver.findElement(By.cssSelector("#searchText.oo-ui-inputWidget-input")); //si está junto no lo encuentra, porque no existe ningun elemento con id=search.. Y de la clase .oo-ui...
		WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit'][role='button']"));
		
		assertEquals(checkBoxes.size(), 30);
		assertNotNull(searchBox);
		assertNotNull(searchButton);

	}
	
	@AfterClass
	public static void tearDown() throws Exception {		  
		driver.quit();
	}
	
}
