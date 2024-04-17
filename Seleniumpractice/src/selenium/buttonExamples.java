package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class buttonExamples {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//		System.setProperty("webdriver.chrome.driver", 
		//				"C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d=new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://www.leafground.com/button.xhtml");
		WebElement click=d.findElement(By.id("j_idt88:j_idt90"));
		click.click();
		d.navigate().back();
		WebElement disbox=d.findElement(By.id("j_idt88:j_idt92"));
		boolean  dis=disbox.isEnabled();
		System.out.println(dis);

		WebElement position =d.findElement(By.id("j_idt88:j_idt94"));
		Point xypoint=  position.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X-point is"+xvalue + " Y -point is "+yvalue);


		WebElement getcolor=d.findElement(By.id("j_idt88:j_idt96"));
		String gc=	getcolor.getCssValue("background");
		//
		System.out.println(gc);
		

		WebElement get=d.findElement(By.id("j_idt88:j_idt98"));
		Dimension hg=	get.getSize();
		System.out.println(hg.getHeight());	
		System.out.println(hg.getWidth());	

//		d.quit();





	}
}