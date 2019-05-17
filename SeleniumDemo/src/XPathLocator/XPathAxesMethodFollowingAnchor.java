package XPathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodFollowingAnchor {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://www.studydunes.com/user/users/registration");

			List<WebElement> listOfAnchors = driver
					.findElements(By.xpath("//h6[contains(text(),'Create Notes')]//following::li//h6"));
			Iterator<WebElement> iterator = listOfAnchors.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().getText());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
