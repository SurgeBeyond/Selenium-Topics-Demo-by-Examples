package locationandsize;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationAndSize {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.out.println("launching chrome browser");

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.navigate().to("http://google.com");

			Thread.sleep(1000);
			WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
			Point searchBtnCoordinates = searchButton.getLocation();
			int x = searchBtnCoordinates.getX();
			int y = searchBtnCoordinates.getY();

			System.out.println("Location => x = " + x + "; y = " + y);

			Dimension dimensionOfSearchButton = searchButton.getSize();
			int height = dimensionOfSearchButton.height;
			int width = dimensionOfSearchButton.getWidth();

			System.out.println("Size => Height = " + height + "; Width = " + width);

			driver.close();

			System.exit(0);

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
