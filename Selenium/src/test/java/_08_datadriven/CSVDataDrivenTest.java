package _08_datadriven;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Predicate;

import _10_extensions.CsvUtils;

@RunWith(Parameterized.class)
public class CSVDataDrivenTest {

	 private static WebDriver driver;

	private String username;
	private String password;
	private String confirmPassword;
	private String email;
	private String captcha;
     
     @Parameters
     public static Collection<String[]> testData() throws IOException {
       return CsvUtils.getTestData("./src/test/resources/testData/registerData.csv");
     }
     
     public CSVDataDrivenTest(String username, String password, String confirmPassword, String email, String captcha) {
  	   this.username = username;
  	   this.password = password;
  	   this.confirmPassword = confirmPassword;
  	   this.email = email;
  	   this.captcha = captcha;
     }
     
 	@BeforeClass
 	public static void setUp() {
 	  
 		driver = new FirefoxDriver();
 		driver.manage().window().maximize();
 		driver.get("https://es.wikipedia.org/w/index.php?title=Especial:Crear_una_cuenta");
 	}
     
 	@Test
    public void testRegister()  {
 	   
 	 WebElement usernameElement = driver.findElement(By.cssSelector("#wpName2"));
 	 usernameElement.clear();
 	 usernameElement.sendKeys(username);
 	 
 	 WebElement passElement = driver.findElement(By.cssSelector("#wpPassword2"));
 	 passElement.clear();
 	 passElement.sendKeys(password);
 	 
 	 WebElement confirmPassElement = driver.findElement(By.cssSelector("#wpRetype"));
 	 confirmPassElement.clear();
 	 confirmPassElement.sendKeys(confirmPassword);
 	 
 	 WebElement emailElement = driver.findElement(By.cssSelector("#wpEmail"));
 	 emailElement.clear();
 	 emailElement.sendKeys(email);
 	 
 	 WebElement captchaElement = driver.findElement(By.cssSelector("#mw-input-captchaWord"));
 	 captchaElement.clear();
 	 captchaElement.sendKeys(captcha);	 	 
 	 
 	 WebElement submitButton = driver.findElement(By.cssSelector("#wpCreateaccount"));
 	 submitButton.click();
      
 	 FluentWait<By> fluentWait = new FluentWait<By>(By.cssSelector(".error"))
 				.withTimeout(10, TimeUnit.SECONDS)
 				.pollingEvery(2, TimeUnit.SECONDS);
 		
 		fluentWait.until(new Predicate<By>() {
 			public boolean apply(By by) {				
 				return driver.findElement(by).isDisplayed();
 			}
 		});
    }
     
     @AfterClass
     public static void tearDown() throws Exception {
       // Close the browser
       driver.quit();
     }

}
