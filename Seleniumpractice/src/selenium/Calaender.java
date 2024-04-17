package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calaender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		JavascriptExecutor ex= (JavascriptExecutor) driver;
		ex.executeScript("window.scrollBy(0,200)", "");
		driver.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
		WebElement date=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
		date.click();
		Thread.sleep(3000);
		String monthyear=driver.findElement(By.className("ui-datepicker-title")).getText();

		while(!(monthyear.equalsIgnoreCase("july 2022")) ) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			monthyear=driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[3]/a")).click();
		
		
		//		WebElement nxt=driver.findElement(By.xpath("//a[@title='Next']"));
		//		nxt.click();
		//select the date of 13 july
		//		WebElement date1=driver.findElement(By.xpath("//a[contains(text(),'21')]"));
		//		date1.click();
		//		driver.findElement(By.id("datepicker")).sendKeys("02/21/2023"+Keys.ENTER);
		//		Thread.sleep(3000);
		//		WebElement date=driver.findElement(By.id("datepicker"));

		//	String curmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		//	String curyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		



		//		driver.quit();











	}

}
