package _08_datadriven;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.base.Predicate;
//import com.opencsv.CSVReader;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

//@RunWith(Parameterized.class)
public class CSVDataDrivenTest {

//	 private static WebDriver driver;
//
//	private String username;
//	private String password;
//	private String confirmPassword;
//	private String email;
//	private String captcha;
//     
//     @Parameters
//     public static List<String[]> testData() throws IOException {
//       return getTestData("./src/test/resources/testData/registerData.csv");
//     }
//     
//     public CSVDataDrivenTest(String username, String password, String confirmPassword, String email, String captcha) {
//  	   this.username = username;
//  	   this.password = password;
//  	   this.confirmPassword = confirmPassword;
//  	   this.email = email;
//  	   this.captcha = captcha;
//     }
//     
//     public static List<String[]> getTestData(String fileName) throws IOException {
//           CSVReader reader = new CSVReader(new FileReader(fileName));
//           List<String[]> myEntries = reader.readAll();
//           reader.close();
//           return myEntries;
//     }
//     
// 	@BeforeClass
// 	public static void setUp() {
// 	  
// 		driver = new FirefoxDriver();
// 		driver.manage().window().maximize();
// 		driver.get("https://es.wikipedia.org/w/index.php?title=Especial:Crear_una_cuenta");
// 	}
//     
// 	@Test
//    public void testRegister()  {
// 	   
// 	 WebElement usernameElement = driver.findElement(By.cssSelector("#wpName2"));
// 	 usernameElement.clear();
// 	 usernameElement.sendKeys(username);
// 	 
// 	 WebElement passElement = driver.findElement(By.cssSelector("#wpPassword2"));
// 	 passElement.clear();
// 	 passElement.sendKeys(password);
// 	 
// 	 WebElement confirmPassElement = driver.findElement(By.cssSelector("#wpRetype"));
// 	 confirmPassElement.clear();
// 	 confirmPassElement.sendKeys(confirmPassword);
// 	 
// 	 WebElement emailElement = driver.findElement(By.cssSelector("#wpEmail"));
// 	 emailElement.clear();
// 	 emailElement.sendKeys(email);
// 	 
// 	 WebElement captchaElement = driver.findElement(By.cssSelector("#mw-input-captchaWord"));
// 	 captchaElement.clear();
// 	 captchaElement.sendKeys(captcha);	 	 
// 	 
// 	 WebElement submitButton = driver.findElement(By.cssSelector("#wpCreateaccount"));
// 	 submitButton.click();
//      
// 	 FluentWait<By> fluentWait = new FluentWait<By>(By.cssSelector(".error"))
// 				.withTimeout(10, TimeUnit.SECONDS)
// 				.pollingEvery(2, TimeUnit.SECONDS);
// 		
// 		fluentWait.until(new Predicate<By>() {
// 			public boolean apply(By by) {				
// 				return driver.findElement(by).isDisplayed();
// 			}
// 		});
//    }
//     
//     @AfterClass
//     public static void tearDown() throws Exception {
//       // Close the browser
//       driver.quit();
//     }

}
