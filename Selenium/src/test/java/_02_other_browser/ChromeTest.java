package _02_other_browser;

import static org.junit.Assert.assertNotNull;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Documents\\software\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
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
