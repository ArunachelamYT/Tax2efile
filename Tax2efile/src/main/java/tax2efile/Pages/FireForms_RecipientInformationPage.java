package tax2efile.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import tax2efile.Base.PageProperties;

public class FireForms_RecipientInformationPage extends PageProperties {

	public FireForms_RecipientInformationPage(WebDriver _driver) {
		super(_driver);

	}

	//************************************************************* Recipient Information Block ***********************************************************************************
	@FindBy(id = "EIN")
	private WebElement radio_EIN;

	@FindBy(id = "SSN")
	private WebElement radio_SSN;

	@FindBy(id = "txtTIN")
	private WebElement EIN_or_SSN_Field;

	@FindBy(id = "txtBusinessName")
	private WebElement business_or_first_Name;

	@FindBy(id = "txtLastName")
	private WebElement lastName;

	@FindBy(id = "ColumnsTINdetails_4__BoolValue")
	private WebElement secondTIN_chck;

	@FindBy(id = "ColumnsTINdetails_5__BoolValue")
	private WebElement FATCA_chck;

	@FindBy(id = "txtRcpntEmail")
	private WebElement emailID;

	@FindBy(id = "txtCnfrmRcpntEmail")
	private WebElement confirmEmailID;

	//****************************************************** Recipient Address Information Block **********************************************************************************

	@FindBy(xpath = "//label[text()='Does the payee have a foreign address?']")
	private WebElement RecipientAddressInfoLabelName;

	@FindBy(id = "chkAddress")
	private WebElement foreignAddressCheckbox;

	@FindBy(id = "txtAddress")
	private WebElement address;

	@FindBy(id = "txtCity")
	private WebElement city;

	@FindBy(id = "ddlState")
	private WebElement inState;

	@FindBy(id = "txtFrState")
	private WebElement outState;

	@FindBy(id = "ddlFrCountry")
	private WebElement country;

	@FindBy(id = "txtZipCode")
	private WebElement inZipcode;

	@FindBy(id = "txtFrZipCode")
	private WebElement outZipcode;
	
	
	//************************************************************** Common Locators on Recipient Information Page *********************************************************************
	@FindBy(xpath = "//h4[contains(text(),'Filer Information')]")
	private WebElement FilerInfoLabelName;

	@FindBy(id = "txtAccNo")
	private WebElement accountNo;

	@FindBy(id = "txtOfficeCode")
	private WebElement officeCode;
	
	@FindBy(id = "btnSave")
	private WebElement saveButton;
	
	//************************************************************** Filer Information 1099 - OID *********************************************************************************

	@FindBy(id = "txtOriginalIssueDiscount")
	private WebElement Original_Issue_Discount_Box1;

	@FindBy(id = "txtOtherPeriodicInterest")
	private WebElement Other_Periodic_Interest_Box2;

	@FindBy(id = "txtEarlyWithdrawalPenalty")
	private WebElement Early_Withdrawal_Penalty_Box3;

	@FindBy(id = "txtFederalIncomeTaxWithheld")
	private WebElement FederalIncome_Tax_Withheld_Box4;

	@FindBy(id = "txtMarketDiscount")
	private WebElement Market_Discount_Box5;

	@FindBy(id = "txtAcquisitionPremium")
	private WebElement Acquisition_Premium_Box6;

	@FindBy(id = "txtDescription")
	private WebElement Description_Box7;

	@FindBy(id = "txtOidOnUSTreasuryObligations")
	private WebElement OriginalIssue_Discount_OnUS_Treasury_Obligations_Box8;

	@FindBy(id = "txtInvestmentExpenses")
	private WebElement Investment_Expenses_Box9;

	@FindBy(id = "txtBondPremium")
	private WebElement Bond_Premium_Box10;

	@FindBy(id = "txtTaxExemptOID")
	private WebElement TaxExempt_OID_Box11;

	@FindBy(id = "chkPrimCombFedStatereturn")
	private WebElement Combined_Federal_State_return_chck;

	@FindBy(id = "ddlPrimStatePayerState")
	private WebElement state_Box12;

	@FindBy(id = "txtPrimStatePayerStateNum")
	private WebElement State_Identification_No_Box13;

	@FindBy(id = "txtPrimStateTaxWithheld")
	private WebElement StateTax_Withheld_Box14;

	@FindBy(id = "chkScndCombFedStatereturn")
	private WebElement Another_Combined_Federal_State_return_chck;

	@FindBy(id = "ddlScndStatePayerState")
	private WebElement state_Box12A;

	@FindBy(id = "txtScndStatePayerStateNum")
	private WebElement State_Identification_No_Box13A;

	@FindBy(id = "txtScndStateTaxWithheld")
	private WebElement StateTax_Withheld_Box14A;
	
	
	//**************************************************************  Filer Information 1099 - A *********************************************************************************
	
	@FindBy (id = "txtAOrigDate")
	private WebElement Date_of_lenders_acquisition_or_knowledge_of_abandonment_Box1;
	
	@FindBy (id = "txtBalanceofOS")
	private WebElement Balance_of_Principal_Outstanding_Box2;
	
	@FindBy (xpath = "//select[@data-handler='selectMonth']")
	private WebElement Select_month_Form1099A_Box1;
	
	@FindBy (xpath = "//select[@data-handler='selectYear']")
	private WebElement Select_year_Form1099A_Box1;
	
