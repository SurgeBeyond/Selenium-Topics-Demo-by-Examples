package selectoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://www.html.am/html-codes/forms/html-checkbox-code.cfm");			
			
			WebElement apple = driver.findElement(By.xpath("//input[@name='fruit' and @value='Apple']"));	
			apple.click();
			
			WebElement orange = driver.findElement(By.xpath("//input[@name='fruit' and @value='Orange']"));			
			orange.click();
			
			WebElement banana = driver.findElement(By.xpath("//input[@name='fruit' and @value='Banana']"));			
			banana.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
