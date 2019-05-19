package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	private static String driverPath;
	private static String URL = "https://sweetalert2.github.io/";
	private static WebElement element;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(URL);

			WebElement showNormalAlert = driver.findElement(By.xpath("//button[contains(text(),'Show normal alert')]"));
			showNormalAlert.click();
			
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}