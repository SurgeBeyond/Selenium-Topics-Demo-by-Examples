package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathWithMethodStartsWith {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			WebElement businessLink = driver.findElement(By.xpath("//*[starts-with(@ping, '/url?sa=t&rct')]"));
			businessLink.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}