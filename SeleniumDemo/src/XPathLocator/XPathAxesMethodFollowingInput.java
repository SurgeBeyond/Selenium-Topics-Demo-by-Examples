package XPathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodFollowingInput {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			List<WebElement> listOfInput = driver.findElements(By.xpath("//a[contains(text(),'Store')]//following::input"));
			Iterator<WebElement> iterator = listOfInput.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next().getAttribute("name"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
