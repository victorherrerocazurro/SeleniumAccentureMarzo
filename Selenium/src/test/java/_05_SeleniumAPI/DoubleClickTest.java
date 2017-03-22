package _05_SeleniumAPI;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class DoubleClickTest {
	
//	private static WebDriver driver;
//
//	@BeforeClass
//	public static void setUp() {
//	  
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();		  
//		driver.get("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");
//	}
//
//	@Test
//    public void testDoubleClick() {
//
//        WebElement message = driver.findElement(By.id("message"));
//     
//        // Verify color is Blue
//        assertEquals("rgba(0, 0, 255, 1)",message.getCssValue("background-color"));
//        
//        Actions builder = new Actions(driver);
//        builder.doubleClick(message).perform();
//     
//        // Verify Color is Yellow
//        assertEquals("rgba(255, 255, 0, 1)",message.getCssValue("background-color"));
//    }
//	
//	@AfterClass
//	public static void tearDown() throws Exception {		  
//		driver.quit();
//	}
}
