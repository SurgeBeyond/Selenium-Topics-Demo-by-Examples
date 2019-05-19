package frames;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfFrames {

	private static String driverPath;
	private static String URL = "https://docs.oracle.com/javase/7/docs/api/";

	public static void main(String[] args) {

		try {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(URL);
			
			List<WebElement> webElementList = driver.findElements(By.tagName("frame"));
			Iterator<WebElement> iterator = webElementList.iterator();
			
			System.out.println("Total numbers of frames are: "+ webElementList.size());
			System.out.println();
			
			while(iterator.hasNext()){
				WebElement frameElement = iterator.next();
				String frameName = frameElement.getAttribute("name");
				System.out.println("Frame name is: "+ frameName);
			}
			
			driver.quit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
