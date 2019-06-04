package framework.keyworddriven;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindWebElement {

	private static WebElement element;
	private static List listOfElements;

	public static WebElement webElementLocator(WebDriver driver, String id, String type, String value,
			Properties prop) {

		switch (type.toUpperCase()) {

		case "NAME":
			element = driver.findElement(By.name(prop.getProperty(id)));
			break;

		case "CLASSNAME":
			element = driver.findElement(By.className(prop.getProperty(id)));
			break;

		case "CSSSELECTOR":
			element = driver.findElement(By.cssSelector(prop.getProperty(id)));
			break;

		case "ID":
			element = driver.findElement(By.id(prop.getProperty(id)));
			break;

		case "LINKTEXT":
			element = driver.findElement(By.linkText(value));
			break;

		case "PARTIALLINKTEXT":
			element = driver.findElement(By.partialLinkText(value));
			break;

		case "TAGNAME":
			element = driver.findElement(By.tagName(id));
			break;

		case "XPATH":
			element = driver.findElement(By.xpath(prop.getProperty(id)));
			break;

		default:
			System.out.println("No Element is required");
		}
		return element;
	}

	public static WebElement webElementLocator(WebDriver driver, String id, String type, Properties prop)
			throws Exception {

		switch (type.toUpperCase()) {

		case "NAME":
			element = driver.findElement(By.name(prop.getProperty(id)));
			break;

		case "CLASSNAME":
			element = driver.findElement(By.className(prop.getProperty(id)));
			break;

		case "CSSSELECTOR":
			element = driver.findElement(By.cssSelector(prop.getProperty(id)));
			break;

		case "ID":
			element = driver.findElement(By.id(prop.getProperty(id)));
			break;

		default:
			System.out.println("No Element is required");
		}
		return element;
	}

	public static List webElementsLocator(WebDriver driver, String id, String type, String value, Properties prop) {

		switch (type.toUpperCase()) {

		case "CLASSNAME":
			listOfElements = driver.findElements(By.className(prop.getProperty(id)));
			break;

		case "CSSSELECTOR":
			listOfElements = driver.findElements(By.cssSelector(prop.getProperty(id)));
			break;

		case "LINKTEXT":
			listOfElements = driver.findElements(By.linkText(value));
			break;

		case "PARTIALLINKTEXT":
			listOfElements = driver.findElements(By.partialLinkText(value));
			break;

		case "TAGNAME":
			listOfElements = driver.findElements(By.tagName(id));
			break;

		default:
			System.out.println("No Element is required");
		}
		return listOfElements;
	}

}
