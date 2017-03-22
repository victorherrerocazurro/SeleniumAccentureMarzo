package org.ejemplo.selenium;

import static org.junit.Assert.assertEquals;
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

public class TestGoogle {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.google.es/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testEjemploSeleniumWebDriver() throws Exception {
		driver.get(baseUrl + "/");
		// ERROR: Caught exception [unknown command []]
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		assertTrue(isElementPresent(By.name("btnK")));
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		assertTrue(isElementPresent(By.id("q")));
		driver.findElement(By.id("q")).clear();
		driver.findElement(By.id("q")).sendKeys("webdriver");
		driver.findElement(By.id("submit")).click();
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
