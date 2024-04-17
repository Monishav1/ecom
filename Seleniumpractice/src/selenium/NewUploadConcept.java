package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewUploadConcept {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='file-upload']"));
//		upload.sendKeys("C:\\Users\\HP\\Downloads\\sampleFile (4).jpeg");
//		upload.submit();
		upload.click();
		Thread.sleep(3000);
		StringSelection s=new StringSelection("C:\\Users\\HP\\Downloads\\sampleFile (4).jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		if(driver.getPageSource().contains("File Uploaded!")) {
			System.out.println("file uploaded");
		}
		else{
			System.out.println("file not uploaded");
		}
		driver.quit();




	}

}
