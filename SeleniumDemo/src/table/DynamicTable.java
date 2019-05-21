package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static String driverPath;
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://code.keylimebox.org/dynamic-table/");

			List<WebElement> headers = driver
					.findElements(By.xpath("//div[@class='ui-dynamic-table-header']//table//child::td"));
			int numberOfColumns = headers.size();
			System.out.println(numberOfColumns);

			List<WebElement> rows = driver
					.findElements(By.xpath("//table[@class='ui-dynamic-table-page']//tbody//child::tr"));
			int numberOfRows = rows.size();
			System.out.println(numberOfRows);

			for (int rowsIterator = 1; rowsIterator <=numberOfRows; rowsIterator++) {
				for (int columnIterator = 1; columnIterator < numberOfColumns; columnIterator++) {
					WebElement cell = driver.findElement(By.xpath("//table[@class='ui-dynamic-table-page']//tbody//tr["
							+ rowsIterator + "]//td[" + columnIterator + "]"));
					System.out.print(cell.getText()+" ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}