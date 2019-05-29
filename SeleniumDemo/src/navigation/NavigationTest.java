package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {

	private static WebDriver driver;
	private static String URL = "http://www.studydunes.com/homes/index";
	private static String classRoomsXPath = "//a[contains(text(),'Online Classes')]";
	private static WebElement element = null;
	private static String onlineTraining = "//a[contains(text(),'Online Training')]";
	private static String topics = "//a[contains(text(),'Topics')]";
	
	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.navigate().to(URL);
			
			element = driver.findElement(By.xpath(onlineTraining));
			element.click();

			Thread.sleep(2000);

			element = driver.findElement(By.xpath(classRoomsXPath));
			element.click();
			Thread.sleep(2000);
	
			element = driver.findElement(By.xpath(topics));
			element.click();
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			driver.quit();
			
			System.exit(0);

		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
