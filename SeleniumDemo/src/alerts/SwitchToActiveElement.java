package alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement {

	private static String driverPath;
	private static String URL = "https://google.co.in";
	private static WebElement element;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(URL);

			element = driver.switchTo().activeElement();
			element.sendKeys("One World, One Nation");
			element.submit();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}