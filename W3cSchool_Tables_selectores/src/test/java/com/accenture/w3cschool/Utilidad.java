package com.accenture.w3cschool;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilidad {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		File capturaOriginal = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(capturaOriginal, new File("src/test/resources/html_tables.png"));
		
	}
	
}
