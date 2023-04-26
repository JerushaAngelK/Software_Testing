package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise4 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver wd=new ChromeDriver(co);
	wd.get("https://j2store.net/free/");
//	JavascriptExecutor js=(JavascriptExecutor)wd;
	wd.manage().window().maximize();
//	js.executeScript("window.scrollBy(0,500)","");
	WebElement clothing=wd.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img"));
	clothing.click();
	wd.navigate().back();
	wd.navigate().forward();
	wd.navigate().refresh();
	wd.close();
}
}
