package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

	public static String driverPath;
	public static WebDriver driver;
	public static WebElement source, target;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("http://jqueryui.com/droppable/");

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			driver.switchTo().frame(0);
			source = driver.findElement(By.id("draggable"));
			target = driver.findElement(By.id("droppable"));

			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
