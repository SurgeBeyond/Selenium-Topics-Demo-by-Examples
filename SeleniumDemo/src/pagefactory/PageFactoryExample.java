package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryExample {

	private WebDriver driver;

	@FindBy(name = "q")
	WebElement inputBox;

	@FindBy(partialLinkText = "Soarlogic")
	WebElement link;

	public PageFactoryExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setTextAndSubmit(String text) throws Exception {
		try {
			// Object Repository
			inputBox.sendKeys(text);
			inputBox.submit();

			Thread.sleep(3000);

			link.click();
		} catch (Exception e) {
			throw e;
		}
	}
}
