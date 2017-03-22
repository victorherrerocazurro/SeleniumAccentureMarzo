package _12_appium;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidTest {

	WebDriver driver = null;

	@Before
	public void setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(org.openqa.selenium.Platform.ANDROID);
		caps = DesiredCapabilities.android();
		
		driver = new AndroidDriver<WebElement>(new URL(), caps);
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
