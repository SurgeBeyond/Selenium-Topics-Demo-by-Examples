package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetLocationAndSize {

	public static void main(String[] args) {
	 WebDriver driver;
	 String baseURL,nodeURL;
		
		try {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			baseURL = "http://google.com";
			nodeURL = "http://10.160.0.7:5566/wd/hub";
			
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			
			WebDriver remoteDriver =new RemoteWebDriver(new URL(nodeURL),capabilities);

			remoteDriver.navigate().to(baseURL);

			Thread.sleep(1000);
			WebElement searchButton = remoteDriver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
			Point searchBtnCoordinates = searchButton.getLocation();
			int x = searchBtnCoordinates.getX();
			int y = searchBtnCoordinates.getY();

			System.out.println("Location => x = " + x + "; y = " + y);

			Dimension dimensionOfSearchButton = searchButton.getSize();
			int height = dimensionOfSearchButton.height;
			int width = dimensionOfSearchButton.getWidth();

			System.out.println("Size => Height = " + height + "; Width = " + width);

			remoteDriver.close();

			System.exit(0);

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