	@FindBy (xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
	private List<WebElement> pick_date_Form1099A_Box1;
	
	@FindBy (id = "txtFairMarketValueOfProperty")
	private WebElement Fair_Market_Value_of_Property_Box4;
	
	@FindBy (id = "ColumnsFormDetails_5__BoolValue")
	private WebElement Check_if_the_borrower_was_personally_liable_for_repayment_of_the_debt_Box5;
	
	@FindBy (id = "txtDescription")
	private WebElement Description_of_Property_Box6;
	
	
	//***************************************************************************************************************************************************************************

	static String fname;

	static String lname;
	
	static String bname;

	String[] splittedName;
	
	static String checkemailisGiven;

	public void RecipientInformation(String identifyMethod, String form, String taxID, String recipientName, String email,
			String confirmEmail) throws InterruptedException {
		
		checkemailisGiven = email;

		switch (identifyMethod) {

		case "EIN" -> {
			
			bname = recipientName;
			
			radio_EIN.click();
			EIN_or_SSN_Field.sendKeys(taxID);
			business_or_first_Name.sendKeys(bname);
			
			if (form == "OID") {
				
				secondTIN_chck.click();
				FATCA_chck.click();
				
			}
			
			emailID.sendKeys(email);
			confirmEmailID.sendKeys(confirmEmail);

			break;
		}

		case "SSN" -> {

			splittedName = recipientName.split(" ", 2);

			fname = splittedName[0];
			lname = splittedName[1];

			radio_SSN.click();
			EIN_or_SSN_Field.sendKeys(taxID);
			business_or_first_Name.sendKeys(fname);
			js.executeScript("document.getElementById('txtLastName').value='"+lname+"';");
			//lastName.sendKeys(lname);
			js.executeScript("arguments[0].click();", secondTIN_chck);
			//secondTIN_chck.click();
			FATCA_chck.click();
			emailID.sendKeys(email);
			confirmEmailID.sendKeys(confirmEmail);

			break;

		}

		default -> {

			throw new IllegalArgumentException("Unexpected Identification Method" + identifyMethod);
		}

		}

	}

	public void RecipientAddressInformation(String addType, String _address, String _city, String _state,
			String _country, String _zipcode) throws InterruptedException {

		// Scroll Down to Label Name
		//js.executeScript("arguments[0].scrollIntoView(true);", RecipientAddressInfoLabelName);
		js.executeScript("arguments[0].scrollIntoView(true);", emailID);

		switch (addType) {

		case "Within U.S" -> {

			address.sendKeys(_address);
			city.sendKeys(_city);
			dropdown = new Select(inState);
			dropdown.selectByVisibleText(_state);
			inZipcode.sendKeys(_zipcode);

			break;

		}
		case "Outside U.S" -> {

			foreignAddressCheckbox.click();
			address.sendKeys(_address);
			city.sendKeys(_city);
			js.executeScript("document.getElementById('txtFrState').value='"+_state+"';");
			//outState.sendKeys(_state);
			Thread.sleep(2000);
			dropdown = new Select(country);
			dropdown.selectByVisibleText(_country);
			outZipcode.sendKeys(_zipcode);

			break;

		}
		default -> {
			throw new IllegalArgumentException("Unexpected address type: " + addType);
		}

		}

	}

	public void Form_1099_OID_FilerInformation(String _accountNo, String officecode, String _box1, String _box2,
			String _box3, String _box4, String _box5, String _box6, String _box7, String _box8, String _box9,
			String _box10, String _box11, String _box12, String _box13, String _box14, String _box12a, String _box13a,
			String _box14a) throws InterruptedException {

		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(officecode);
		Original_Issue_Discount_Box1.sendKeys(_box1);
		Other_Periodic_Interest_Box2.sendKeys(_box2);
		Early_Withdrawal_Penalty_Box3.sendKeys(_box3);
		FederalIncome_Tax_Withheld_Box4.sendKeys(_box4);
		Market_Discount_Box5.sendKeys(_box5);
		Acquisition_Premium_Box6.sendKeys(_box6);
		Description_Box7.sendKeys(_box7);
		OriginalIssue_Discount_OnUS_Treasury_Obligations_Box8.sendKeys(_box8);
		Investment_Expenses_Box9.sendKeys(_box9);
		Bond_Premium_Box10.sendKeys(_box10);
		TaxExempt_OID_Box11.sendKeys(_box11);

		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(state_Box12);
		dropdown.selectByVisibleText(_box12);
		State_Identification_No_Box13.sendKeys(_box13);
		StateTax_Withheld_Box14.sendKeys(_box14);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(state_Box12A);
		dropdown.selectByVisibleText(_box12a);
		State_Identification_No_Box13A.sendKeys(_box13a);
		StateTax_Withheld_Box14A.sendKeys(_box14a);

		saveButton.click();

	}
	
	
	public void Form_1099_A_FilerInformation(String _accountNo, String officecode, String _year, String _month, String _date, String _box2, String _box4, String _box6) {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(officecode);
		
		Date_of_lenders_acquisition_or_knowledge_of_abandonment_Box1.click();
		
		dropdown = new Select(Select_year_Form1099A_Box1);
		dropdown.selectByVisibleText(_year);
		
		dropdown = new Select(Select_month_Form1099A_Box1);
		dropdown.selectByVisibleText(_month);
		
		for (WebElement date : pick_date_Form1099A_Box1) {
			
			if (date.getText().equalsIgnoreCase(_date)) {
				
				date.click();
				break;
			}
			
		}
		
		Balance_of_Principal_Outstanding_Box2.sendKeys(_box2);
		
		Fair_Market_Value_of_Property_Box4.sendKeys(_box4);
		
		Check_if_the_borrower_was_personally_liable_for_repayment_of_the_debt_Box5.click();
		
		Description_of_Property_Box6.sendKeys(_box6);
		
		saveButton.click();
		
	}

}
