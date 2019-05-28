package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWithoutPOM {

	private static String URL = "http://google.com/";
	private static String title;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(URL);

			// Object Repository
			WebElement inputBox = driver.findElement(By.name("q"));

			// Operation
			inputBox.sendKeys("soarlogic.com");
			inputBox.submit();

			Thread.sleep(3000);
			// Object Repository
			WebElement link = driver.findElement(By.partialLinkText("Soarlogic"));
			// Operation
			link.click();

			title = driver.getCurrentUrl();

			// Test
			if (title.contains("http://www.soarlogic.com/"))
				System.out.println("Test is Passed");
			else
				System.out.println("Test is Failed");

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
