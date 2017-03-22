package com.accenture.w3cschool;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestW3CSchoolTables {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.w3schools.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testW3cSchoolTables() throws Exception {
    driver.get(baseUrl + "html/html_tables.asp");
    
    byte[] capturaActual = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    
    byte[] capturaEsperada = FileUtils.readFileToByteArray(new File("src/test/resources/html_tables.png"));
    
    Assert.assertEquals(capturaEsperada, capturaActual);
    
    WebElement table = driver.findElement(By.id("customers"));
    
    WebElement table2 = driver.findElement(By.xpath("//*[@id=\"customers\"]"));
    
    WebElement table5 = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div/table"));
    
    WebElement table3 = driver.findElement(By.cssSelector("html body div#belowtopnav.w3-main.w3-light-grey div.w3-row.w3-white div#main.w3-col.l10.m12 div.w3-example div.w3-white.w3-padding.notranslate table#customers"));
    
    WebElement table4 = driver.findElement(By.cssSelector("table#customers"));
    
    Assert.assertNotNull(table);
    
    List<WebElement> filas = table.findElements(By.tagName("tr"));
    
    List<WebElement> filas2 = driver.findElements(By.cssSelector("table#customers tr"));
    
    Assert.assertTrue(filas.size() > 0);
    
    
    WebElement paisMejico = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[3]/td[3]"));
    
    Assert.assertEquals("Mexico", paisMejico.getText());
    
    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
}
