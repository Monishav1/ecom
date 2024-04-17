package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclicks {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		WebElement gm=driver.findElement(By.className("gb_E"));
//		
//		Actions ac1=new Actions(driver);
//		
//		ac1.contextClick(gm).perform();
//				
//		Robot ro=new Robot();
//		ro.keyPress(KeyEvent.VK_DOWN);
//		ro.keyPress(KeyEvent.VK_DOWN);
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_DOWN);
//		double click method
		
	WebElement dd=driver.findElement(By.className("uU7dJb"));
		Actions ac2=new Actions(driver);
		ac2.doubleClick(dd).perform();
		
		
	}

}
