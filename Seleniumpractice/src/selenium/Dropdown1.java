package selenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions CO=new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(CO);
		d.get("https://www.leafground.com/select.xhtml");
		
		WebElement country=	d.findElement(By.id("j_idt87:country_label"));
		country.click();
		Actions ac=new 	Actions(d);
		ac.moveToElement(country).perform();
		WebElement india=	d.findElement(By.xpath("//*[@id=\'j_idt87:country_3\']"));
		ac.click(india).perform();


		d.quit();




	}

}
