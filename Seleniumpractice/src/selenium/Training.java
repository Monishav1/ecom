package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Training {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//         driver.get("https://www.amazon.in");
		//         driver.manage().window().maximize();
		//        WebElement todaydeals =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		//        todaydeals.click(); 
		driver.get("https://admission.lpu.in/");
		driver.manage().window().maximize();
		WebElement namebox=driver.findElement(By.id("Name"));
		namebox.sendKeys("Monisha");
		WebElement mailbox=driver.findElement(By.id("Email"));
		mailbox.sendKeys("monisha@gmail.com");
		WebElement phnum=driver.findElement(By.id("Mobile"));
		phnum.sendKeys("0123456789");
		WebElement statebox=driver.findElement(By.id("StateId"));

		Select select=new Select(statebox);
		select.selectByVisibleText("Tamil Nadu");
		
		List<WebElement> listbox=  select.getOptions();
		int size=  listbox.size();
		System.out.println("Number of state is :"+size);
		
		WebElement genderbox =driver.findElement(By.id("FieldGender"));
		genderbox.sendKeys("Female");
		WebElement disbox=driver.findElement(By.id("FieldDiscipline"));
		Select select1=new Select(disbox);
		select1.selectByIndex(0);
		WebElement qualify=driver.findElement(By.id("FieldQualificationLevel"));
		Select select2=new Select(qualify);
		select2.selectByValue("249728");


	}

}

