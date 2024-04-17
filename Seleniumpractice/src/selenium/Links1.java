package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Links1 {

	public static void main(String[] args) throws IOException, MalformedURLException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(op);
		
//		driver.get("https://leafground.com/link.xhtml");
		
		URL url = new URL("https://the-internet.herokuapp.com/");
		HttpURLConnection  con=	(HttpURLConnection) url.openConnection();
		
		int code = con.getResponseCode(); //if code is 200, then link is not broken
		System.out.println(code);
		String msg = con.getResponseMessage(); //if msg is Ok, then link is not broken
		System.out.println(msg);
		
		
		
	}

}
