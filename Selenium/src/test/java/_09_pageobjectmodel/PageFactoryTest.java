package _09_pageobjectmodel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class PageFactoryTest {
	
//	private static WebDriver driver;
//
//	@BeforeClass
//	public static void setUp() {
//	  
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get(WikipediaMainPage.url);
//	}
//	
//	@Test
//	public void testSimpleSearch() {
//		
//		WikipediaMainPage page = new WikipediaMainPage(driver);
//				
//		assertEquals("Buscar en Wikipedia", page.getPlaceholder());
//		page.setSearchText("Selenium");
//		page.search();
//		
//		assertEquals("Selenium - Wikipedia, la enciclopedia libre", driver.getTitle());
//	}
//	
//	@AfterClass
//	public static void tearDown() {		  
//		driver.quit();
//	}
}
