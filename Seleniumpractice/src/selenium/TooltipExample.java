package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
				driver.get("https://demoqa.com/tool-tips");
				
//		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();

		//		WebElement tool=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		//		Actions ac=new Actions(driver);
		//		ac.moveToElement(tool).perform();
		//		Thread.sleep(3000);
		//		WebElement aa=driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
		//		String bb=aa.getText();
		//		System.out.println(bb);
		//		Thread.sleep(3000);
		//		

		// google mic button tooltip
	
		WebElement tooltip = driver.findElement(By.id("toolTipButton"));
		Actions a=new Actions(driver);
		
		a.moveToElement(tooltip).perform();
		
		String text = driver.findElement(By.className("tooltip-inner")).getText();
		System.out.println(text);
		
	}

}
