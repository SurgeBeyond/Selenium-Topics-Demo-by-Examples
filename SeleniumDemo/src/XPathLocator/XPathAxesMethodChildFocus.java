package XPathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodChildFocus {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			List<WebElement> links = driver.findElements(By.xpath("//div[@id='hptl']//child::a[2]"));
			Iterator<WebElement> iterator = links.iterator();
			while (iterator.hasNext()) {
				WebElement link =iterator.next();
				System.out.println(link.getText());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
