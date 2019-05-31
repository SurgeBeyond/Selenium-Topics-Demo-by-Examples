package testng.dataprovideraspermethodname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	public static String driverPath;
	public static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
	}

	@Test(dataProvider = "DataProviderMethod", dataProviderClass = DataProviderClass.class)
	public void searchCat(String text1, String text2) {
		try {
			WebElement inputTextBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
			inputTextBox.sendKeys(text1 + text2);

			Thread.sleep(3000);

			inputTextBox.clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(dataProvider = "DataProviderMethod", dataProviderClass = DataProviderClass.class)
	public void searchDog(String text1, String text2) {
		try {
			WebElement inputTextBox = driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
			inputTextBox.sendKeys(text1 + text2);

			Thread.sleep(3000);

			inputTextBox.clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@DataProvider(name = "DataProviderMethodName")
	public Object[][] getData() {
		return new Object[][] { { "hello ", "World" }, { "21st ", "Century" }, { "Surge ", "Beyond" } };
	}

}
