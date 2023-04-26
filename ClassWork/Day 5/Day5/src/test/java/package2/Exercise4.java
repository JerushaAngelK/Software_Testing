package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		WebElement leave=driver.findElement(By.xpath("//*[@id=\"source\"]"));
		leave.sendKeys("Coimbatore");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		leave.sendKeys(Keys.ENTER);
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		dest.sendKeys("Tirunelveli");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dest.sendKeys(Keys.ENTER);
		WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		date.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,100)","");
//		WebElement day=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]"));
//		day.click();
		js.executeScript("arguments[0].setAttribute('value','30-04-2023')",date);		
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]"));
		btn.click();
		

	}

}
