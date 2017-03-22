package org.ejemplo.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test05Servidor {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testEjercicioWebDriver1() throws Exception {
		driver.get(baseUrl + "/05-Servidor/");
		assertTrue(isElementPresent(By.name("mail")));
		assertTrue(isElementPresent(By.name("nombre")));
		driver.findElement(By.name("nombre")).clear();
		driver.findElement(By.name("nombre")).sendKeys("mi nombre");
		driver.findElement(By.name("mail")).clear();
		driver.findElement(By.name("mail")).sendKeys("Mi mail");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		assertEquals("Datos enviados", driver.getTitle());
		assertTrue(isElementPresent(By.id("nombre")));
		assertTrue(isElementPresent(By.id("mail")));
		assertEquals("mi nombre", driver.findElement(By.id("nombre")).getText());
		assertEquals("Mi mail", driver.findElement(By.id("mail")).getText());
		driver.findElement(By.linkText("inicio")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
