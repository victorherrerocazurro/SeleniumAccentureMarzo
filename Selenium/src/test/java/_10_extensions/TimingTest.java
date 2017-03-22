package _10_extensions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimingTest {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testTiming() {
		
		driver.get("http://es.wikipedia.org/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		long loadEventEnd = (Long)js.executeScript("return window.performance.timing.loadEventEnd;");
		long navigationStart = (Long) js.executeScript("return window.performance.timing.navigationStart;");
		
		System.out.println("Page Load Time is " + (loadEventEnd - navigationStart)/1000 + " seconds.");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
