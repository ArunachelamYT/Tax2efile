package tax2efile.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tax2efile.Base.PageProperties;

public class FilingFeePage extends PageProperties {

	public FilingFeePage(WebDriver _driver) {
		
		super(_driver);
	}
	// Print and Email Service Information
	@FindBy (id="pms")
	private WebElement printAndMail_Checkbox;
	
	@FindBy (id="srcpnt")
	private WebElement SendEmail_Checkbox;
	
	// Coupon and Veteran discount Information
	@FindBy (id="redeem")
	private WebElement coupon_Yes;
	
	@FindBy (id="noRedeem")
	private WebElement coupon_No;
	
	@FindBy (id = "VAClick")
	private WebElement veteran_Yes;
	
	@FindBy (id = "noVAClick")
	private WebElement veteran_No;
	
	// Credit Card Information
	@FindBy (id = "CardName")
	private WebElement cardHolderName;
	
	@FindBy (id = "CardInfo_CardType")
	private WebElement creditCardType;
	
	@FindBy (id = "CardNumber")
	private WebElement creditCardNumber;
	
	@FindBy (id = "CardInfo_Month")
	private WebElement ExpireDate;
	
	@FindBy (id = "CardInfo_Year")
	private WebElement ExpireYear;
	
	@FindBy (id = "CVV")
	private WebElement cvv;
	
	// Biling Information
	@FindBy (id="ProfileAddress")
	private WebElement sameAddressCheckbox;

	@FindBy (id="FirstName")
	private WebElement firstName;
	
	@FindBy (id="LastName")
	private WebElement lastName;
	
	@FindBy (id="StreetNumber")
	private WebElement address;
	
	@FindBy (id="City")
	private WebElement city;
	
	@FindBy (id="Country")
	private WebElement country;
	
	@FindBy (id="State")
	private WebElement state;
	
	@FindBy (id="Zipcode")
	private WebElement zipcode;
	
	@FindBy (id="AuthorizedPerson")
	private WebElement authorizedPersonName;
	
	@FindBy (id="TermsAndConditon")
	private WebElement termsAndCondition_Checkbox;
	
	@FindBy (id="btnSave")
	private WebElement payNowButton;

	public void PMSDetails() {
		
	}

	public static void couponAndVeteranDetails() {
		
		
	}

	public static void CreditCardInfo() {
		
		
	}

	public static void BillingInfo() {
		
		
	}

}
