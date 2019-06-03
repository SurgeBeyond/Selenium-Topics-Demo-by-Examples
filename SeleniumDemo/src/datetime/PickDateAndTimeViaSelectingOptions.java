package datetime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickDateAndTimeViaSelectingOptions {

		public static String driverPath;
		public static WebDriver driver;

		public static void main(String[] args) {
			try {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

				driver = new ChromeDriver();
				driver.navigate().to("https://bevacqua.github.io/rome/");
				
				WebElement dateTime = driver.findElement(By.xpath("//input[@id='dt']"));
				dateTime.click();
				
				WebElement backward = driver.findElement(By.xpath("//div[@class='rd-container rd-container-attachment']/div/div/button[@class='rd-back']"));
				backward.click();				
				Thread.sleep(3000);
				backward.click();				
				Thread.sleep(3000);
				
				WebElement forward = driver.findElement(By.xpath("//div[@class='rd-container rd-container-attachment']/div/div/button[@class='rd-next']"));
				forward.click();				
				Thread.sleep(3000);
				
				WebElement day = driver.findElement(By.xpath("//div[@class='rd-container rd-container-attachment']//td[@class='rd-day-body'][contains(text(),'01')]"));
				day.click();				
				Thread.sleep(3000);
				
				dateTime.click();
				
				WebElement timestampBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]"));
				timestampBox.click();			
				Thread.sleep(3000);
				
				WebElement timestamp = driver.findElement(By.xpath("//div[@class='rd-container rd-container-attachment']//div[@class='rd-time-option'][contains(text(),'00:30')]"));
				timestamp.click();								
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}


}
