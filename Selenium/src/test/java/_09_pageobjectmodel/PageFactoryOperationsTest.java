package _09_pageobjectmodel;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageFactoryOperationsTest {

//	private static WebDriver driver;
//
//	@BeforeClass
//	public static void setUp() {
//	  
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();		
//	}
//	
//	@Test
//	public void testSimpleSearch() {
//		
//		WikipediaMainPageOperationsPage page = new WikipediaMainPageOperationsPage(driver);
//		page.load();
//		page.makeSearch("Selenium");
//		
//		assertEquals("Selenium - Wikipedia, la enciclopedia libre", driver.getTitle());
//		
//		page.close();
//	}
//	
//	@AfterClass
//	public static void tearDown() {		  
//		driver.quit();
//	}
}
