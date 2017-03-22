package com.selenium.grid;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	WebDriver driver = null;

	@Before
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		caps = DesiredCapabilities.internetExplorer();
		caps.setVersion("11");
		
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
