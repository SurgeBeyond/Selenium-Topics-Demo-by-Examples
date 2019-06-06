package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static String driverPath;
	public static WebDriver driver;
	
	/* AutoIT script for uploading the file in Windows:
	 *
 		ControlFocus("Open", "","Edit1")
		Sleep(2000)
		ControlSetText("Open", "", "Edit1", "C:\Users\Public\file.txt")
		Sleep(2000)
		ControlClick("Open", "", "Button1")
		Sleep(2000)
 	 */

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://gofile.io/?t=uploadFiles");
			WebElement clickHere = driver.findElement(By.xpath("//button[@id='btnChooseFiles']"));
			clickHere.click();
			
			Runtime.getRuntime().exec("C:\\Users\\ajayramola24\\Documents\\ClickDocument.exe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}