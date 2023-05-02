package com.day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise2 {
//	WebDriver driver; 
//	@BeforeSuite
//	
//	public void start(){
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		driver=new ChromeDriver(co);		
//	}
  @Test
  public void Test1() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
	    driver.get("https://www.godaddy.com/en-in");
	    Thread.sleep(3000);
		driver.manage().window().maximize();
		String actTit=driver.getTitle();
		System.out.println(actTit);
		String expTit="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		Assert.assertEquals(actTit,expTit);
		Thread.sleep(1500);
		driver.close();
  }
  @Test
  public void Test2() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(co);
	  driver.get("https://www.godaddy.com/en-in");
//	  Thread.sleep(10000);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	  WebElement c1=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]"));
	  Thread.sleep(10000);
	  c1.click();
	  WebElement c2=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]"));
	  Thread.sleep(10000);
	  c2.click();
	  WebElement c3=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
	  Thread.sleep(10000);
	  c3.click();
//	  driver.close();
	  
  }
  @Test
  public void Test3() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
	    driver.get("https://www.godaddy.com/en-in");
//	    Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		  WebElement c1=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]"));
		  Thread.sleep(10000);
		  c1.click();
		  WebElement c2=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]"));
		  Thread.sleep(10000);
		  c2.click();
		  WebElement c3=driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"));
		  Thread.sleep(10000);
		  c3.click();
		String x=driver.getTitle();
		System.out.println(x);
		Thread.sleep(10000);
//		driver.close();
  }
 
}
