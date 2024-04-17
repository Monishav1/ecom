package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxExamble {//window handle method also there so create new check box class

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[11]/a/img"));
		dd.click();
		
		String oldwindow = driver.getWindowHandle();//old window identify

		WebElement firstbutton =driver.findElement(By.id("home"));
		firstbutton.click();

		Set<String> windows=driver.getWindowHandles();//all windows in this line
		
		for (String newwindow : windows) {
			driver.switchTo().window(newwindow);
		}
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		
		driver.close();
		
		driver.switchTo().window(oldwindow);
		WebElement secondbutton=driver.findElement(By.xpath("//*[@id='contentblock']//section//div[2]//div//div//button"));
		secondbutton.click();
		int noofwindows=driver.getWindowHandles().size();
		System.out.println("Opened Windows"+noofwindows);
		WebElement dontopen=driver.findElement(By.id("color"));
		dontopen.click();
		Set<String> allwindoes=driver.getWindowHandles();
		for (String parentchildwindow : allwindoes) {
			if (parentchildwindow.equals(oldwindow)) {
				driver.switchTo().window(parentchildwindow);
				driver.close();
					
			}
		}



	}


}
