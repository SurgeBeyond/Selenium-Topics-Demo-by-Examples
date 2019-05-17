package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUsingAnd {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			WebElement inputTextBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
			inputTextBox.sendKeys("Surge Beyond");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
