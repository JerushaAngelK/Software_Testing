package com.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise1 {
  @Test
  public void Test1() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String actual=driver.getTitle();
	  String expected="Guest Registration Form – User Registration";
//	  System.out.println(actual);
	  Assert.assertEquals(actual,expected);
  }
}
