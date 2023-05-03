package com.cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		name.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pwd.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		btn.click();
		Thread.sleep(2000);
		WebElement add=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		add.click();
		Thread.sleep(3000);
		String a="https://www.saucedemo.com/inventory.html";
		String x=driver.getCurrentUrl();
		Assert.assertEquals(a, x);
		System.out.println("Added to Cart");
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cart.click();
		Thread.sleep(3000);
		String b="https://www.saucedemo.com/cart.html";
		String y=driver.getCurrentUrl();
		Assert.assertEquals(b,y);
		System.out.println("Cart Viewed");
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		checkout.click();
		Thread.sleep(3000);
		String expected1="https://www.saucedemo.com/checkout-step-one.html";
		String actual1=driver.getCurrentUrl();
		Assert.assertEquals(actual1,expected1);
		System.out.println("Your Information Page is Displayed");
		Thread.sleep(2000);
		WebElement first=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		first.sendKeys("Mink");
		Thread.sleep(2000);
		WebElement last=driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		last.sendKeys("Lynn");
		Thread.sleep(2000);
		WebElement code=driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
		code.sendKeys("123456");
		Thread.sleep(2000);
		WebElement con=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		con.click();
		Thread.sleep(2000);
		String expected2="https://www.saucedemo.com/checkout-step-two.html";
		String actual2=driver.getCurrentUrl();
		Assert.assertEquals(actual2,expected2);
		System.out.println("Details are Visible");
		String pname=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("Product Name: "+pname);
		Thread.sleep(1000);
		String pprice=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
		System.out.println("Product Price; "+pprice);
		Thread.sleep(1000);
		String expected3="Swag Labs";
		String actual3=driver.getTitle();
//		System.out.println(actual3);
		Assert.assertEquals(expected3,actual3);
		Thread.sleep(1000);
		String expected4="https://www.saucedemo.com/checkout-step-two.html";
		String actual4=driver.getCurrentUrl();
		Assert.assertEquals(actual4,expected4);

	}

}
