package _04_interactions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class DropdownsTest {

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
//	public void testContributionsDropdown() {
//				
//		Select namespace = new Select(driver.findElement(By.cssSelector("#namespace")));
//		
//		assertFalse(namespace.isMultiple());
//		assertEquals(32, namespace.getOptions().size());
//		
//		namespace.selectByVisibleText("Usuario");
//		assertEquals("Usuario", namespace.getFirstSelectedOption().getText());
//
//		namespace.selectByValue("8");
//		assertEquals("MediaWiki", namespace.getFirstSelectedOption().getText());
//
//		namespace.selectByIndex(13);
//		assertEquals("Ayuda", namespace.getFirstSelectedOption().getText());
//	}
//	
//	@Test
//	public void testMonthDropdown() {
//		
//		Select month = new Select(driver.findElement(By.cssSelector("#month")));
//		List<String> actualValues = new ArrayList<String>();
//		
//		for (WebElement element : month.getOptions()) {
//			actualValues.add(element.getText());
//		}
//		
//		assertArrayEquals(monthDropDownList().toArray(), actualValues.toArray());
//	}
//	
//	@AfterClass
//	public static void tearDown() throws Exception {		  
//		driver.quit();
//	}
//	
//	public List<String> monthDropDownList() {
//	
//		List<String> months = new ArrayList<String>();
//		months.add("(todos)");
//		months.addAll(Arrays.asList(new DateFormatSymbols().getMonths()));
//		months.remove(months.size() - 1);
//		return months;
//	}
}
