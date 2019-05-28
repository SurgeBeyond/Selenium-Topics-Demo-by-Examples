package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectRepositoryAndOperation {

	private WebDriver driver;
	private By byNameInputBox = By.name("q");
	private By byPartialLinkTextAsSoarLogic = By.partialLinkText("Soarlogic");
	private WebElement inputBox;

	public PageObjectRepositoryAndOperation(WebDriver driver) {
		this.driver = driver;
	}

	public void setTextAndSubmit(String text) throws Exception {
		try {
			// Object Repository
			inputBox = driver.findElement(byNameInputBox);
			inputBox.sendKeys(text);
			inputBox.submit();

			Thread.sleep(3000);

			WebElement link = driver.findElement(byPartialLinkTextAsSoarLogic);
			link.click();

		} catch (Exception e) {
			throw e;
		}
	}
}
