package frames;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFramesByName  {

	private static String driverPath ;
	private static String URL = "https://docs.oracle.com/javase/7/docs/api/";

	public static void main(String[] args){
		
		try{			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			driver.navigate().to(URL);
			
			List<WebElement> elementList = driver.findElements(By.tagName("frame"));			
			Iterator<WebElement> iterator = elementList.iterator();
			
			WebElement webElement1 = iterator.next();			
			WebElement webElement2 = iterator.next();			
			WebElement webElement3 = iterator.next();
			
			System.out.println(webElement1.getAttribute("name"));
			System.out.println(webElement2.getAttribute("name"));
			System.out.println(webElement3.getAttribute("name"));			
			
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.linkText("java.awt")).click();
			
			driver.switchTo().parentFrame();
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.linkText("ActiveEvent")).click();
			
			driver.switchTo().parentFrame();
			driver.switchTo().frame("classFrame");
			System.out.println(driver.getPageSource().contains("Interface ActiveEvent"));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

