package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[3]")).click();



	}

}
