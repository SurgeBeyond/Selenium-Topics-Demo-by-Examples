package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			WebElement inputTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));

			inputTextBox.sendKeys("Surge Beyond");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
