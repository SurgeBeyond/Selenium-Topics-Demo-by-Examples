package XPathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodAncestor {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			List listOfDiv = driver.findElements(By.xpath("//a[text()='q']//ancestor::a"));
			Iterator<WebElement> iterator = listOfDiv.iterator();
			while (iterator.hasNext()) {
				WebElement div =iterator.next();
				System.out.println(div.getAttribute("href"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
