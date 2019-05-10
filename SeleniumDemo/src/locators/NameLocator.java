package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			WebElement inputTextArea = driver.findElement(By.name("q"));
			
			inputTextArea.click();
			inputTextArea.sendKeys("Surge Beyond");	
			inputTextArea.sendKeys(Keys.ENTER);				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
