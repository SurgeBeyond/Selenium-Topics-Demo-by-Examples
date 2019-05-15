package XPathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodChild {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			List<WebElement> listofLinks = driver.findElements(By.xpath("//div[@id='hptl']"));

			Iterator<WebElement> iterator = listofLinks.iterator();

			while (iterator.hasNext()) {
				System.out.println(iterator.next().getText());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
