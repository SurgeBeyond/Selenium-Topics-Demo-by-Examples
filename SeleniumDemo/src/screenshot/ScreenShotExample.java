package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	private static String driverPath ;
	private static String URL = "https://google.co.in";
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.out.println("launching chrome browser");

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.navigate().to(URL);
			driver.manage().window().maximize();

			getScreenshot();

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());

		} finally {
			driver.close();
			System.exit(0);
		}
	}

	public static void getScreenshot() throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Documents\\screenshot.png"));
	}

}
