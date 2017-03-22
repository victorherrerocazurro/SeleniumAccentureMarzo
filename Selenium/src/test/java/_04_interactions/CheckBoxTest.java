package _04_interactions;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class CheckBoxTest {

	
	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
	  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		  
		driver.get("https://es.wikipedia.org/w/index.php?title=Especial:Buscar&search=&fulltext=Buscar&profile=advanced");
	}
	
	@Test
	public void testCheckBoxes() {
				
		WebElement mainCheckBox = driver.findElement(By.cssSelector("#mw-search-ns0"));
		assertTrue(mainCheckBox.isSelected());
		
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#mw-searchoptions input[name^='ns']"));
		
		for (WebElement webElement : checkBoxes) {
			
			if (!webElement.isSelected()) {
				webElement.click();
			}
		}
		
		for (WebElement webElement : checkBoxes) {			
			assertTrue(webElement.isSelected());
		}
	}
	
	@AfterClass
	public static void tearDown() throws Exception {		  
		driver.quit();
	}
}
