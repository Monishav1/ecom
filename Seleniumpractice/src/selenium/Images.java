package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.navigate().to("https://demoqa.com/broken");
		
		driver.manage().window().maximize();
		
		WebElement	validim=driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[2]/img[1]"));
		if (validim.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Its broken image");
		}else {
			System.out.println("This is not broken");
		}

		WebElement	bi=	driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/img[2]"));
		//naturalwidth =0 ah irundha its broken image. 

		if (bi.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Its broken image");
		}else {
			System.out.println("This is not broken");
		}
		//		WebElement validlink=driver.findElement(By.linkText("Click Here for Valid Link"));
		//		JavascriptExecutor j = (JavascriptExecutor) driver;
		//		j.executeScript("window.scroll(0,500)","");
		////		j.executeScript("window.scroll(0,)", args)
		//		Thread.sleep(3000);
		//		validlink.click();
		//		Thread.sleep(3000);
		//		driver.navigate().back(); 
		//		Thread.sleep(3000);
		//
		//		WebElement brokenlink=driver.findElement(By.linkText("Click Here for Broken Link"));
		//		brokenlink.click();
		//		URL url=new URL("http://the-internet.herokuapp.com/status_codes/500");
		//		HttpURLConnection con=  (HttpURLConnection) url.openConnection();
		//				//int code=con.getResponseCode();
		//		String msg=	con.getResponseMessage();
		//		
		//		System.out.println(msg);
		////		String bl=	brokenlink.getTagName(a);
		//
		//		if (msg.contains("Server Error")) {
		//			System.out.println("its is broken link");
		//
		//		}
		driver.quit();



	}

}
