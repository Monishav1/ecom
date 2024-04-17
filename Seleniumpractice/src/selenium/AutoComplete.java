package selenium;

import java.time.Duration;
import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method s	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//		driver.switchTo().frame(0);
		WebElement  search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("Jav");	

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		//		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@id='Alh6id']/div[1]/div/ul/li")));
		List<WebElement> optionlist=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));

		for (WebElement list : optionlist) {   
			String data=list.getText();	
			System.out.println(data);
		
				list.click();
//				break;
			
		}

		//		for (WebElement webElement : optionlist) {
		//			if (webElement.getText().equals("JavaScript")) {
		//
		//				webElement.click();
		//				break;
		//			}else {
		//				System.out.println("else part");
		//				break;
		//			}
		//		}		












	}

}