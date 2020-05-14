package com.fca.calidad.funcionales;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UadyVirtualLoginTest{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver"," /Users/JUANM/Documents/chromedriver");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
	  public void testCasoDePruebaFallidaUady() throws Exception {
		 driver.get("https://www.google.com/search?q=uady+virtual&rlz=1C1CHBF_esMX872MX873&oq=ua&aqs=chrome.0.69i59j69i57j35i39j46l2j0l3.1159j0j8&sourceid=chrome&ie=UTF-8");
		 driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/a/div")).click();
		 driver.findElement(By.xpath("//nav[@id='essentialnavbar']/div/div/div/div/div/div/ul/li/a/em")).click();
		 driver.findElement(By.xpath("//form[@id='login']/div")).click();
		 driver.findElement(By.id("username")).clear();
		 driver.findElement(By.id("username")).sendKeys("aadadada");
		 driver.findElement(By.id("yui_3_17_2_1_1589423028089_39")).click();
		 driver.findElement(By.id("password")).clear();
		 driver.findElement(By.id("password")).sendKeys("adadadad");
		 driver.findElement(By.id("loginbtn")).click();
		//assertTextoPresent();
		
	    
  }
  @Test
  public void testCasoDePruebaUadyacertada() throws Exception {
    driver.get("https://www.google.com/search?q=uady+virtual&rlz=1C1CHBF_esMX872MX873&oq=ua&aqs=chrome.0.69i59j69i57j35i39j46l2j0l3.1159j0j8&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/a/h3")).click();
    driver.findElement(By.linkText("Ingresar")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("a16111353");
    driver.findElement(By.id("yui_3_17_2_1_1589417984910_38")).click();
    driver.findElement(By.id("yui_3_17_2_1_1589417984910_36")).click();
    driver.findElement(By.id("password")).sendKeys("Manolito12345");;
    driver.findElement(By.id("loginbtn")).click();
   // assertTextoPresent = (By.id("page-my-index"));	
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
