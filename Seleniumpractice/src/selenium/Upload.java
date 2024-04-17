package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.naukri.com/registration/createAccount");
		//		driver.get("https://www.grammarly.com/plagiarism-checker");//sendkeys use panni upload aguthu but robot use panna mudila
		driver.manage().window().maximize();		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)", "");
		//webelement identify	
	String path="C:\\Users\\HP\\Downloads\\xml Cross Browser Test.docx";
		
	//	WebElement up=   driver.findElement(By.xpath("//*[@id=\"sectionGrammarCheck_4VB8kepvT7ciShVSz6rHX\"]/div[2]/form/div/div[4]/button[2]/span"));
		WebElement upload=driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button"));
		
//		js.executeScript("window.scrollBy(arguments[0].scrollIntoView(true))",upload);	
upload.click();		
//		upload.sendKeys("C:\\Users\\HP\\Downloads\\sample.png"+Keys.ENTER);
		
		//	C:\Users\HP\Downloads\file1.pdfup.sendKeys(path);
		Thread.sleep(3000);
		Robot robot=new Robot();
		//windows control // file ah transfer panna stringselection class iruku so using	sendKeys(path);	 
		StringSelection selection=new StringSelection(path);//plAIN text format la string ah transfer pannum.
		Thread.sleep(3000);

		// windows la irukurathulam tool. so go for toolkit. its default method.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);

		//keyboard action panna robot class
		//webbased action ku action class & window based na robot class is useful

		robot.keyPress(KeyEvent.VK_CONTROL);//vk mean virtual key onscreen keyboard tha press pannum so only
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


		//	driver.quit();

	}
	//	C:\Users\HP\Downloads\file1.pdf
}
