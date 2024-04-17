package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();	
		
		// take screenshot here
//		TakesScreenshot screenshot= (TakesScreenshot) driver;//add casting panna sollum
//		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\HP\\Downloads\\sample.png");// obj creation for file
//		//	FileUtils fileUtils= ithu appachi poi method oor filehandler method used.
////		org.openqa.selenium.io.FileHandler.copy(sourcefile, path);
//		org.openqa.selenium.io.FileHandler.copy(sourcefile, destination);
////        FileUtils.copyFile(sourcefile, destination);		
		

		//Using robot class
		//1. create obj for robot cl
		//2.get the screen size and store
		//3.use rectangle class and pass the screen
		//4.use createscreencapture(rectangle) of bot class and capture screenshot(source)
		//5.Define destination path file for screen shot
		//6.write temp file in to destination file(image io) 

		Robot robot=new Robot();
		Dimension  screensize= Toolkit.getDefaultToolkit().getScreenSize(); 
		// screen size edukka using toolkit. already use in upload concept
		Rectangle rectangle= new Rectangle(screensize);//lap screen rectan la irukkum

		BufferedImage source=robot.createScreenCapture(rectangle);// create screen capture method

		File destinationfile1= new File("C:\\Users\\HP\\Downloads\\Fullscreen");//source file ah desti file la store pannaum.
		ImageIO.write(source, "png", destinationfile1);// filehandler use panna mathiri image io


		driver.quit();


	}

}
