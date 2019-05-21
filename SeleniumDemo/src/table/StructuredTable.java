package table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class StructuredTable {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://semantic-ui.com/collections/table.html");
			
			WebElement table = driver.findElement(By.xpath("//table[@class='ui celled structured table']//th[contains(text(),'Name')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", table);

			List<WebElement> headers = driver.findElements(By.xpath("//thead//tr[2]//child::th"));
			Iterator<WebElement> iterator = headers.iterator();
			
			while(iterator.hasNext()) {
				WebElement element = iterator.next();
				System.out.println(element.getText());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}