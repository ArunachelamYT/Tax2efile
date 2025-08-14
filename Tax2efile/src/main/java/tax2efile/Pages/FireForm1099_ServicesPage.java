package tax2efile.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import tax2efile.Base.PageProperties;

public class FireForm1099_ServicesPage extends PageProperties {

	public FireForm1099_ServicesPage(WebDriver Driver) {
		super(Driver);
	}

	@FindBy(xpath = "//h3[text()='1099 Form Services ']")
	private WebElement Form99ServicesPage_Text;

	@FindBy(id = "selfService")
	private WebElement option1;

	@FindBy(id = "optpremium")
	private WebElement option2;

	@FindBy(id = "formSelection")
	private WebElement SelectForm;

	@FindBy(id = "btnstartfiling")
	private WebElement StartFiling;

	@FindBy(id = "TaxInformation_TaxPeriod")
	private WebElement SelectTaxYear;

	@FindBy(id = "btnSave")
	private WebElement saveButton;

	public FireForms_PayerListPage StartE_filing(String form, String taxYear) {

		wait.until(ExpectedConditions.visibilityOf(Form99ServicesPage_Text));
		option1.click();
	
		dropdown = new Select(SelectForm);
		dropdown.selectByContainsVisibleText(form);
		StartFiling.click();

		dropdown = new Select(SelectTaxYear);
		dropdown.selectByContainsVisibleText(taxYear);
		saveButton.click();

		return new FireForms_PayerListPage(driver);
	}

}
