package _06_Events;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class EventTest {

	
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
//	public void testEvents() {
//		
//		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
//		TraceListener myListener = new TraceListener();
//		eventDriver.register(myListener);
//		
//		eventDriver.get("https://es.wikipedia.org/w/index.php?title=Especial:Buscar&search=&fulltext=Buscar&profile=advanced");
//		
//		List<WebElement> checkBoxes = eventDriver.findElements(By.cssSelector("#mw-searchoptions input[name^='ns']"));
//		
//		for (WebElement webElement : checkBoxes) {
//			
//			if (!webElement.isSelected()) {
//				webElement.click();
//			}
//		}
//		
//		WebElement searchTextbox = eventDriver.findElement(By.cssSelector("#searchText .oo-ui-inputWidget-input"));
//		
//		searchTextbox.clear();
//		searchTextbox.sendKeys("Selenium");
//		searchTextbox.submit();
//		
//		eventDriver.findElement(By.cssSelector("excepción para que la capture el evento y haga una captura de pantalla"));
//	}
//	
//	
//	@AfterClass
//	public static void tearDown() {		  
//		driver.quit();
//	}
}
