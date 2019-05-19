package windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowUsingHandle {

	private static String driverPath ;
	private static String URL = "https://docs.oracle.com/javase/7/docs/api/";

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(URL);

			Set windowsSet = driver.getWindowHandles();
			Iterator iterator = windowsSet.iterator();
			String window;

			while (iterator.hasNext()) {
				window = (String) iterator.next();
				System.out.println(window);
				driver.switchTo().window(window);
			}

			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
