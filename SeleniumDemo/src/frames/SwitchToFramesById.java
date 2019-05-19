package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFramesById {

	private static String driverPath ;
	private static String URL = "https://docs.oracle.com/javase/7/docs/api/";

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(URL);

			driver.switchTo().frame(0);
			driver.findElement(By.linkText("java.awt")).click();

			driver.switchTo().parentFrame();
			driver.switchTo().frame(1);
			driver.findElement(By.linkText("ActiveEvent")).click();

			driver.switchTo().parentFrame();
			driver.switchTo().frame(2);
			System.out.println(driver.getPageSource().contains("Interface ActiveEvent"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
