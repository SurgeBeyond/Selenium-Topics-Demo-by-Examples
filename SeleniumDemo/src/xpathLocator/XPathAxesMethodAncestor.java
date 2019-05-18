package xpathLocator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodAncestor {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");
			driver.switchTo().frame(0);
			WebElement link = driver.findElement(By.xpath("//a[contains(text(),'java.applet')]"));
			link.click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			link = driver.findElement(By.xpath("//a[contains(text(),'Applet')]"));
			link.click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			
			
			List<WebElement> listOfDiv = driver.findElements(By.xpath("//li[contains(text(),'java.applet.Applet')]//ancestor::li//ul//li//a"));
			Iterator<WebElement> iterator = listOfDiv.iterator();
			while (iterator.hasNext()) {
				WebElement div =iterator.next();
				System.out.println(div.getText());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
