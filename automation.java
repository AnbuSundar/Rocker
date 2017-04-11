package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {
  private WebDriver driver;
  private String baseUrl;
 // private boolean acceptNextAlert = true;
  //private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.testwave.qabidder.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAutomation() throws Exception {
    driver.get(baseUrl + "/#/page/login");
    driver.findElement(By.id("exampleInputEmail1")).clear();
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("new@mailinator.com");
    driver.findElement(By.id("exampleInputPassword1")).click();
    driver.findElement(By.id("exampleInputPassword1")).clear();
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("testing");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.cssSelector("a.ng-scope > span.ng-binding")).click();
    driver.findElement(By.xpath("//h3/button")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("comas");
    driver.findElement(By.name("address1")).click();
    driver.findElement(By.name("address1")).clear();
    driver.findElement(By.name("address1")).sendKeys("main st");
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("san Jose");
    driver.findElement(By.name("zip")).click();
    driver.findElement(By.name("zip")).clear();
    driver.findElement(By.name("zip")).sendKeys("12345");
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.name("state")).click();
    new Select(driver.findElement(By.name("state"))).selectByVisibleText("South Carolina");
    driver.findElement(By.xpath("(//option[@value='SC'])[2]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.cssSelector("div.bootstrap-tagsinput.focus > input[type=\"text\"]")).click();
    driver.findElement(By.cssSelector("div.bootstrap-tagsinput.focus > input[type=\"text\"]")).clear();
    driver.findElement(By.cssSelector("div.bootstrap-tagsinput.focus > input[type=\"text\"]")).sendKeys("hi@mailinator.com");
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.cssSelector("div.text-right > button.btn.btn-primary")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.id("loadLogin")).click();
    driver.findElement(By.id("login_email")).clear();
    driver.findElement(By.id("login_email")).sendKeys("anbu.sundara-buyer@gmail.com");
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("exampleInputEmail1")).clear();
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("new@mailinator.com");
    driver.findElement(By.id("exampleInputPassword1")).click();
    driver.findElement(By.id("exampleInputPassword1")).clear();
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("testing");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.cssSelector("a.ng-scope > span.ng-binding")).click();
  }

  @After
  public void tearDown() throws Exception {
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
