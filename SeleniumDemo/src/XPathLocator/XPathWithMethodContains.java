package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathWithMethodContains {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			//To find input box
			WebElement inputTextBox = driver.findElement(By.xpath("//*[contains(@title,'earc')]"));
			inputTextBox.sendKeys("Surge Beyond");
			Thread.sleep(3000);

			inputTextBox = driver.findElement(By.xpath("//input[contains(@title,'earc')]"));
			inputTextBox.clear();
			inputTextBox.sendKeys("Hello World");
			Thread.sleep(3000);
			
			// To find Link
			WebElement aboutLink = driver.findElement(By.xpath("//*[contains(@href,'intl/en/about')]"));
			aboutLink.click();
			Thread.sleep(3000);
			
			// To find web element using text() method
			driver.navigate().to("http://google.com");
			WebElement parent = driver.findElement(By.xpath("//*[contains(text(),'to every parent')]"));
			parent.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
