package _06_Events;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TraceListener implements WebDriverEventListener {

	public void beforeNavigateTo(String url, WebDriver driver) {
		
		System.out.println("beforeNavigateTo: " + url);
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		
		System.out.println("afterNavigateTo: " + url);		
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		
		System.out.println("beforeFindBy: " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("beforeClickOn: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		
		System.out.println("beforeChangeValueOf: " + element.toString());
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String filename = df.format(new Date());
		
		try {
			filename = "src/test/resources/exceptions/exception_" + filename + ".png";
			FileUtils.copyFile(scrFile, new File(filename));
		} catch (IOException e) {}		
	}
}
