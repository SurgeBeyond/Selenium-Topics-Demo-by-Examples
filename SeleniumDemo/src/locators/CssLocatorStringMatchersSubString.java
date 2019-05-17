package locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorStringMatchersSubString {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			List<WebElement> list = driver.findElements(By.cssSelector("input[value*='Feeling']"));

			Iterator<WebElement> iterator = list.iterator();
			while(iterator.hasNext()) {
				WebElement element = iterator.next();
				System.out.println(element.getAttribute("value")+" "+element.isDisplayed());
				
				if(element.isDisplayed()) {
					element.click();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
