package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmAlertAndAccept {

	private static String driverPath;
	private static String URL = "https://javascript.info/alert-prompt-confirm#prompt";
	private static WebElement element;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(URL);

			WebElement run = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[1]//a[1]"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", run);
			
			run.click();			
			Alert alert = driver.switchTo().alert();
			Thread.sleep(5000);
			alert.accept();	
			Thread.sleep(5000);
			alert.accept();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}