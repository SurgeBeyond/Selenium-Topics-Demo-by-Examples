package EMailLogin;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFirstAttemptClick {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://mail.protonmail.com/login");

			WebElement userNameInputBox = driver.findElement(By.xpath("//input[@id='username']"));
			userNameInputBox.sendKeys("surgebeyond");

			WebElement passwordInputBox = driver.findElement(By.xpath("//input[@id='password']"));
			passwordInputBox.sendKeys("a@were");

			WebElement loginButton = driver.findElement(By.xpath("//button[@id='login_btn']"));
			loginButton.click();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
