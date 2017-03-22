package com.selenium.gridtest;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SouceLabsTest {

//	WebDriver driver = null;
//
//	@Before
//	public void setup() throws MalformedURLException {
//		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setPlatform(org.openqa.selenium.Platform.MAC);
//		caps = DesiredCapabilities.internetExplorer();		
//		
//		driver = new RemoteWebDriver(new URL(MessageFormat.format("http://{0}:{1}@ondemand.saucelabs.com:80/wd/hub'", "pronoideborja", "ea26523b-7d92-4451-a00e-f7a10e2c8ed5")), caps);				   
//		driver.get("http://www.google.com");
//	}
//
//	@Test
//	public void testTitle() throws InterruptedException {		
//		assertEquals("Google", driver.getTitle());
//	}
//
//	@After
//	public void afterTest() {
//		driver.quit();
//	}
}
