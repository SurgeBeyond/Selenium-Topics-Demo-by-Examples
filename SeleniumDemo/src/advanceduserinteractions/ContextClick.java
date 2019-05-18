package advanceduserinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class ContextClick {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
			WebElement right_Click_Me_Button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			
			Actions actions = new Actions(driver);
			actions.contextClick(right_Click_Me_Button).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
