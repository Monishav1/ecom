package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathpart2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(co);
		d.get("https://www.google.com/");
//		d.findElement(By.xpath("//*[@name='q']/parent::div")).click();//using parent 
//		d.findElement(By.xpath("//*[@class='a4bIc']/child::textarea")).click();//using child
		d.findElement(By.xpath("//*[@name='q']/ancestor::div[6]")).click();//using ancestor method
//		d.findElement(By.xpath("//*[@class='iblpc']/following::textarea")).sendKeys("infomate");
//		d.findElement(By.id("//input[@name='password']/preceding::input[1]")).sendKeys("infomat");//orange hrm url
		//using preceding method
		
		// using following-sibiling method
		
		
		
		
		Thread.sleep(3000);
		d.quit();
		
		

		
		
		
		
	}

}
