package _04_interactions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class SimpleSearchTest {
	
//	private static WebDriver driver;
//
//	@BeforeClass
//	public static void setUp() {
//	  
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();		  
//		driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
//	}
//	
//	@Test
//	public void testSimpleSearch() {
//		
//		WebElement searchTextbox = driver.findElement(By.cssSelector("#searchInput"));
//		
////		String placeholderSearch = searchTextbox.getAttribute("placeholder");
////		assertEquals("Buscar en Wikipedia", placeholderSearch);
////		
////		String fontSizeSearch = searchTextbox.getCssValue("font-size");
////		assertEquals("13px", fontSizeSearch);
//		
//		searchTextbox.clear();
//		searchTextbox.sendKeys("Selenium");
//		searchTextbox.submit();
//		
////		WebElement searchButton = driver.findElement(By.cssSelector("#searchButton"));
////		searchButton.click();
//		
//		assertEquals("Selenium - Wikipedia, la enciclopedia libre", driver.getTitle());
//	}
//	
//	
//	@AfterClass
//	public static void tearDown() throws Exception {		  
//		driver.quit();
//	}
}
