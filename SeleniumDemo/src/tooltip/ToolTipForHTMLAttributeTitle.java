package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipForHTMLAttributeTitle {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.seleniumhq.org/");

			WebElement anchor = driver.findElement(By.xpath("//li[@id='menu_download']//a[contains(text(),'Download')]"));
			String toolTipText = anchor.getAttribute("title");
			System.out.println("Tool tip text is: " + toolTipText);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
