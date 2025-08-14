package tax2efile.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import tax2efile.Base.PageProperties;

public class FireForms_PayerInformationPage extends PageProperties {

	public FireForms_PayerInformationPage(WebDriver Driver) {
		super(Driver);
	}

	@FindBy(id = "businesstype")
	private WebElement BusinessType;

	@FindBy(id = "BusinessName")
	private WebElement BusinessName;

	@FindBy(id = "FirstName")
	private WebElement Fname;

	@FindBy(id = "LastName")
	private WebElement Lname;

	@FindBy(id = "BusinessProfile_TaxID")
	private WebElement SSN;

	@FindAll(@FindBy(id = "WithUS"))
	private WebElement WithinUS_chck;

	@FindAll(@FindBy(id = "OutUS"))
	private WebElement OutsideUS_chck;

	@FindBy(id = "BusinessProfile_Address")
	private WebElement adrress;

	@FindBy(id = "BusinessProfile_City")
	private WebElement city;

	@FindBy(id = "BusinessProfile_Country")
	private WebElement country;

	@FindBy(id = "drpState")
	private WebElement state_IN;

	@FindBy(id = "txtState")
	private WebElement state_OUT;

	@FindBy(id = "BusinessProfile_Zipcode")
	private WebElement zipCode;

	@FindBy(id = "BusinessProfile_Phone")
	private WebElement phoneNumber;

	@FindBy(id = "btnSave")
	private WebElement saveButton;

	@FindBy(id = "btnUserOriginalAddress")
	private WebElement UseCurrentAddress_Btn;

	// splittedName
	String[] splittedName;

	// fname
	static String fname;

	// lname
	static String lname;
	
	//business Name
	static String businessName;

	// Payer Information Block
	public void ProvidePayerInformation(String businessType, String _ProfileName, String ssn) {

		switch (businessType) {

		case "Individual", "Estate" -> {

			// If it is equal to "Individual", "Estate". Spilt the businessName into two
			// pieces
			splittedName = _ProfileName.split(" ", 2);

			fname = splittedName[0];
			lname = splittedName[1];

			dropdown = new Select(BusinessType);
			dropdown.selectByContainsVisibleText(businessType);

			Fname.sendKeys(fname);

			Lname.sendKeys(lname);

			SSN.sendKeys(ssn);

			break;

		}

		case "Corporation", "Sole Proprietor", "Partnership", "Trust and Fiduciaries", "Government Entity",
				"Exempt Organization", "LLC" -> {
					
			
			businessName = _ProfileName;
			
			dropdown = new Select(BusinessType);
			dropdown.selectByContainsVisibleText(businessType);

			BusinessName.sendKeys(businessName);

			SSN.sendKeys(ssn);

			break;
		}

		default -> {

			throw new IllegalArgumentException("Unexpected Business TYpe: " + businessType);

		}

		}

	}

	// Payer Address Information Block
	public FireForms_PayerListPage ProvidePayerAddressInformation(String addressType, String _address, String _city,
			String _country, String _state, String _zipcode, String _phonenum) {

		switch (addressType) {

		case "Within U.S" -> {

			WithinUS_chck.click();

			adrress.sendKeys(_address);

			city.sendKeys(_city);

			dropdown = new Select(state_IN);
			dropdown.selectByVisibleText(_state);

			zipCode.sendKeys(_zipcode);

			phoneNumber.sendKeys(_phonenum);

			break;

		}

		case "Outside U.S" -> {

			OutsideUS_chck.click();

			adrress.sendKeys(_address);

			city.sendKeys(_city);

			dropdown = new Select(country);
			dropdown.selectByVisibleText(_country);

			state_OUT.sendKeys(_state);

			zipCode.sendKeys(_zipcode);

			phoneNumber.sendKeys(_phonenum);

			break;

		}

		default -> {
			throw new IllegalArgumentException("Unexpected Address Type: " + addressType);

		}
		}
		saveButton.click();

		wait.until(ExpectedConditions.visibilityOf(UseCurrentAddress_Btn)).click();

		return new FireForms_PayerListPage(driver);

	}

}
