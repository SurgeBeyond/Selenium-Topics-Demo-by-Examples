package files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class UploadFile {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
			
			WebElement chooseFile = driver.findElement(By.xpath("//input[@uploader='uploader'][1]"));
			chooseFile.sendKeys("C:\\Users\\Public\\file.txt");
			
			WebElement uploadAll =driver.findElement(By.xpath("//button[@class='btn btn-success btn-s']"));
			uploadAll.click();
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
