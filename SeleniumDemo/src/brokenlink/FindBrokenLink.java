package brokenlink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			List<WebElement> anchorTags= driver.findElements(By.tagName("a"));
			Iterator<WebElement> iteratorAnchors = anchorTags.iterator();
			
			while(iteratorAnchors.hasNext()) {
				WebElement anchor = iteratorAnchors.next();
				String url = anchor.getAttribute("href");
				
				if(url.isEmpty()||url==null) {
					System.out.println("URL is null");
				}
				else {
					URL loc = new URL(url);
					HttpURLConnection connection = (HttpURLConnection) loc.openConnection();
					connection.setRequestMethod("HEAD");
	                
					connection.connect();
	                
	                int respCode = connection.getResponseCode();
	                if(respCode>=400) {
	                	System.out.println(url+" is broken");
	                }
	                else{
	                	System.out.println(url+" is fine");
	                	}
				}
				
			}
			} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}