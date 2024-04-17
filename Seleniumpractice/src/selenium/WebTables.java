package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);

		driver.navigate().to("http://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
//		//identify number of rows in table
//		List<WebElement> table1 = driver.findElements(By.xpath("//table[@id='table1']//tr"));
//		int row_size = table1.size();
//		System.out.println("Number of Rows in table1 :"+row_size);
	List<WebElement> email=driver.findElements(By.xpath("//table[@id='table1']//tr/th[3]//following::tbody[1]/tr/td[3]"));
	for (WebElement tr : email) {
		String row=tr.getText();
		System.out.println(row);
		email=driver.findElements(By.xpath("//table[@id='table1']//tr/th[3]//following::tbody[1]/tr/td[3]"));
		
	}
		
//		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='table1']//tr/th"));
//		int tablecol=columns.size();
//		System.out.println("no of columns in the table "+tablecol);
//		List<WebElement> row_data = driver.findElements(By.
//				xpath("//table[@id='table1']//tr[3]"));
//		 for (WebElement rows : row_data) {
//		System.out.println(rows.getText());
//		
//		table[@id='table1']//tr[3]
//		table[@class='tablesorter'][1])//tr[1]//td
		
		driver.close();
		
		
		
//		driver.quit();
		}
	}


