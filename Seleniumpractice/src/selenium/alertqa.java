package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertqa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");		
		WebDriver d=new ChromeDriver(op);
		d.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,300)", "");
		
		d.findElement(By.id("confirmButton")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Alert al=d.switchTo().alert();

		al.dismiss();
		Thread.sleep(3000);
		
		d.findElement(By.id("promtButton")).click();
		Alert al1=d.switchTo().alert();
		
		al1.sendKeys("Monisha");
		Thread.sleep(3000);
		al1.accept();

		Thread.sleep(3000);



		d.quit();

	}

}
