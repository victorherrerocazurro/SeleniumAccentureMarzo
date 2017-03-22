package com.selenium.gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.Assert.*;

public class SeGridTest {

	WebDriver driver = null;

	@Before
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(org.openqa.selenium.Platform.MAC);
		caps = DesiredCapabilities.firefox();
		caps.setVersion("30.0");
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
		driver.get("http://www.google.com");
	}

	@Test
	public void testTitle() throws InterruptedException {		
		assertEquals("Google", driver.getTitle());
	}

	@After
	public void afterTest() {
		driver.quit();
	}
}
