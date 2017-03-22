package _02_other_browser;

import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Selenium\\Documents\\software\\IEDriverServer11\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();		  
		driver.get("https://es.wikipedia.org/");
	}
	
	@Test
	public void testId() {
		WebElement portada = driver.findElement(By.id("n-mainpage-description"));
		assertNotNull(portada);
	}
	

	@AfterClass
	  public static void tearDown() throws Exception {
		  
        driver.quit();
    }
}
