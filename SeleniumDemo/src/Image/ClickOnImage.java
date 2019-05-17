package Image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");			
			
			WebElement facebookImage = driver.findElement(By.xpath("//i[@class='fb_logo img sp_Df33dxlhqsi sx_281d8e']"));	
			facebookImage.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
