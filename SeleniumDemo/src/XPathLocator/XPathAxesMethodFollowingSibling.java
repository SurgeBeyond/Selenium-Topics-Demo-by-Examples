package XPathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodFollowingSibling {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://www.w3schools.com/howto/howto_css_button_group.asp");
			
			List<WebElement> siblingButtons = driver.findElements(By.xpath("//div[@class='w3-row w3-white']//div[3]//button[1]//following-sibling::button"));
			Iterator<WebElement> iterator = siblingButtons.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next().getText());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
