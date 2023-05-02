package com.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
  @Test
  public void f() { //method
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origin=*");
	  WebDriver driver=new ChromeDriver(co);
	  driver.get("https://www.google.com");
  }
}
