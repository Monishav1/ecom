package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.leafground.com/frame.xhtml");
		
		JavascriptExecutor ex= (JavascriptExecutor) driver;		
//		ex.executeScript("window.scrollBy(0,400)", "");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
//		ex.executeScript("window.scrollBy(0,-300)", "");
		driver.findElement(By.id("Click")).click();
		
		
	}

}


