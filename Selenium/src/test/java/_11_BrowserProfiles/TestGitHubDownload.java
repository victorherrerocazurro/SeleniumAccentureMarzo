package _11_BrowserProfiles;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.FluentWait;

import _10_extensions.CsvUtils;

@RunWith(Parameterized.class)
public class TestGitHubDownload {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  private String repositorio;
  
  @Parameters
  public static Collection<String[]> testData() throws IOException {
    return CsvUtils.getTestData("./src/test/resources/testData/repositorios.csv");
  }
  
  public TestGitHubDownload(String repositorio) {
	super();
	this.repositorio = repositorio;
}



@Before
  public void setUp() throws Exception {
    FirefoxProfile profile = new FirefoxProfile();
    
    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
    
	driver = new FirefoxDriver(profile);
    baseUrl = "https://github.com/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGitHubDownload() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.name("q")).sendKeys("victorherrerocazurro");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    
    FluentWait<By> fluentWait = new FluentWait<By>(By.partialLinkText("Users"))
			.withTimeout(1000, TimeUnit.MILLISECONDS)
			.pollingEvery(200, TimeUnit.MILLISECONDS)
			.ignoring(NoSuchElementException.class);
    
    driver.findElement(By.partialLinkText("Users")).click();
    
    fluentWait = new FluentWait<By>(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/a"))
			.withTimeout(1000, TimeUnit.MILLISECONDS)
			.pollingEvery(200, TimeUnit.MILLISECONDS)
			.ignoring(NoSuchElementException.class);
    
    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/a")).click();
    
    fluentWait = new FluentWait<By>(By.xpath("//div[@id='js-pjax-container']/div/div[2]/div[2]/nav/a[2]"))
			.withTimeout(1000, TimeUnit.MILLISECONDS)
			.pollingEvery(200, TimeUnit.MILLISECONDS)
			.ignoring(NoSuchElementException.class);
    
    driver.findElement(By.xpath("//div[@id='js-pjax-container']/div/div[2]/div[2]/nav/a[2]")).click();
    
    
	fluentWait = new FluentWait<By>(By.linkText(repositorio))
			.withTimeout(1000, TimeUnit.MILLISECONDS)
			.pollingEvery(200, TimeUnit.MILLISECONDS)
			.ignoring(NoSuchElementException.class);
    
    driver.findElement(By.linkText(repositorio)).click();
    
    fluentWait = new FluentWait<By>(By.xpath("(//button[@type='button'])[2]"))
			.withTimeout(1000, TimeUnit.MILLISECONDS)
			.pollingEvery(200, TimeUnit.MILLISECONDS)
			.ignoring(NoSuchElementException.class);
    
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.linkText("Download ZIP")).click();
  }

  @After
  public void tearDown() throws Exception {
	  
	  while(Files.exists(Paths.get("C:\\Users\\Selenium\\Downloads\\" + repositorio + "-master.zip.part"))){
		  Thread.sleep(1000);
	  }
	  
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

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
