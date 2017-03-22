package _03_findBy_avanzado;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

import java.util.List;

public class TableTest {

	
private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
	  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		  
		driver.get("http://www.w3schools.com/html/html_tables.asp");
	}
	
	
	@Test
	public void testTable() {
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"customers\"]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> lastRowColumns = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[last()]/td"));		
		List<WebElement> twoLastRows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[position()>5]"));
				
		List<WebElement> tableElements = table.findElements(By.tagName("td"));
						
		assertNotNull(table);
		assertEquals(rows.size(), 7);
		assertEquals(lastRowColumns.size(), 3);
		assertEquals(twoLastRows.size(), 2);
		
		//check all table are fill
		for (WebElement element : tableElements) {
			assertFalse(element.getText().length() == 0);
		}
	}
	
	
	@AfterClass
	public static void tearDown() throws Exception {		  
		driver.quit();
	}
}
