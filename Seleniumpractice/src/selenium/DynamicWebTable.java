package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		//Modify Wait time as per the Network Ability in the Thread Sleep method

		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		
		
		
		//Finding number of Rows

		List<WebElement> rowsNumber = driver.findElements(By.tagName("th"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);

		//Finding number of Columns

//		List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@id="content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a"]/div/div/table[1]/thead/tr/th[1]"));
//		int columnCount = columnsNumber.size();
//		System.out.println("No of columns in this table : " + columnCount);
//
//		//Finding cell value at 4th row and 3rd column
//
//		WebElement cellAddress = Rowtable.findElement(By.xpa
	}

}
