package SelectOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("http://www.studydunes.com/online-training");		
			driver.manage().window().fullscreen();
			
			WebElement stream = driver.findElement(By.xpath("//select[@id='ClassRoomSubjectId']"));	
			Select selectStream = new Select(stream);
			selectStream.selectByIndex(1);
			Thread.sleep(2000);
			selectStream.selectByValue("2");
			Thread.sleep(2000);
			selectStream.selectByVisibleText("Technology");
			Thread.sleep(2000);
			
			WebElement subject = driver.findElement(By.xpath("//select[@id='ClassRoom][stream_id]']"));	
			Select selectSubject = new Select(subject);
			selectSubject.selectByVisibleText("Technology & Innovation");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
