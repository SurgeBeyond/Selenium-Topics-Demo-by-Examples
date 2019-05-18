package files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class DownloadFile {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.thinkbroadband.com/download");

			WebElement downloadFile = driver.findElement(By.xpath("//div[@id='main']//div[8]//p[1]//a[1]//img[1]"));
			String sourceLocation = downloadFile.getAttribute("href");

			String wgetCommand = "cmd /c C:\\Users\\Public\\wget-1.20.3-win32\\wget.exe  -P C:\\Users\\Public --no-check-certificate http://ipv4.download.thinkbroadband.com/5MB.zip";

			Process executeCommand = Runtime.getRuntime().exec(wgetCommand);
			int exitVal = executeCommand.waitFor();
			System.out.println("Exit value: " + exitVal);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
