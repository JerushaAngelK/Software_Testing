package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement new1=driver.findElement(By.name("q"));
		new1.sendKeys("Apple");
		new1.sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement new2=driver.findElement(By.name("q"));
		new2.sendKeys("Selenium");
		new2.sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement new3=driver.findElement(By.name("q"));
		new3.sendKeys("Cucumber");
		new3.sendKeys(Keys.ENTER);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		System.out.println("Number of Windows Opened "+driver.getWindowHandles().size());
		
		
	}
}
