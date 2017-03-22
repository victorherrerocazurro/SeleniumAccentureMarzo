package _05_SeleniumAPI;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

import java.util.Set;


public class CookiesTest {
	
//	private static WebDriver driver;
//
//	@BeforeClass
//	public static void setUp() {
//	  
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();		  
//		driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
//	}
//
//	@Test
//	public void testCookies() {
//	     
//	     Cookie geoIPCookie = driver.manage().getCookieNamed("GeoIP");
//	     assertNotNull(geoIPCookie);
//	     
//	     Set<Cookie> cookies = driver.manage().getCookies();
//	     assertEquals(cookies.size() > 0, true);
//	     
//	     driver.manage().deleteAllCookies();
//	     
//	     cookies = driver.manage().getCookies();
//	     assertEquals(cookies.size() == 0, true);
//	}
//	
//	@AfterClass
//	public static void tearDown() throws Exception {		  
//		driver.quit();
//	}
}
