package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("Lascrea");
		WebElement remail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		remail.sendKeys("today@gmail.com");
		WebElement yname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		yname.sendKeys("Hestia");
		WebElement yemail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		yemail.sendKeys("yesterday@gmail.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)","");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		WebElement theme=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		theme.click();
		WebElement msg=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		msg.sendKeys("Happy Birthday!");
		WebElement amt=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amt.clear();
		amt.sendKeys("1000");
		js.executeScript("window.scrollBy(0,500)","");
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 WebElement con=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
		 con.click();
		
	}

}
