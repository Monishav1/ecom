package selenium;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobuttonExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		//		driver.get("https://www.leafground.com/checkbox.xhtml");
		//		driver.manage().window().maximize();
		//		WebElement favoritebox=driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
		//		favoritebox.click();
		//		driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]")).click();
		//		driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]")).click();
		//		driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[2]/div/div[2]")).click();
		//		WebElement agebutton=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		//		boolean firstage=agebutton.isSelected();

		//		if (agebutton.isSelected()) {
		//			agebutton.click();
		//		}else {
		//			System.out.println("this part is not run");
		//		}
		//
		//System.out.println("age button "+firstage);

		driver.get("https://www.leafground.com/radio.xhtml");
		//		driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]/span")).click();

	
		
	
		
//		Select s=new Select(browser);
//		WebElement b=	s.getFirstSelectedOption();
//		System.out.println(b.getText());
	}

}


