package _01_findBy;

import static org.junit.Assert.*;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByTest {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://es.wikipedia.org/");
	}

	@Test
	public void testId() {
		WebElement portada = driver.findElement(By.id("n-mainpage-description"));
		assertNotNull(portada);
	}

	@Test
	public void testByClassName() {

		List<WebElement> elements = driver.findElement(By.id("p-navigation"))
										.findElement(By.className("body"))
										.findElements(By.tagName("li"));

		for (WebElement element : elements) {
			assertNotNull(element);
		}

		assertEquals(elements.size(), 9); // 8 + 1 for one bug
	}

	@Test
	public void testLinks() {
		WebElement contributions = driver.findElement(By.linkText("Contribuciones"));
		assertNotNull(contributions);
	}

	@Test
	public void testPartialLinks() {
		WebElement month = driver.findElement(By.partialLinkText(currentMonthName()));
		assertNotNull(month);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

	private String currentMonthName() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);

		return new DateFormatSymbols().getMonths()[month];
	}
}
