package _03_findBy_avanzado;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class XpathTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
	  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		  
		driver.get("https://es.wikipedia.org/");
	}

	@Test
	public void testElementsWithAbsolutePath() {
				
		WebElement print = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/h3"));		
		WebElement otherProjects = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[4]/h3"));
		WebElement tools = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[5]/h3"));
		WebElement languages = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[6]/h3"));
		
		assertNotNull(print);
		assertNotNull(otherProjects);
		assertNotNull(tools);
		assertNotNull(languages);
	}
	
	
	@Test 
	public void testElementsWithRelativePath() {
		
		WebElement print = driver.findElement(By.xpath("//*[@id=\"p-coll-print_export-label\"]"));		
		WebElement otherProjects = driver.findElement(By.xpath("//*[@id=\"p-wikibase-otherprojects-label\"]"));
		WebElement tools = driver.findElement(By.xpath("//*[@id=\"p-tb-label\"]"));
		WebElement languages = driver.findElement(By.xpath("//*[@id=\"p-lang-label\"]"));
		
		assertNotNull(print);
		assertNotNull(otherProjects);
		assertNotNull(tools);
		assertNotNull(languages);
	}
	
	
	@AfterClass
	  public static void tearDown() throws Exception {
		  
      driver.quit();
  }
}
