package tax2efile.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tax2efile.Base.PageProperties;

public class OrderConfirmationPage extends PageProperties {

	public OrderConfirmationPage(WebDriver _driver) {
		super(_driver);

	}
	
	
	@FindBy (xpath ="//p[text()='CONGRATULATIONS!']")
	private WebElement confirmation_Label;
	
	public void CheckOrderIsConfirmed() {
		
		wait.until(ExpectedConditions.visibilityOf(confirmation_Label)).isDisplayed();
	}
	
}
