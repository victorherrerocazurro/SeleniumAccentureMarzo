package _07_sincronization;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;
import static org.junit.Assert.*;

public class SincronizationTest {
	
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
//	public void testSincronizationWithWaits() {
//		
//		WebElement searchButton = driver.findElement(By.cssSelector("#searchButton"));
//		searchButton.click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.titleContains("Buscar"));
//		
//		WebElement multimedia = (driver.findElements(By.cssSelector("#search .search-types li"))).get(1);
//		multimedia.click();
//		
//		WebElement searchBox = driver.findElement(By.cssSelector("#searchText .oo-ui-inputWidget-input"));
//		searchBox.sendKeys("selenium");
//		searchBox.submit();
//		
//		FluentWait<By> fluentWait = new FluentWait<By>(By.cssSelector(".results-info"))
//				.withTimeout(1000, TimeUnit.MILLISECONDS)
//				.pollingEvery(200, TimeUnit.MILLISECONDS)
//				.ignoring(NoSuchElementException.class);
//		
//		/*
//		 * Un Predicate siempre devuelve Boolean
//		 * Un Function puede devolver un Boolean o un WebElement
//		 * 
//		 */
//		
//		fluentWait.until(new Predicate<By>() {
//			public boolean apply(By by) {				
//				return driver.findElement(by).isDisplayed();
//			}
//		});
//		
//		driver.findElements(By.cssSelector(".mw-search-results li")).get(0).click();
//		assertTrue(driver.getTitle().endsWith("- Wikipedia, la enciclopedia libre"));
//	}
//	
//	
//	@AfterClass
//	public static void tearDown() {		  
//		driver.quit();
//	}
}
