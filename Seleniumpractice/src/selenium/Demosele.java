package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demosele {

	public static void main(String[] args) throws InterruptedException   {

		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");		
		//		System.setProperty("webdriver.chrome.driver", 
		//				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver(op);
		d.get("https://www.google.com/");
		WebElement link=		d.findElement(By.partialLinkText("தமி"));
		link.click();
		WebElement search=	d.findElement(By.name("q"));
		search.sendKeys("infomats \n");



		//		d.findElement(By.id("txt_pass")).sendKeys("admin");
		//		d.findElement(By.id("Button3")).click();
		d.close();












		//		driver.findElement(By.xpath("//div[@id='navbar-collapse-3']/ul/li[2]")).click();
		//		Select spcl=new Select(driver.findElement(By.name("specialist")));
		//		spcl.selectByValue("1");
		//		//driver.close();
		//		try {
		//			Select doc=new Select(driver.findElement(By.name("doctor")));
		//			doc.selectByValue("12");
		//			Select sft=new Select(driver.findElement(By.name("global_shift")));
		//			sft.selectByValue("3");
		//			Select consul=new Select(driver.findElement(By.name("live_consult")));
		//			sft.selectByValue("no");
		//			driver.findElement(By.id("datetimepicker1")).click();
		//			driver.findElement(By.xpath("//div[@class='col-sm-12']//div/textarea")).sendKeys("hello \n");
		//
		//		} catch (NoSuchElementException e) {
		//			System.out.println("this is a excep");
		//		}








	}

}
