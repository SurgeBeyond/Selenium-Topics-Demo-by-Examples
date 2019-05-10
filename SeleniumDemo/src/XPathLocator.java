import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	private static String driverPath = "C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\";
	private static WebDriver driver;
	private static String URL = "http://www.studydunes.com/homes/index";
	private static String classRoomsXPath = ".//*[@id='onLineT']/a";
	private static WebElement element = null;
	private static String text = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
			driver = new ChromeDriver();

			driver.get(URL);
			element = driver.findElement(By.xpath(classRoomsXPath));
			element.click();
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}

