package findElementAndFindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			List listOfAnchors = driver.findElements(By.tagName("a"));
			
			Iterator iterator = listOfAnchors.iterator();
			
			while(iterator.hasNext()) {
				WebElement element = (WebElement)iterator.next();
				System.out.println(element.getText());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
