package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(co);
		//		d.get("https://www.leafground.com/checkbox.xhtml");
		d.get("https://www.google.com/");

		WebElement link=d.findElement(By.linkText("Gmail"));
		Actions ac=new Actions(d);
		ac.moveToElement(link).perform();		
		String value=	link.getCssValue("text-decoration");
		System.out.println(value);	

		//		WebElement brow=d.findElement(By.xpath("https://www.leafground.com/checkbox.xhtml"));

		d.findElement(By.id("j_idt87:j_idt89")).click();
		d.findElement(By.id("j_idt87:j_idt91")).click();
		d.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]")).click();

		Thread.sleep(4000);
		d.close();
	}

}
