package org.ejemplo.selenium;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PruebaServidor {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testPruebaServidor() throws Exception {
		driver.get(baseUrl + "/05-Servidor/");
		assertTrue(isElementPresent(By.name("nombre")));
		assertTrue(isElementPresent(By.name("mail")));
		driver.findElement(By.name("nombre")).clear();
		driver.findElement(By.name("nombre")).sendKeys("nombre");
		driver.findElement(By.name("mail")).clear();
		driver.findElement(By.name("mail")).sendKeys("mail@mail.es");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		assertTrue(isElementPresent(By.id("nombre")));
		assertTrue(isElementPresent(By.id("mail")));
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
