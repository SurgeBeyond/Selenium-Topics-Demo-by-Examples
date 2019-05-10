import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTestScript {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayramola24\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}