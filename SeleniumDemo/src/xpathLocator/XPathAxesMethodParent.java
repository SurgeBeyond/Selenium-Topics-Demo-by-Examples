package xpathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodParent {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			List<WebElement> div = driver.findElements(By.xpath("//a[contains(text(),'About')]//parent::div"));

			Iterator<WebElement> iterator = div.iterator();

			while (iterator.hasNext()) {
				System.out.println(iterator.next().getAttribute("id"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
