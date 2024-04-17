package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadgoogle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.naukri.com/registration/createAccount");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)","");	
		WebElement upload=driver.findElement(By.xpath("//button[.='Upload Resume']"));
		upload.click();
				Robot ro=new Robot();
		StringSelection selection=new StringSelection("C:\\Users\\HP\\Downloads\\CV_Monisha.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	}

}
