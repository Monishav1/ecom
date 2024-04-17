package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		String oldwindow = driver.getWindowHandle();
		
//		driver.findElement(By.id("j_idt88:new")).click();
//		
//		Set<String> allwin=driver.getWindowHandles();
//		
//		for (String newwindow : allwin) {
//			driver.switchTo().window(newwindow);
//		}
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@id='menu-button']")).click();		
//		Thread.sleep(3000);
//		driver.close();
//		Thread.sleep(3000);
//		driver.switchTo().window(oldwindow);

		//2nd task
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Set<String> secondtask=	driver.getWindowHandles();
//		for (String string : secondtask) {
//			driver.switchTo().window(string);
//			if (!string.equals(oldwindow)) {
//				driver.switchTo().window(string);
//				driver.close();
//			}
//		}
//		driver.switchTo().window(oldwindow);
//		driver.findElement(By.id("j_idt88:j_idt91")).click();
		int noofwindow=		driver.getWindowHandles().size();
		for (String string : secondtask) {
			driver.switchTo().window(string);
			if (driver.getTitle().equals(secondtask)) {
				
			}
		}
		System.out.println("no of OPened windows"+noofwindow);
		driver.close();
		driver.switchTo().window(oldwindow);
		
		
				//3rd task
//		driver.findElement(By.id("j_idt88:j_idt91")).click();
//		Set<String>thirdallwindowsclose=	driver.getWindowHandles();
//		for (String allwin : thirdallwindowsclose) {
//			if (!allwin.equals(oldwindow)) {
//				driver.switchTo().window(allwin);
//				driver.close();
//			}
//		}
		//		driver.quit();

	}

	}
