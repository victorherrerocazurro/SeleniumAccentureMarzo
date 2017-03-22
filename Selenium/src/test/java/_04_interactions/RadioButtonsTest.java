package _04_interactions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class RadioButtonsTest {

//	private static WebDriver driver;
//
//	@BeforeClass
//	public static void setUp() {
//	  
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();		  
//		driver.get("https://es.wikipedia.org/wiki/Especial:Contribuciones/");
//	}
//	
//	@Test
//	public void testContributionsSearchRadioButtons() {
//		
//		WebElement newbie = driver.findElement(By.cssSelector("#newbie"));
//		WebElement user = driver.findElement(By.cssSelector("#user"));
//		
//		assertFalse(newbie.isSelected());
//		assertTrue(user.isSelected());
//		
//		newbie.click();
//		
//		assertTrue(newbie.isSelected());
//		assertFalse(user.isSelected());
//	}
//	
//	@AfterClass
//	public static void tearDown() throws Exception {		  
//		driver.quit();
//	}
}
