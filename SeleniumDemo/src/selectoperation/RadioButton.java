package selectoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://www.html.am/html-codes/forms/html-radio-button-code.cfm");	
			driver.manage().window().fullscreen();
			
			WebElement male = driver.findElement(By.xpath("//td[@class='exampleDisplay']//input[@value='male']"));	
			male.click();			
			
			Thread.sleep(3000);
			
			WebElement female = driver.findElement(By.xpath("//td[@class='exampleDisplay']//input[@value='female']"));	
			female.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
