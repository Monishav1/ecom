package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textpractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(op);
		d.manage().window().maximize();
		d.get("https://www.leafground.com/input.xhtml");
		WebElement	name=d.findElement(By.id("j_idt88:name"));//name box
		name.sendKeys("Monisha");
		WebElement city=d.findElement(By.id("j_idt88:j_idt91"));//appendbox
		city.sendKeys("Salem");
		WebElement	disable =d.findElement(By.id("j_idt88:j_idt93"));
	boolean bb=	disable.isEnabled();//disable box
		System.out.println(bb);
//		disable.getAttribute("placeholder");




		//		WebElement appendbox =d.findElement(By.id("j_idt88:j_idt91"));
		//		appendbox.sendKeys("Salem");
		
		//		d.close();


		//		WebElement clearbox= d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		//		clearbox.clear();
		//		WebElement getbox=d.findElement(By.id("j_idt88:j_idt97"));
		//		String value = getbox.getAttribute("Value");
		//		System.out.println(value);

				WebElement emailbox = d.findElement(By.id("j_idt88:j_idt99"));
				emailbox.sendKeys("monisha@gmail.com"+Keys.TAB);






	}


}
