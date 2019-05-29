package testng.parameter;

import org.openqa.selenium.By;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizationWIthTestNGXML {

	public static String driverPath;
	public static WebDriver driver;
	
	@Test
    @Parameters({"text"})
	public void googleSearch(@Optional("rat") String text) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://google.com");
			
			WebElement inputTextBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
			inputTextBox.sendKeys(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
