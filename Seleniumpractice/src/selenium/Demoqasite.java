package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoqasite {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Monisha"+Keys.ENTER);
		driver.findElement(By.id("currentAddress")).sendKeys("infomats technology in salem."+Keys.ENTER);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,200)");
		
		
		
	}

}
