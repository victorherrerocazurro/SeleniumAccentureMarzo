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

public class DragAndDropTest {

//	private static WebDriver driver;
//
//	@BeforeClass
//	public static void setUp() {
//	  
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();		  
//		driver.get("http://cookbook.seleniumacademy.com/DragDropDemo.html");
//	}
//	
//	@Test
//	public void testDragAndDrop() {
//		
//		WebElement source = driver.findElement(By.id("draggable"));
//	    WebElement target = driver.findElement(By.id("droppable"));
//	     
//	    Actions builder = new Actions(driver);
//	    builder.dragAndDrop(source, target) .perform();
//	    assertEquals("Dropped!", target.getText());
//	}
//	
//	@AfterClass
//	public static void tearDown() throws Exception {		  
//		driver.quit();
//	}
}
