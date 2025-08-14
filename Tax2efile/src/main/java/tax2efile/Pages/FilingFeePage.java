package tax2efile.Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import tax2efile.Base.PageProperties;

public class FilingFeePage extends PageProperties {

	public FilingFeePage(WebDriver _driver) {

		super(_driver);
	}

	// Print and Email Service Information
	@FindBy(id = "pms")
	private WebElement printAndMail_Checkbox;

	@FindBy(id = "srcpnt")
	private WebElement SendEmail_Checkbox;

	// Coupon and Veteran discount Information
	@FindBy(id = "redeem")
	private WebElement coupon_Yes;

	@FindBy(id = "noRedeem")
	private WebElement coupon_No;

	@FindBy(id = "Couponcode")
	private WebElement couponField;

	@FindBy(id = "btnDis")
	private WebElement getDiscountBtn;

	@FindBy(id = "CardInfo_AfterDiscount")
	private WebElement discountAmountAppliedField;

	@FindBy(id = "VAClick")
	private WebElement veteran_Yes;

	@FindBy(id = "noVAClick")
	private WebElement veteran_No;
	
	@FindBy(id = "VerifyVa_FirstName")
	private WebElement veteran_Fname;
	
	@FindBy(id = "VerifyVa_MiddleName")
	private WebElement veteran_Mname;
	
	@FindBy(id = "VerifyVa_LastName")
	private WebElement veteran_Lname;
	
	@FindBy(id = "VerifyVa_BirthDate")
	private WebElement veteran_BirthDateField;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	private WebElement veteran_MonthDrp;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	private WebElement veteran_YearDrp;
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler='selectDay']/a")
	private List<WebElement> veteran_Day;
	
	@FindBy(id = "GenderMale")
	private WebElement gender_Yes;
	
	@FindBy(id = "GenderFemale")
	private WebElement gender_No;
	
	@FindBy(id = "VerifyVa_AddressLine1")
	private WebElement veteran_Address;
	
	@FindBy(id = "VerifyVa_City")
	private WebElement veteran_City;
	
	@FindBy(id = "VerifyVa_State")
	private WebElement veteran_State;
	
	@FindBy(id = "VerifyVa_Country")
	private WebElement veteran_Country;
	
	@FindBy(id = "VerifyVa_Zipcode")
	private WebElement veteran_Zipcode;
	
	@FindBy(id = "divVrfyVA")
	private WebElement veteran_VerifyBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Veteran Status Confirmed And Discount Applied.')]")
	private WebElement veteran_DiscountApplied_PopupBox;
	
	@FindBy(id = "btncnfCancel")
	private WebElement veteran_PopupConfirmation_OkButton;
	
	// Credit Card Information
	@FindBy(id = "CardName")
	private WebElement cardHolderName;

	@FindBy(id = "CardInfo_CardType")
	private WebElement creditCardType;

	@FindBy(id = "CardNumber")
	private WebElement creditCardNumber;

	@FindBy(id = "CardInfo_Month")
	private WebElement ExpireDate;

	@FindBy(id = "CardInfo_Year")
	private WebElement ExpireYear;

	@FindBy(id = "CVV")
	private WebElement CVV;

	// Biling Information
	@FindBy(id = "ProfileAddress")
	private WebElement sameAddressCheckbox;

	@FindBy(id = "FirstName")
	private WebElement firstName;

	@FindBy(id = "LastName")
	private WebElement lastName;

	@FindBy(id = "StreetNumber")
	private WebElement address;

	@FindBy(id = "City")
	private WebElement city;

	@FindBy(id = "Country")
	private WebElement country;

	@FindBy(id = "State")
	private WebElement state;

	@FindBy(id = "Zipcode")
	private WebElement zipcode;

	@FindBy(id = "AuthorizedPerson")
	private WebElement authorizedPersonName;

	@FindBy(id = "TermsAndConditon")
	private WebElement termsAndCondition_Checkbox;

	@FindBy(id = "btnSave")
	private WebElement payNowButton;

	@FindBy(xpath = "//p[contains(text(),'Discount Applied ')]")
	private WebElement discountAppiled_label;
	
	@FindBy(xpath = "//p[text()='CONGRATULATIONS!']")
	private WebElement confirmation_Label;

	public FilingFeePage PMSDetails() {

		wait.until(ExpectedConditions.visibilityOf(printAndMail_Checkbox)).click();

		if (FireForms_RecipientInformationPage.checkemailisGiven != null) {

			SendEmail_Checkbox.click();
		}

		return this;

	}

	public FilingFeePage couponDetails(String cpCode) {

		if (cpCode != null) {

			coupon_Yes.click();

			couponField.sendKeys(cpCode);

			getDiscountBtn.click();

			wait.until(ExpectedConditions.visibilityOf(discountAppiled_label));

		}

		return this;
	}

	public FilingFeePage veteranDetails(String fname, String mname, String lname, String month, String year, String day) {
		
		veteran_Yes.click();
		
		veteran_Fname.sendKeys(fname);
		
		veteran_Mname.sendKeys(mname);
		
		veteran_Lname.sendKeys(lname);
		
		veteran_BirthDateField.click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-datepicker-div"))));
		
		dropdown = new Select(veteran_MonthDrp);
		dropdown.selectByVisibleText(month);
		
		dropdown = new Select(veteran_YearDrp);
		dropdown.selectByVisibleText(year);
		
		for (WebElement _Day : veteran_Day) {
			
			String text = _Day.getText();
			
			if (text.contains(day)) {
				
				_Day.click();
			}
		}
		
		wait.until(ExpectedConditions.visibilityOf(veteran_DiscountApplied_PopupBox));
		
		veteran_PopupConfirmation_OkButton.click();

		return this;
	}

	public FilingFeePage CreditCardInfo(String cardName, String cardType, String creditNumber, String expireMonth,
			String expireYear, String cvv) {

		cardHolderName.sendKeys(cardName);

		dropdown = new Select(creditCardType);
		dropdown.selectByVisibleText(cardType);

		creditCardNumber.sendKeys(creditNumber);

		ExpireDate.sendKeys(expireMonth);

		ExpireYear.sendKeys(expireYear);

		CVV.sendKeys(cvv);

		return this;
	}

	public FilingFeePage BillingInfo(String authName) {
		
		sameAddressCheckbox.click();
		
		authorizedPersonName.sendKeys(authName);
		
		termsAndCondition_Checkbox.click();

		return this;
	}
	
	public OrderConfirmationPage ClickPayNow() {
		
		payNowButton.click();
		
		return new OrderConfirmationPage(driver);
	}

	public void ContinueWithoutPayment() {
		
		wait.until(ExpectedConditions.visibilityOf(confirmation_Label)).isDisplayed();
		
	}

}
