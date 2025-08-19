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
	
	@FindBy(id = "txtFederalIncomeTaxWithheld")
	private WebElement Federal_Income_Tax_Withheld_Box4;
	
	@FindBy (xpath = "//select[@data-handler='selectMonth']")
	private WebElement Select_month;
	
	@FindBy (xpath = "//select[@data-handler='selectYear']")
	private WebElement Select_year;
	
	@FindBy (xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
	private List<WebElement> pick_date;
	
	@FindBy(id = "btnSave")
	private WebElement saveButton;
	
	//************************************************************** Filer Information 1099 - OID *********************************************************************************

	@FindBy(id = "txtOriginalIssueDiscount")
	private WebElement Original_Issue_Discount_Box1;

	@FindBy(id = "txtOtherPeriodicInterest")
	private WebElement Other_Periodic_Interest_Box2;

	@FindBy(id = "txtEarlyWithdrawalPenalty")
	private WebElement Early_Withdrawal_Penalty_Box3;

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
	private WebElement state_Box;

	@FindBy(id = "txtScndStatePayerStateNum")
	private WebElement State_Identification_No_Box;

	@FindBy(id = "txtScndStateTaxWithheld")
	private WebElement StateTax_Withheld_Box;
	
	
	//**************************************************************  Filer Information 1099 - A *********************************************************************************
	
	@FindBy (id = "txtAOrigDate")
	private WebElement Date_of_lenders_acquisition_or_knowledge_of_abandonment_Box1;
	
	@FindBy (id = "txtBalanceofOS")
	private WebElement Balance_of_Principal_Outstanding_Box2;
	
	@FindBy (id = "txtFairMarketValueOfProperty")
	private WebElement Fair_Market_Value_of_Property_Box4;
	
	@FindBy (id = "ColumnsFormDetails_5__BoolValue")
	private WebElement Check_if_the_borrower_was_personally_liable_for_repayment_of_the_debt_Box5;
	
	@FindBy (id = "txtDescription")
	private WebElement Description_of_Property_Box6;
	
	
	//****************************************************  Filer Information 1099 - B ****************************************************************************
	
	@FindBy (id = "ddlDistributionCodes")
	private WebElement Applicable_checkbox_on_Form_8949;
	
	@FindBy (id = "txtCUSIPNo")
	private WebElement CUSIP_No;
	
	@FindBy (id = "txtDescription")
	private WebElement Description_of_property_Box1a;
	
	@FindBy (id = "txtDateAcquired")
	private WebElement Date_acquired_Box_1b;
	
	@FindBy (id = "txtDateSold")
	private WebElement Date_sold_or_disposed_Box1c;
	
	@FindBy (id = "txtProceeds")
	private WebElement Proceeds_Box1d;
	
	@FindBy (id = "txtCostOtherBasis")
	private WebElement Cost_or_other_basis_Box1e;
	
	@FindBy (id = "txtAccruedMarketDiscount")
	private WebElement Accrued_market_discount_Box1f;
	
	@FindBy (id = "txtWashSaleLossDisallowed")
	private WebElement Wash_sale_loss_disallowed_Box1g;
	
	@FindBy (id = "ColumnsFormDetails_14__BoolValue")
	private WebElement Short_term_gain_or_loss;
	
	@FindBy (id = "ColumnsFormDetails_16__BoolValue")
	private WebElement Long_term_gain_or_loss;
	
	@FindBy (id = "ColumnsFormDetails_18__BoolValue")
	private WebElement Ordinary;
	
	@FindBy (id = "ColumnsFormDetails_15__BoolValue")
	private WebElement Collectibles;
	
	@FindBy (id = "ColumnsFormDetails_17__BoolValue")
	private WebElement QOF;
	
	@FindBy (id = "ColumnsFormDetails_20__BoolValue")
	private WebElement Check_if_noncovered_security_Box5;
	
	@FindBy (id = "ColumnsFormDetails_23__BoolValue")
	private WebElement Gross_proceeds;
	
	@FindBy (id = "ColumnsFormDetails_25__BoolValue")
	private WebElement Net_proceeds;
	
	@FindBy (id = "ColumnsFormDetails_22__BoolValue")
	private WebElement Check_if_loss_is_not_allowed_based_on_amount_in_1d_Box7;
	
	@FindBy (id = "txtProfitLoss")
	private WebElement Profit_or_loss_realized_in_2024_on_closed_contracts_Box8;
	
	@FindBy (id = "txtUnrealizedProfitLoss21")
	private WebElement Unrealized_profit_or_loss_on_open_contracts_12_31_2023_Box9;
	
	@FindBy (id = "txtUnrealizedProfitLoss22")
	private WebElement Unrealized_profit_or_loss_on_open_contracts_12_31_2024_Box10;
	
	@FindBy (id = "txtAggregateProfitLoss")
	private WebElement Aggregate_profit_or_loss_on_contracts_Box11;
	
	@FindBy (id = "ColumnsFormDetails_29__BoolValue")
	private WebElement Check_if_basis_reported_to_IRS_Box12;
	
	@FindBy (id = "txtBartering")
	private WebElement Bartering_Box_13;
	
	//****************************************************  Filer Information 1099 - C ****************************************************************************
	
	@FindBy (id = "txtCIdentDate")
	private WebElement Date_of_identifiable_event_Box1;
	
	@FindBy (id = "txtAmountofdebtdischarged")
	private WebElement Amount_of_debt_discharged_Box2;
	
	@FindBy (id = "txtInterestifincludedinbox2")
	private WebElement Interest_if_included_in_box2_Box3;
	
	@FindBy (id = "txtDebtdescription")
	private WebElement Debt_description_Box4;
	
	@FindBy (id = "ColumnsFormDetails_6__BoolValue")
	private WebElement Check_if_the_debtor_was_personally_liable_for_repayment_of_the_debt_Box5;
	
	@FindBy (id = "ddlDistributionCodes")
	private WebElement Identifiable_event_code_Box6;
	
	@FindBy (id = "txtFairmarketvalueofproperty")
	private WebElement Fair_market_value_of_property_Box7;

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
			
			if (form == "OID" || form == "B") {
				
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

			if (form == "OID" || form == "B") {
				
				js.executeScript("arguments[0].click();", secondTIN_chck);
				FATCA_chck.click();
				
			}
			
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
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
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
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_box12a);
		State_Identification_No_Box.sendKeys(_box13a);
		StateTax_Withheld_Box.sendKeys(_box14a);

		saveButton.click();

	}
	
	
	public void Form_1099_A_FilerInformation(String _accountNo, String officecode, String _year, String _month, String _date, String _box2, String _box4, String _box6) {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(officecode);
		
		Date_of_lenders_acquisition_or_knowledge_of_abandonment_Box1.click();
		
		dropdown = new Select(Select_year);
		dropdown.selectByVisibleText(_year);
		
		dropdown = new Select(Select_month);
		dropdown.selectByVisibleText(_month);
		
		for (WebElement date : pick_date) {
			
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

	public void Form_1099_B_FilerInformation(String _accountNo, String officecode, String _Select_form_8949, String _cusipNo, String _descriptionOfProperty, 
			String _year, String _month, String _date, String _box1d, String _box1e, String _box1f, String _box1g, String _termType, String _box4
			,String _box8, String _box9, String _box10, String _box11, String _box13, String _box14, String _box15, String _box16, String _box14a, String _box15a, String _box16a) throws InterruptedException {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(officecode);
		
		dropdown = new Select(Applicable_checkbox_on_Form_8949);
		dropdown.selectByVisibleText(_Select_form_8949);
		CUSIP_No.sendKeys(_cusipNo);
		Description_of_property_Box1a.sendKeys(_descriptionOfProperty);
		
		Date_acquired_Box_1b.click();
		
		dropdown = new Select(Select_year);
		dropdown.selectByVisibleText(_year);
		
		dropdown = new Select(Select_month);
		dropdown.selectByVisibleText(_month);
		
		for (WebElement date : pick_date) {
			
			if (date.getText().equalsIgnoreCase(_date)) {
				
				date.click();
				break;
			}
			
		}
		
		Date_sold_or_disposed_Box1c.click();
		
		dropdown = new Select(Select_year);
		dropdown.selectByVisibleText(_year);
		
		dropdown = new Select(Select_month);
		dropdown.selectByVisibleText(_month);
		
		for (WebElement date : pick_date) {
			
			if (date.getText().equalsIgnoreCase(_date)) {
				
				date.click();
				break;
			}
			
		}
		
		Proceeds_Box1d.sendKeys(_box1d);
		Cost_or_other_basis_Box1e.sendKeys(_box1e);
		Accrued_market_discount_Box1f.sendKeys(_box1f);
		Wash_sale_loss_disallowed_Box1g.sendKeys(_box1g);
		
		if (_termType == "Short-term") {
			
			Short_term_gain_or_loss.click();
			
		}
		else if (_termType == "Long-term") {
			
			Long_term_gain_or_loss.click();
			
		}
		
		Ordinary.click();
		Collectibles.click();
		QOF.click();
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
		Check_if_noncovered_security_Box5.click();
		Net_proceeds.click();
		Profit_or_loss_realized_in_2024_on_closed_contracts_Box8.sendKeys(_box8);
		Unrealized_profit_or_loss_on_open_contracts_12_31_2023_Box9.sendKeys(_box9);
		Unrealized_profit_or_loss_on_open_contracts_12_31_2024_Box10.sendKeys(_box10);
		Aggregate_profit_or_loss_on_contracts_Box11.sendKeys(_box11);
		Check_if_basis_reported_to_IRS_Box12.click();
		Bartering_Box_13.sendKeys(_box13);
		
		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(state_Box12);
		dropdown.selectByVisibleText(_box14);
		State_Identification_No_Box13.sendKeys(_box15);
		StateTax_Withheld_Box14.sendKeys(_box16);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_box14a);
		State_Identification_No_Box.sendKeys(_box15a);
		StateTax_Withheld_Box.sendKeys(_box16a);

		saveButton.click();
		
	}

	public void Form_1099_C_FilerInformation(String _accountNo, String _officecode, String _year, String _month, String _date, 
			String _box2, String _box3, String _box4, String _box6, String _box7) {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Date_of_identifiable_event_Box1.click();
		
		dropdown = new Select(Select_year);
		dropdown.selectByVisibleText(_year);
		
		dropdown = new Select(Select_month);
		dropdown.selectByVisibleText(_month);
		
		for (WebElement date : pick_date) {
			
			if (date.getText().equalsIgnoreCase(_date)) {
				
				date.click();
				break;
			}
			
		}
		
		Amount_of_debt_discharged_Box2.sendKeys(_box2);
		Interest_if_included_in_box2_Box3.sendKeys(_box3);
		Debt_description_Box4.sendKeys(_box4);
		Check_if_the_debtor_was_personally_liable_for_repayment_of_the_debt_Box5.click();
		
		dropdown = new Select(Identifiable_event_code_Box6);
		dropdown.selectByVisibleText(_box6);
		Fair_market_value_of_property_Box7.sendKeys(_box7);
		
		saveButton.click();

		
	}

}
