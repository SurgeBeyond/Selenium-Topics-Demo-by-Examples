package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebDriverWaitExample {

	public static WebElement source, target;

	public static void main(String[] args) {
		try {
			WebDriver driver;

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("http://jqueryui.com/droppable/");

			WebDriverWait wait = new WebDriverWait(driver, 10);
			driver = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

			source = driver.findElement(By.id("draggable"));
			target = driver.findElement(By.id("droppable"));

			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).build().perform();

			Thread.sleep(1000);
			driver.close();
			System.exit(0);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
