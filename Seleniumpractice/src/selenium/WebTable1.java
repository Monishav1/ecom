package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class WebTable1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(op);
		d.get("https://letcode.in/table");
		d.manage().window().maximize();		
		JavascriptExecutor ex= (JavascriptExecutor) d;
		ex.executeScript("window.scroll(0,300)", "");
		
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(20));

		List<WebElement> tab=d.findElements(By.xpath("//table[@id='simpletable']/thead/tr/th"));
		int colcount=tab.size();
		
		System.out.println(colcount);
		List<WebElement > ro=d.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		System.out.println(ro.size());
		
		WebElement table=d.findElement(By.id("simpletable"));
		List<WebElement >	head=table.findElements(By.tagName("th"));
		for (WebElement web : head) {
			String tex=	web.getText();
			System.out.print(tex);
		}


		List<WebElement> allrows=d.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));

		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> cell=allrows.get(i).findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td"));	
			WebElement row=	cell.get(1);
			String text = row.getText();
				if (text.equals("Raj")) {
					WebElement butt= cell.get(3).findElement(By.tagName("input"));
					butt.click();
					break;
				}
			
			

		}		

		//d.quit();
		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> cell=allrows.get(i).
					findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td"));	

			WebElement row=	cell.get(0);
			String text = row.getText();

			if (text.equals("Raj")) {
				WebElement butt= cell.get(3).findElement(By.tagName("input"));
				butt.click();
				break;
			}
		}	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	



		
		
				for (int i = 0; i < allrows.size(); i++) {
					List<WebElement> rows=allrows.get(i).findElements(By.tagName("td"));
					WebElement secondcol=rows.get(1);
					String tet=	secondcol.getText();
					if (tet.equalsIgnoreCase("Man")) {
						WebElement trdcol=rows.get(3).findElement(By.tagName("input"));
						trdcol.click();
						break;
					}
		
		
		
				}
	}
}
