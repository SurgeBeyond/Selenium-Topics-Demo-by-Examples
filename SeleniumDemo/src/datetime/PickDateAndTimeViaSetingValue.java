package datetime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickDateAndTimeViaSetingValue {

		public static String driverPath;
		public static WebDriver driver;

		public static void main(String[] args) {
			try {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

				driver = new ChromeDriver();
				driver.navigate().to("https://bevacqua.github.io/rome/");
				
				WebElement dateTime = driver.findElement(By.xpath("//input[@id='dt']"));
				dateTime.sendKeys("2014-12-15 21:00");	
				dateTime.sendKeys(Keys.TAB);					
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}


}
