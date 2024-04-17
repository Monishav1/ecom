package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize(); 
		JavascriptExecutor ex= (JavascriptExecutor) driver;
		ex.executeScript("window.scrollBy(0,200)", "");
		driver.switchTo().frame(0);		
		List<WebElement> oplist=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		Actions actions=new Actions(driver);
		
		actions.keyDown(Keys.CONTROL).
		click(oplist.get(1)).
		click(oplist.get(5)).perform();

		//	actions.clickAndHold(oplist.get(0)).
		//	clickAndHold(oplist.get(1)).
		//	clickAndHold(oplist.get(2)).
		//	build().perform();
		//	Thread.sleep(3000);		
		//	driver.quit();


	}



}
