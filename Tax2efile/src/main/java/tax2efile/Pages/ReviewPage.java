package tax2efile.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tax2efile.Base.PageProperties;

public class ReviewPage extends PageProperties {

	public ReviewPage(WebDriver _driver) {
		super(_driver);

	}
	
	@FindBy (id= "btnSave")
	private WebElement saveAndContinueBtn;
	
	public FilingFeePage ClickSaveButton() {
		
		wait.until(ExpectedConditions.visibilityOf(saveAndContinueBtn)).click();
		
		return new FilingFeePage(driver);
	}

}
