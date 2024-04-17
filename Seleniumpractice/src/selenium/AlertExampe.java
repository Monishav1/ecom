package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExampe {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(CO);
		
		//		driver.get("https://www.google.com/");
		//		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).click();
		//		driver.findElement(By.xpath("//a[starts-with(@class,'gb')]")).click();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
//Simple alert
//		WebElement simplebox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
//		simplebox.click();
//		Alert alert=driver.switchTo().alert();//driver ah alert ku switch pandrom
//		Thread.sleep(3000);
//		alert.accept();
//		
		//
//		WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
//		confirmbox.click();
//		Alert alert2=driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert2.dismiss(); //cancel panna dismiss
//		//
//		WebElement sweetbox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]"));
//		sweetbox.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]")).click();
//		
//		//
//		WebElement sweetmodel=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span[2]"));
//		sweetmodel.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a/span")).click();
//		
		//prompt alert
		WebElement promtalert=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		promtalert.click();
		Alert alert3=driver.switchTo().alert();
		Thread.sleep(3000);
		alert3.sendKeys("MOnisha");
		Thread.sleep(3000);
		alert3.accept();

Thread.sleep(4000);
		driver.quit();









	}

}
