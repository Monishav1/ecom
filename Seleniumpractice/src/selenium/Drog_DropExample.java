package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drog_DropExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
				
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.leafground.com/drag.xhtml");
		
		driver.manage().window().maximize();
		// drag and drop methods
		WebElement from=driver.findElement(By.id("form:drag_content"));
		WebElement to=driver.findElement(By.id("form:drop_content"));
		Actions ac=new Actions(driver);
//		ac.clickAndHold(from).
//		moveToElement(to).
//		release().build().perform();
		
		//drag and drop
//		ac.dragAndDrop(from, to).build().perform();
		
		// to verify draga`ble
		WebElement ele=driver.findElement(By.id("form:conpnl_header"));
		Actions ac1=new Actions(driver);
		ac1.dragAndDropBy(ele, 400, 0).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	
}}