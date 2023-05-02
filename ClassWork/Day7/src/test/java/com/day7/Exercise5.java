package com.day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise5 {
	WebDriver driver; 
//	@BeforeSuite
//	
//	public void start(){
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		driver=new ChromeDriver(co);		
//	}
  @Test(groups="SmokeTest")
  public void Test1() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
	    driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		String actTit=driver.getTitle();
		System.out.println(actTit);
		String expTit="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		Assert.assertEquals(actTit,expTit);
		Thread.sleep(1500);
		driver.close();
  }
  @Test(groups="RegressionTest")
  public void Test2() throws InterruptedException {
//	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(co);
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	  WebElement c1=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/button"));
	  c1.click();
	  Thread.sleep(1000);
	  WebElement c2=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]"));
	  c2.click();
	  Thread.sleep(1000);
	  WebElement c3=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
	  c3.click();
	  Thread.sleep(1000);
	  driver.close();
	  
  }
  @Test(groups="RegressionTest")
  public void Test3() throws InterruptedException {
//	    WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
	    driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		Thread.sleep(1000);
		WebElement c1=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/button"));
		c1.click();
		Thread.sleep(1000);
		WebElement c2=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]"));
		c2.click();
		Thread.sleep(1000);
		WebElement c3=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
		c3.click();
		Thread.sleep(2000);
		String x=driver.getTitle();
		System.out.println(x);
  }
}
