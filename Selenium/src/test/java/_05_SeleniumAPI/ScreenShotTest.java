package _05_SeleniumAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import _10_extensions.ScreenShotCompare;
import _10_extensions.ScreenShotCompare.Result;

import static org.junit.Assert.*;

public class ScreenShotTest {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
	  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();		  
		driver.get("https://es.wikipedia.org/w/index.php?title=Especial:Buscar&search=&fulltext=Buscar&profile=advanced");
	}
	
	@Test
	public void testCheckBoxes() throws IOException {
		
		
		WebElement mainCheckBox = driver.findElement(By.cssSelector("#mw-search-ns0"));
		assertTrue(mainCheckBox.isSelected());
		
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#mw-searchoptions input[name^='ns']"));
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("src/test/resources/checkBox_before_actual.png"));
		
		assertEquals(Result.Matched, ScreenShotCompare.CompareImage(new File("src/test/resources/checkBox_before.png"), scrFile));
		
		/*for (WebElement webElement : checkBoxes) {
			
			if (!webElement.isSelected()) {
				webElement.click();
			}
		}
		
		File after = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(after, new File("src/test/resources/checkBox_after_actual.png"));
		
		assertEquals(Result.Matched,ScreenShotCompare.CompareImage(new File("src/test/resources/checkBox_after.png"), after));*/
	}
	
	@AfterClass
	public static void tearDown() throws Exception {		  
		driver.quit();
	}
}
