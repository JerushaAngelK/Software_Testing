package com.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise4 {
	WebDriver driver;
	@BeforeSuite
	void start(){
		 WebDriverManager.chromedriver().setup();
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(co);
		
	}
	
  @Test
  public void Test1() {
	 
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  WebElement name=driver.findElement(By.name("username"));
			  name.sendKeys("Admin");
			  WebElement pwd=driver.findElement(By.name("password"));
			  pwd.sendKeys("admin123");
			  WebElement btn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			  btn.click();
			  try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  String actual=driver.getCurrentUrl();
			  String expected="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			  Assert.assertEquals(actual,expected);
  }

  
  @Test(dependsOnMethods="Test1")
  public void Test2() throws InterruptedException{
	  Thread.sleep(3000);
	  WebElement log=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
	  log.click();
	  Thread.sleep(2000);
	  WebElement out=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
	  out.click();
	  String a=driver.getCurrentUrl();
	  String b="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  Assert.assertEquals(a, b);
	  Thread.sleep(2000);
	  driver.close();
  }
  
}
