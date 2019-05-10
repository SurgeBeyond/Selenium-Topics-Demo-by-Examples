package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			WebElement IAmFeelingLuckyButton = driver.findElement(By.id("gbqfbb"));
			
			IAmFeelingLuckyButton.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
