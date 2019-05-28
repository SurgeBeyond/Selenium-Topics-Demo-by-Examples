package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCssValue {

	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.out.println("launching chrome browser");

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.navigate().to("http://google.com");
			
			WebElement searchButton = driver.findElement(By.name("btnK"));
			String colorValueInRGB = searchButton.getCssValue("color");
			System.out.println(colorValueInRGB);
			
			Actions action = new Actions(driver);
			action.moveToElement(searchButton).perform();
			colorValueInRGB = searchButton.getCssValue("color");
			System.out.println(colorValueInRGB);

			driver.close();

			System.exit(0);

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
