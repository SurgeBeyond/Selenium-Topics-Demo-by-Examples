package SelectOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio");
			WebElement anchor = driver.findElement(By.tagName("a"));
			
			System.out.println(anchor.getText());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
