package table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTable {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://semantic-ui.com/collections/table.html");
			
			WebElement table = driver.findElement(By.xpath("//p[contains(text(),'A standard table')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", table);

			WebElement cell1 = driver.findElement(By.xpath("//td[contains(text(),'James')]"));			
			System.out.println(cell1.getText());

			WebElement cell2 = driver.findElement(By.xpath("//div[@class='article']//div[2]//table[1]//tbody[1]//tr[1]//td[2]"));			
			System.out.println(cell2.getText());

			WebElement cell3 = driver.findElement(By.xpath("//td[contains(text(),'Designer')]"));			
			System.out.println(cell3.getText());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}