package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();		
		driver.navigate().to("https://demoqa.com/upload-download");
				JavascriptExecutor ex=(JavascriptExecutor) driver;
		ex.executeScript("window.scroll(0,400)","");
	
		driver.findElement(By.xpath("(//a[text()='Download'])[1]")).click();
		
		File filelocation=new File("C:\\Users\\HP\\Downloads");
//		Thread.sleep(3000);
		
		File[] totalfile=filelocation.listFiles();
		
		for (File file : totalfile) {
			if (file.getName().contains("sampleFile")) {
				Thread.sleep(3000);
				System.out.println("file is downloaded");
				break;
			}
				
		}driver.quit();	
	}

}
