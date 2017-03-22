package _05_SeleniumAPI;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class PresentAndStateElementTest {

//	private static WebDriver driver;
//
//	@BeforeClass
//	public static void setUp() {
//	  
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();		  
//		driver.get("https://es.wikipedia.org/w/index.php?title=Especial:Crear_una_cuenta");
//	}
//	
//	@Test
//	public void testElementsPresence() {
//		
//		if(!isElementPresent(By.name("esteNoEstaNiDeBroma"))){
//			System.out.println("LO SABÕA !!");
//		}	
//		
//		if(!isElementPresent(By.cssSelector("#userloginForm"))) {
//			fail("El elemento #userloginForm no se encuentra en la p√°gina");
//		}
//		
//		if(isElementPresent(By.cssSelector("#wpEditToken"))) {
//			WebElement editToken = driver.findElement(By.cssSelector("#wpEditToken"));
//			
//			assertFalse(editToken.isDisplayed());
//		}
//	}
//	
//	@AfterClass
//	public static void tearDown() throws Exception {		  
//		driver.quit();
//	}	
//	
//	private boolean isElementPresent(By by) {
//		return isElementPresent(by, driver);
//	}
//	
//	private boolean isElementPresent(By by, SearchContext in) {
//		try {
//			in.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
}
