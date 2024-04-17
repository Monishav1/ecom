package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.leafground.com/select.xhtml");
//		WebElement dd=driver.findElement(By.className("ui-selectonemenu"));
//		Select s=new Select(dd);
//		s.selectByIndex(2);
//		WebElement country=driver.findElement(By.xpath("(//div[@class='col-12'])[2]//div/div[2]/select"));
		
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
//	WebElement t=wait.until(ExpectedConditions.elementToBeSelected(By.xpath("(//div[@class='col-12'])[2]//div/div[2]/select")));
	Select city=new Select((driver.findElement(By.xpath("(//div[@class='col-12'])[2]//div/div[2]/select")))) ;	
	Thread.sleep(5000);
	city.selectByValue("India");
		
		driver.close();

	}

}
