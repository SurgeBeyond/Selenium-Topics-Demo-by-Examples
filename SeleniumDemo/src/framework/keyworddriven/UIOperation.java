package framework.keyworddriven;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UIOperation {

	private static WebDriver driver;
	private static WebElement element1, element2;

	public static void performOperation(WebDriver webDriver, Properties prop, String action, String id, String type,
			String value) {
		try {
			driver = webDriver;

			switch (action.toUpperCase()) {

			case "GET":
				driver.get(value);
				break;

			case "SETTEXT":
				element1 = FindWebElement.webElementLocator(driver, id, type, value, prop);
				element1.sendKeys(value);
				break;

			case "CLEAR":
				element1 = FindWebElement.webElementLocator(driver, id, type, value, prop);
				element1.clear();
				break;

			case "SUBMIT":
				element1 = FindWebElement.webElementLocator(driver, id, type, value, prop);
				element1.submit();
				break;

			case "CLICK":
				element1 = FindWebElement.webElementLocator(driver, id, type, value, prop);
				element1.click();
				break;

			default:
				System.out.println("No action to be taken");
				break;
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}// End

	public static void performOperation(WebDriver webDriver, Properties prop, String action, String id, String type,
			int value) {
		try {
			driver = webDriver;

			switch (action.toUpperCase()) {

			case "SETTEXT":
				element1 = FindWebElement.webElementLocator(driver, id, type, prop);
				element1.sendKeys(Integer.toString(value));
				break;

			case "CLEAR":
				element1 = FindWebElement.webElementLocator(driver, id, type, prop);
				element1.clear();
				break;

			case "SUBMIT":
				element1 = FindWebElement.webElementLocator(driver, id, type, prop);
				element1.submit();
				break;

			case "CLICK":
				element1 = FindWebElement.webElementLocator(driver, id, type, prop);
				element1.click();
				break;

			case "SLEEP":
				Thread.sleep(value);
				break;

			default:
				System.out.println("No action to be taken");
				break;
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}// End
}
