package frames;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFramesByWebElement {

	private static String driverPath;
	private static String URL = "https://docs.oracle.com/javase/7/docs/api/";

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(URL);

			List<WebElement> elementList = driver.findElements(By.tagName("frame"));
			Iterator<WebElement> iterator = elementList.iterator();

			WebElement webElement1 = iterator.next();
			WebElement webElement2 = iterator.next();
			WebElement webElement3 = iterator.next();

			driver.switchTo().frame(webElement3);

			WebElement linkElement = driver.findElement(By.linkText("No Frames"));
			linkElement.click();
			String url = driver.getCurrentUrl();
			System.out.println(url.contains("https://docs.oracle.com/javase/7/docs/api/overview-summary.html"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}