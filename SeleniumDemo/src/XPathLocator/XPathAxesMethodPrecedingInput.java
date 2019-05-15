package XPathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodPrecedingInput {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://www.studydunes.com/user/users/registration");
			
			List<WebElement> listOfInput = driver.findElements(By.xpath("//input[@id='UserConfirmPassword']//preceding::input"));
			Iterator<WebElement> iterator = listOfInput.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next().getAttribute("placeholder"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
