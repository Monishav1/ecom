package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class links {

	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub

		URL url=new URL("https://googles.com");			
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		int responseCode = con.getResponseCode();
		System.out.println(responseCode);
		
		String responseMessage = con.getResponseMessage();
		System.out.println(responseMessage);








		
	}
}








