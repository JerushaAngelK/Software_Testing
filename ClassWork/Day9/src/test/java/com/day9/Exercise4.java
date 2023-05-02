package com.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Exercise4 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement name=driver.findElement(By.name("username"));
	  Thread.sleep(2000);
	  name.sendKeys("Admin");
	  Thread.sleep(2000);
	  WebElement pwd=driver.findElement(By.name("password"));
	  Thread.sleep(2000);
	  pwd.sendKeys("admin123");
	  Thread.sleep(2000);
	  WebElement btn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  Thread.sleep(2000);
	  btn.click();
	  String actual=driver.getCurrentUrl();
	  String expected="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  Assert.assertEquals(actual,expected);
  }
  
  @Parameters({"browser"})
  @BeforeMethod()
  public void beforeMethod(String browser1) throws InterruptedException {
	  if(browser1.equals("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(co);
	  }
	  else if(browser1.equals("edge")) {
		  WebDriverManager.edgedriver().setup();
		  EdgeOptions co=new EdgeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver=new EdgeDriver(co);
		  
	  }
	  else if(browser1.equals("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  FirefoxOptions co=new FirefoxOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver=new FirefoxDriver(co);
		  
	  }
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
  
  
}
