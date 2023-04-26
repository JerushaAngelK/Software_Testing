package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver wd=new ChromeDriver(co);
		wd.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement fname=wd.findElement(By.id("input-firstname"));
		fname.sendKeys("Lascrea");
        WebElement lname=wd.findElement(By.id("input-lastname"));
        lname.sendKeys("Mink");
        WebElement email=wd.findElement(By.id("input-email"));
        email.sendKeys("example@gmail.com");
        WebElement pwd=wd.findElement(By.id("input-password"));
        pwd.sendKeys("1234");
        JavascriptExecutor js=(JavascriptExecutor)wd;
        js.executeScript("window.scrollBy(0,500)","");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        WebElement yesbutton=wd.findElement(By.id("input-newsletter-yes"));
        yesbutton.click();
        
       
        
        
        

	}

}
