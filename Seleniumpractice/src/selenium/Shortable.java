package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		//Modify Wait time as per the Network Ability in the Thread Sleep method

		driver.get("https://www.globalsqa.com/demoSite/practice/sortable/connect-lists.html");
		Thread.sleep(3000);
		List<WebElement> t2=driver.findElements(By.xpath("//ul[@id='sortable2']/li"));
//		List<WebElement> t1=driver.findElements(By.xpath("//ul[@id='sortable1']/li"));
		WebElement from =t2.get(0);
		WebElement to=t2.get(3);
//	to ele identify
	Actions actions=new Actions(driver);
//	actions.dragAndDrop(from, to).release(to).build().perform();
	actions.clickAndHold(from);
	actions.moveToElement(to);
//	actions.release(to);
	actions.build().perform();
	Thread.sleep(3000);
//	driver.close();
	}

}
