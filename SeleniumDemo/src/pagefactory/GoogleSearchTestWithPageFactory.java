package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTestWithPageFactory {

	private static String URL = "http://google.com/";
	private static String driverPath ;

	public static void main(String[] a) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(URL);

			PageFactoryExample search = new PageFactoryExample(driver);
			search.setTextAndSubmit("soarlogic.com");

			String title = driver.getCurrentUrl();

			// Test
			if (title.contains("http://www.soarlogic.com/"))
				System.out.println("Test is Passed");
			else
				System.out.println("Test is Failed");
			
			driver.quit();
			System.exit(0);

		} catch (Exception e) {
			System.out.println("GoogleSearchTest Exception: " + e.getMessage());
		}
	}

}
