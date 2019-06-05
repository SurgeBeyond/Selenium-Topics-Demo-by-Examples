package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://gofile.io/?t=uploadFiles");
			WebElement clickHere = driver.findElement(By.xpath("//button[@id='btnChooseFiles']"));
			clickHere.click();
			
			Runtime.getRuntime().exec("C:\\Users\\Public\\ClickDocument.exe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}