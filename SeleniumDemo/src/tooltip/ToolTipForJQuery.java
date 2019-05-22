package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipForJQuery {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://www.tutorialspark.com/jqueryUI/jQuery_UI_Tooltip_using_HTML.php");
			driver.switchTo().frame("preview");
			

			WebElement jupiter = driver.findElement(By.xpath("//a[contains(text(),'Jupiter')]"));							
	        Actions seriesOfAction = new Actions (driver);					
	        seriesOfAction.moveToElement(jupiter).click().build().perform(); 	
	        
	        WebElement toolTipElement = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']//div[@id='title']"));							
	        String actualTooltip = toolTipElement.getText(); 	        
			System.out.println("Tool tip text is: " + actualTooltip);
	        
	        WebElement toolTipElement2 = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']//div[@id='content']"));							
	        String actualTooltip2 = toolTipElement2.getText();	        
			System.out.println("Tool tip text is: " + actualTooltip2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
