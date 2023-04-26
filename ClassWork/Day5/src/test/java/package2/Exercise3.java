package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement cust=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		cust.sendKeys("401");
		WebElement but1=driver.findElement(By.name("submit"));
		but1.click();
		driver.switchTo().alert().dismiss();
		cust.clear();
		cust.sendKeys("402");
		but1.click();
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		
	}

}
