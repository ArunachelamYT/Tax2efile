package tax2efile.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
	////
	@FindBy(id = "chkPrimCombFedStatereturn")
	private WebElement Combined_Federal_State_return_chck;

	@FindBy(id = "ddlPrimStatePayerState")
	private WebElement State;

	@FindBy(id = "txtPrimStatePayerStateNum")
	private WebElement State_Identification_No;

	@FindBy(id = "txtPrimStateTaxWithheld")
	private WebElement StateTax_Withheld;
	
	@FindBy (id = "txtPrimStateIncome")
	private WebElement State_Income;

	@FindBy(id = "chkScndCombFedStatereturn")
	private WebElement Another_Combined_Federal_State_return_chck;

	@FindBy(id = "ddlScndStatePayerState")
	private WebElement state_Box;

	@FindBy(id = "txtScndStatePayerStateNum")
	private WebElement State_Identification_No_Box;

	@FindBy(id = "txtScndStateTaxWithheld")
	private WebElement StateTax_Withheld_Box;
	
	@FindBy (id = "txtScndStateIncome")
	private WebElement State_Income_Box;
	/////
	
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
	
	//****************************************************  Filer Information 1099 - CAP ****************************************************************************
	
	@FindBy (id = "txtDateofsaleexchange")
	private WebElement Date_of_sale_or_exchange_Box1;
	
	@FindBy (id = "txtaggregateamountrecd")
	private WebElement Aggregate_amount_recd_Box2;
	
	@FindBy (id = "txtnoofsharesexchanged")
	private WebElement No_of_shares_exchanged_Box3;
	
	@FindBy (xpath = "//button[@class='multiselect custom-select text-start']")
	private WebElement Classes_of_stock_exchanged_Box4;
	
	@FindBy (id = "txtdesc")
	private WebElement Form1099CAP_Box5;
	
	//****************************************************  Filer Information 1099 - DIV ****************************************************************************

	@FindBy (id = "txtOrdDividents")
	private WebElement Total_ordinary_dividends_Box1a;
	
	@FindBy (id = "txtQualDividents")
	private WebElement Qualified_dividends_Box1b;
	
	@FindBy (id = "txtDistribution")
	private WebElement Total_capital_gain_distribution_Box2a;
	
	@FindBy (id = "txtSec1250Gain")
	private WebElement Unrecaptured_Section_1250_gain_Box2b;
	
	@FindBy (id = "txtSec1202Gain")
	private WebElement Section_1202_gain_Box2c;
	
	@FindBy (id = "txtCollectibleGain")
	private WebElement Collectibles_28_rate_gain_Box2d;
	
	@FindBy (id = "txtSec897Div")
	private WebElement Section_897_Ordinary_Dividents_Box2e;
	
	@FindBy (id = "txtSec897Gain")
	private WebElement Section_897_Capital_Gains_Box2f;
	
	@FindBy (id = "txtNonDivDist")
	private WebElement Nondividend_distributions_Box3;
	
	@FindBy (id = "txtFederalWithheld")
	private WebElement Federal_income_tax_withheld_Box4;
	
	@FindBy (id = "txtSec199ADividents")
	private WebElement Section_199A_Dividends_Box5;
	
	@FindBy (id = "txtInvestExp")
	private WebElement Investment_expenses_Box6;
	
	@FindBy (id = "txtFrgnTaxPaid")
	private WebElement Foreign_tax_paid_Box7;
	
	@FindBy (id = "txtForeignUSPossession")
	private WebElement Foreign_Country_or_US_Possession_Box8;
	
	@FindBy (id = "txtCashLiqDist")
	private WebElement Cash_liquidation_distributions_Box9;
	
	@FindBy (id = "txtNonCashLiqDist")
	private WebElement Non_Cash_liquidation_distributions_Box10;
	
	@FindBy (id = "txtExemptInterest")
	private WebElement Exempt_interest_dividends_Box12;
	
	@FindBy (id = "txtInterestDiv")
	private WebElement Specified_private_activity_bond_interest_dividents_Box13;
	
	
	//**************************************************  Filer Information 1099 - G *******************************************************************
	
	@FindBy (id = "txtUnemploymentcompensation")
	private WebElement Unemployment_compensation_Box1;

	@FindBy (id = "txtStateorlocaltaxrefunds")
	private WebElement State_or_local_income_tax_refunds_credits_or_offsets_Box2;
	
	@FindBy (id = "ddlAmounttaxyear")
	private WebElement Box2_amount_is_for_tax_year_Box3;
	
	@FindBy (id = "txtRTAApayments")
	private WebElement RTAA_payments_Box5;
	
	@FindBy (id = "txtTaxablegrants")
	private WebElement Taxable_grants_Box6;
	
	@FindBy (id = "txtAgriculturepayments")
	private WebElement Agriculture_payments_Box7;
	
	@FindBy (id = "ColumnsFormDetails_9__BoolValue")
	private WebElement Check_if_box2_is_trade_or_business_income_Box8;
	
	@FindBy (id = "txtMarketgain")
	private WebElement Market_gain_Box9;
	
	//**************************************************  Filer Information 1099 - INT *******************************************************************
	
	@FindBy (id = "txtInterestIncome")
	private WebElement Interest_Income_Box1;
	
	@FindBy (id = "txtWithdrawalPenalties")
	private WebElement Early_Withdrawal_Penality_Box2;
	
	@FindBy (id = "txtInterestUSBonds")
	private WebElement Interest_on_US_Savings_Bonds_and_Treasury_obligations_Box3;
	
	@FindBy (id = "txtInvestmentExpenses")
	private WebElement Investment_Expenses_Box5;
	
	@FindBy (id = "txtForeignTaxPaid")
	private WebElement Foreign_Tax_Paid_Box6;
	
	@FindBy (id = "txtForeignUSPossession")
	private WebElement Foreign_Country_or_US_Possession_Box7_field;
	
	@FindBy (id = "ddlForeignUSPossession")
	private WebElement Foreign_Country_or_US_Possession_Box7_drp;
	
	@FindBy (id = "txtTaxExemptInterest")
	private WebElement Tax_Exempt_Interest_Box8;
	
	@FindBy (id = "txtPrivateActivityBond")
	private WebElement Specified_Private_Activity_Bond_Interest_Box9;
	
	@FindBy (id = "txtMarketDiscount")
	private WebElement Market_Discount_Box10;
	
	@FindBy (id = "txtBondPremium")
	private WebElement Bond_Premium_Box11;
	
	@FindBy (id = "txtBondPremiumOnTreasuryOblgtn")
	private WebElement Bond_Premium_On_Treasury_Obligation_Box12;
	
	@FindBy (id = "txtTaxExeemptBond")
	private WebElement Bond_Premium_On_TaxExempt_Bond_Box13;
	
	@FindBy (id = "txtTaxExemptBondCusipNum")
	private WebElement TaxExempt_and_taxcredit_bond_CUSIPno_Box14;
	
	//**************************************************  Filer Information 1099 - K *******************************************************************
	
	@FindBy (id = "txtGrossAmount")
	private WebElement Gross_Amount_of_PaymentCard_Third_Party_Network_Transactions_Box1a;
	
	@FindBy (id = "txtNoCardTransactions")
	private WebElement Card_Not_Present_Transactions_Box1b;
	
	@FindBy (id = "txtMerchantCtgyCd")
	private WebElement Merchant_Category_Code_Box2;
	
	@FindBy (id = "PaymentSettlementEntity")
	private WebElement Payment_Settlement_Entity_checkbox;
	
	@FindBy (id = "ElectronicPaymentFacilitatorOtherThirdParty")
	private WebElement Electronic_Payment_Facilitator_Other_ThirdParty_checkbox;
	
	@FindBy (id = "txtPSEName")
	private WebElement PSES_Name;
	
	@FindBy (id = "txtPSENumber")
	private WebElement PSES_PhoneNumber;
	
	@FindBy (id = "PaymentCard")
	private WebElement Payment_Card;
	
	@FindBy (id = "ThirdPartyNetwork")
	private WebElement ThirdParty_Network;
	
	@FindBy (id = "txtPymntTransactions")
	private WebElement Number_of_Payment_Transactions_Box3;
	
	@FindBy (id = "txtJan")
	private WebElement January_Box5a;
	
	@FindBy (id = "txtFeb")
	private WebElement February_Box5b;
	
	@FindBy (id = "txtMar")
	private WebElement March_Box5c;
	
	@FindBy (id = "txtApr")
	private WebElement April_Box5d;
	
	@FindBy (id = "txtMay")
	private WebElement May_Box5e;
	
	@FindBy (id = "txtJun")
	private WebElement June_Box5f;
	
	@FindBy (id = "txtJul")
	private WebElement July_Box5g;
	
	@FindBy (id = "txtAug")
	private WebElement August_Box5h;
	
	@FindBy (id = "txtSep")
	private WebElement September_Box5i;
	
	@FindBy (id = "txtOct")
	private WebElement October_Box5j;
	
	@FindBy (id = "txtNov")
	private WebElement November_Box5k;
	
	@FindBy (id = "txtDec")
	private WebElement December_Box5l;
	
	//*************************************************************************  Filer Information 1099 - LS *******************************************************************
	
	@FindBy (id = "txtPolicynumber")
	private WebElement policy_Number;
	
	@FindBy (id = "txtamountpaidpaymentrecipient")
	private WebElement Amount_paid_to_Payment_Recipient_Box1;
	
	@FindBy (id = "txtDateofsale")
	private WebElement Date_of_sale_Box2;
	
	@FindBy (id = "txtIssuerName")
	private WebElement Issuers_name;
	
	@FindBy (id = "txtAcquirerInformation")
	private WebElement Acquirers_information;
	
	//*************************************************************************  Filer Information 1099 - LTC *******************************************************************
	
	@FindBy (id = "txtGrosslongtermcare")
	private WebElement Gross_longterm_care_benefits_paid_Box1;
	
	@FindBy (id = "txtAccelerateddeath")
	private WebElement Accelerated_death_benefits_paid_Box2;
	
	@FindBy (id = "ColumnsFormDetails_4__BoolValue")
	private WebElement Check_one_Perdiem_Box3;
	
	@FindBy (id = "ColumnsFormDetails_6__BoolValue")
	private WebElement Reimbursed_amount_Box3;
	
	@FindBy (id = "ColumnsFormDetails_5__BoolValue")
	private WebElement Qualified_contract_optional_Box4;
	
	@FindBy (id = "ColumnsFormDetails_8__BoolValue")
	private WebElement Check_if_applicable_optional_Chronically_ill_Box5;
	
	@FindBy (id = "ColumnsFormDetails_10__BoolValue")
	private WebElement Terminally_ill_Box5;
	
	@FindBy (id = "txtINSUREDSTIN")
	private WebElement INSURED_TIN;
	
	@FindBy (id = "txtINSUREDSname")
	private WebElement INSUREDS_Name;
	
	@FindBy (id = "txtStreetaddress")
	private WebElement Street_Address;
	
	@FindBy (id = "txtDatecertified")
	private WebElement Date_Certified;
	
	@FindBy (id = "txtCtownscountryzforeign")
	private WebElement City_or_town_state_or_province_country_and_ZIP_or_foreign_PostalCode;
	
	//*************************************************************************  Filer Information 1099 - MISC *******************************************************************
	
	@FindBy (id = "txtRents")
	private WebElement Rents_Box1;
	
	@FindBy (id = "txtRoyalties")
	private WebElement Royalties_Box2;
	
	@FindBy (id = "txtOtherIncome")
	private WebElement Other_Income_Box3;
	
	@FindBy (id = "txtFishingBoatProceeds")
	private WebElement Fishing_Boat_Proceeds_Box5;
	
	@FindBy (id = "txtMedHealthCarePayments")
	private WebElement Medical_Health_Care_Payments_Box6;
	
	@FindBy (id = "ColumnsFormDetails_8__BoolValue")
	private WebElement Payer_made_direct_sales_of_5000_or_more_of_consumer_products_to_a_buyer_recipient_for_resale_Box7;
	
	@FindBy (id = "txtSubPayments")
	private WebElement Substitute_Payments_in_Lieu_of_Dividends_or_Interest_Box8;
	
	@FindBy (id = "txtCropInsProceeds")
	private WebElement Crop_Insurance_Proceeds_Box9;
	
	@FindBy (id = "txtGrossProceeds")
	private WebElement Gross_Proceeds_Paid_to_an_Attorney_Box10;
	
	@FindBy (id = "txtFishPurResale")
	private WebElement Fish_Purchased_For_Resale_Box11;
	
	@FindBy (id = "txtSec409ADef")
	private WebElement Section_409A_Deferrals_Box12;
	
	@FindBy (id = "txtExGoldenPayment")
	private WebElement Excess_Golden_Parachute_Payment_Box14;
	
	@FindBy (id = "txtDefComp")
	private WebElement Nonqualified_deferred_compensation_Box15;
	
	//*************************************************************************  Filer Information 1099 - NEC *******************************************************************
	
	@FindBy (id = "txtNonemployeeComp")
	private WebElement Nonemployee_Compensation_Box1;
	
	@FindBy (id = "ColumnsFormDetails_3__BoolValue")
	private WebElement Payer_made_direct_sales_totaling_5000_or_more_of_consumer_products_to_recipient_for_resale_Box2;
	
	//*************************************************************************  Filer Information 1099 - PATR *******************************************************************
	
	@FindBy (id = "txtPatronagedividends")
	private WebElement Patronage_dividends_Box1;
	
	@FindBy (id = "txtNonpatronagedistributions")
	private WebElement Nonpatronage_distributions_Box2;
	
	@FindBy (id = "txtPerunitretainallocations")
	private WebElement Per_unit_retain_allocations_Box3;
	
	@FindBy (id = "txtRedeemednonqualifiednotices")
	private WebElement Redeemed_nonqualified_notices_Box5;
	
	@FindBy (id = "txtSection199Agdeduction")
	private WebElement Section_199A_g_deduction_Box6;
	
	@FindBy (id = "txtQualifpay")
	private WebElement Qualified_payments_Section_199A_b_7_Box7;
	
	@FindBy (id = "txtSection199Aaqualitems")
	private WebElement Section_199Aa_qual_items_Box8;
	
	@FindBy (id = "txtSection199AaSSTBitems")
	private WebElement Section_199A_a_SSTB_items_Box9;
	
	@FindBy (id = "txtInvestmentcredit")
	private WebElement Investment_credit_Box10;
	
	@FindBy (id = "txtWorkopportunitycredit")
	private WebElement Work_opportunity_credit_Box11;
	
	@FindBy (id = "txtOthercreditsanddeductions")
	private WebElement Other_credits_and_deductions_Box12;
	
	@FindBy (id = "ColumnsFormDetails_14__BoolValue")
	private WebElement Specified_Coop_Box13;
	
	//*****************************************************************  Filer Information 1099 - Q **********************************************************************
	
	@FindBy (id = "txtgrossdistribution")
	private WebElement Gross_distribution_Box1;
	
	@FindBy (id = "txtearnings")
	private WebElement Earnings_Box2;
	
	@FindBy (id = "txtbasis")
	private WebElement Basis_Box3;
	
	@FindBy (id = "ColumnsFormDetails_5__BoolValue")
	private WebElement Trustee_to_trustee_transfer_Box4;
	
	@FindBy (id = "ColumnsFormDetails_8__BoolValue")
	private WebElement Qualified_tuition_program_Box5_Private;
	
	@FindBy (id = "ColumnsFormDetails_9__BoolValue")
	private WebElement Qualified_tuition_program_Box5_State;
	
	@FindBy (id = "ColumnsFormDetails_10__BoolValue")
	private WebElement Qualified_tuition_program_Box5_CoverdellESA;
	
	@FindBy (id = "ColumnsFormDetails_12__BoolValue")
	private WebElement Check_if_the_recipient_is_not_the_designated_beneficiary_Box6;
	
	@FindBy (id = "txttaxbenefitsforeducation")
	private WebElement fair_market_value_FMV;
	
	//*****************************************************************  Filer Information 1099 - R ***********************************************************************
	
	@FindBy (id = "txtGrossDistribution")
	private WebElement GrossDistribution_Box1;
	
	@FindBy (id = "txtTaxableAmount")
	private WebElement Taxable_amount_Box2a;
	
	@FindBy (id = "ColumnsFormDetails_4__BoolValue")
	private WebElement Taxable_amount_not_determined_Box2b;
	
	@FindBy (id = "ColumnsFormDetails_5__BoolValue")
	private WebElement Total_distribution;
	
	@FindBy (id = "txtCapitalGain")
	private WebElement Capital_gain_Box3;
	
	@FindBy (id = "txtEmployeeContributions")
	private WebElement Employee_contributions_Designated_Roth_contributions_or_insurance_premiums_Box5;
	
	@FindBy (id = "txtNetAppreciation")
	private WebElement Net_unrealized_appreciation_in_employers_securities_Box6;
	
	@FindBy (id = "ddlDistributionCodes")
	private WebElement Distribution_codes_Box7;
	
	@FindBy (id = "ColumnsFormDetails_11__BoolValue")
	private WebElement IRA_SEP_SIMPLE;
	
	@FindBy (id = "txtOther")
	private WebElement Other_Box8;
	
	@FindBy (id = "txtOtherPercentage")
	private WebElement Other_Box8_percentage;
	
	@FindBy (id = "txtTotalDistributionPercentage")
	private WebElement Your_percentage_of_total_distribution_Box9a;
	
	@FindBy (id = "txtTotalEmployeeContributions")
	private WebElement Total_employee_contributions_Box9b;
	
	@FindBy (id = "txtIRRAmount")
	private WebElement Amount_allocable_to_IRR_within_5years_Box10;
	
	@FindBy (id = "txtFstYrRothContrib")
	private WebElement _1st_year_of_desig_Roth_contrib_Box11;
	
	@FindBy (id = "ColumnsFormDetails_18__BoolValue")
	private WebElement Do_you_have_a_FATCA_Filing_Requirement_Box12;
	
	@FindBy (id = "txtPaymentDate")
	private WebElement Date_of_payment_Box13;
	
	@FindBy (id = "txtPrimStateDistribution")
	private WebElement State_distribution_Box16;
	
	@FindBy (id = "txtPrimLocalTaxWithheld")
	private WebElement Local_Tax_Withheld_Box17;
	
	@FindBy (id = "txtPrimLocalityName")
	private WebElement Name_of_locality_Box18;
	
	@FindBy (id = "txtPrimLocalDistribution")
	private WebElement Local_distribution_Box19;
	
	@FindBy (id = "txtScndStateDistribution")
	private WebElement State_distribution_Box16a;
	
	@FindBy (id = "txtScndLocalTaxWithheld")
	private WebElement Local_Tax_Withheld_Box17a;
	
	@FindBy (id = "txtScndLocalityName")
	private WebElement Name_of_locality_Box18a;
	
	@FindBy (id = "txtScndLocalDistribution")
	private WebElement Local_distribution_Box19a;
	
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
			
			if (form == "OID" || form == "B" || form == "G" || form == "INT" || form == "K" || form == "NEC") {
				
				secondTIN_chck.click();
				
				if (form == "OID" || form == "B" || form == "INT") {
					
					FATCA_chck.click();
				}
				
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

			if (form == "OID" || form == "B" || form == "G" || form == "INT" || form == "K" || form == "NEC") {
				
				js.executeScript("arguments[0].click();", secondTIN_chck);
				
				if (form == "OID" || form == "B" || form == "INT") {
					
					FATCA_chck.click();
				}
				
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
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_box12);
		State_Identification_No.sendKeys(_box13);
		StateTax_Withheld.sendKeys(_box14);

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
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_box14);
		State_Identification_No.sendKeys(_box15);
		StateTax_Withheld.sendKeys(_box16);

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

	public void Form_1099_CAP_FilerInformation(String _accountNo, String _officecode, String _year, String _month, String _date, 
			String _box2, String _box3, String _box4) {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Date_of_sale_or_exchange_Box1.click();
		
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
		
		Aggregate_amount_recd_Box2.sendKeys(_box2);
		No_of_shares_exchanged_Box3.sendKeys(_box3);
		
		//Select the classes of stock exchanged options
		Classes_of_stock_exchanged_Box4.click();
		
		//Check the popup box visibility
		WebElement optionBox = driver.findElement(By.xpath("//div[@class='multiselect-container dropdown-menu dropdown-m-menu show']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(optionBox));
		
		//Get the all label Names
		List<WebElement> optionsLabel = driver.findElements(By.xpath("//div[@class='multiselect-container dropdown-menu dropdown-m-menu show'] //span/label"));
		
		//Get the all the check boxes count
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='multiselect-container dropdown-menu dropdown-m-menu show'] //span/input"));
		
		for (int i = 0; i < optionsLabel.size(); i++) {
			
			if (optionsLabel.get(i).getText().equalsIgnoreCase(_box4)) {
				
				checkboxes.get(i).click();
				Classes_of_stock_exchanged_Box4.click();
				break;
				
			}	
			
		}
		
		//Form1099CAP_Box5.sendKeys(_box5);
		saveButton.click();
		
	}

	public void Form_1099_DIV_FilerInformation(String _accountNo, String _officecode, String _box1a, 
			String _box1b, String _box2a, String _box2b, String _box2c, String _box2d, String _box2e, 
			String _box2f, String _box3, String _box4, String _box5, String _box6, 
			String _box7, String _box8, String _box9, String _box10, String _box12, String _box13, 
			String _box14, String _box15, String _box16, String _box14a, String _box15a, String _box16a) throws InterruptedException {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Total_ordinary_dividends_Box1a.sendKeys(_box1a);
		Qualified_dividends_Box1b.sendKeys(_box1b);
		Total_capital_gain_distribution_Box2a.sendKeys(_box2a);
		Unrecaptured_Section_1250_gain_Box2b.sendKeys(_box2b);
		Section_1202_gain_Box2c.sendKeys(_box2c);
		Collectibles_28_rate_gain_Box2d.sendKeys(_box2d);
		Section_897_Ordinary_Dividents_Box2e.sendKeys(_box2e);
		Section_897_Capital_Gains_Box2f.sendKeys(_box2f);
		Nondividend_distributions_Box3.sendKeys(_box3);
		Federal_income_tax_withheld_Box4.sendKeys(_box4);
		Section_199A_Dividends_Box5.sendKeys(_box5);
		Investment_expenses_Box6.sendKeys(_box6);
		Foreign_tax_paid_Box7.sendKeys(_box7);
		Foreign_Country_or_US_Possession_Box8.sendKeys(_box8);
		Cash_liquidation_distributions_Box9.sendKeys(_box9);
		Non_Cash_liquidation_distributions_Box10.sendKeys(_box10);
		Exempt_interest_dividends_Box12.sendKeys(_box12);
		Specified_private_activity_bond_interest_dividents_Box13.sendKeys(_box13);
		
		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_box14);
		State_Identification_No.sendKeys(_box15);
		StateTax_Withheld.sendKeys(_box16);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_box14a);
		State_Identification_No_Box.sendKeys(_box15a);
		StateTax_Withheld_Box.sendKeys(_box16a);
		
		saveButton.click();
		
	}

	public void Form_1099_G_FilerInformation(String _accountNo, String _officecode, String _box1, String _box2, String _box3, String _box4,
			String _box5, String _box6, String _box7, String _box9, String _box10a, String _box10b, String _box11,
			String _box10aa, String _box10bb, String _box11a) throws InterruptedException {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Unemployment_compensation_Box1.sendKeys(_box1);
		State_or_local_income_tax_refunds_credits_or_offsets_Box2.sendKeys(_box2);
		
		dropdown = new Select(Box2_amount_is_for_tax_year_Box3);
		dropdown.selectByVisibleText(_box3);
		
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
		RTAA_payments_Box5.sendKeys(_box5);
		Taxable_grants_Box6.sendKeys(_box6);
		Agriculture_payments_Box7.sendKeys(_box7);
		Check_if_box2_is_trade_or_business_income_Box8.click();
		Market_gain_Box9.sendKeys(_box9);
		
		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_box10a);
		State_Identification_No.sendKeys(_box10b);
		StateTax_Withheld.sendKeys(_box11);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_box10aa);
		State_Identification_No_Box.sendKeys(_box10bb);
		StateTax_Withheld_Box.sendKeys(_box11a);
		
		saveButton.click();
		
	}

	public void Form_1099_INT_FilerInformation(String _accountNo, String _officecode, String _box1, String _box2, String _box3, String _box4,
			String _box5, String _box6, String _box7, String _box8, String _box9, String _box10, String _box11, String _box12, String _box13,
			String _box14, String _box15, String _box16, String _box17, String _box15a, String _box16a, String _box17a) throws InterruptedException {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Interest_Income_Box1.sendKeys(_box1);
		Early_Withdrawal_Penality_Box2.sendKeys(_box2);
		Interest_on_US_Savings_Bonds_and_Treasury_obligations_Box3.sendKeys(_box3);
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
		Investment_Expenses_Box5.sendKeys(_box5);
		Foreign_Tax_Paid_Box6.sendKeys(_box6);
		
		wait.until(ExpectedConditions.elementToBeClickable(Foreign_Country_or_US_Possession_Box7_field)).click();
		dropdown = new Select(Foreign_Country_or_US_Possession_Box7_drp);
		dropdown.selectByVisibleText(_box7);
		
		Tax_Exempt_Interest_Box8.sendKeys(_box8);
		Specified_Private_Activity_Bond_Interest_Box9.sendKeys(_box9);
		Market_Discount_Box10.sendKeys(_box10);
		Bond_Premium_Box11.sendKeys(_box11);
		Bond_Premium_On_Treasury_Obligation_Box12.sendKeys(_box12);
		Bond_Premium_On_TaxExempt_Bond_Box13.sendKeys(_box13);
		TaxExempt_and_taxcredit_bond_CUSIPno_Box14.sendKeys(_box14);
		
		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_box15);
		State_Identification_No.sendKeys(_box16);
		StateTax_Withheld.sendKeys(_box17);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_box15a);
		State_Identification_No_Box.sendKeys(_box16a);
		StateTax_Withheld_Box.sendKeys(_box17a);
		
		saveButton.click();
		
	}

	public void Form_1099_K_FilerInformation(String _accountNo, String _officecode, String _box1b, String _box2,
			String filertype, String _PSESName, String _PSESPhoneNumber, String select_transactionsReportedType, String _box3, String _box4,
			String _box5a, String _box5b, String _box5c, String _box5d, String _box5e, String _box5f,
			String _box5g, String _box5h, String _box5i, String _box5j, String _box5k, String _box5l, String _box6, String _box7, String _box8, String _box6a, String _box7a, String _box8a) throws InterruptedException {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Card_Not_Present_Transactions_Box1b.sendKeys(_box1b);
		Merchant_Category_Code_Box2.sendKeys(_box2);
		
		//Select the Type Either Payment Settlement Entity or Electronic Payment Facilitator /Other Third Party
		if (filertype == "Electronic Payment Facilitator/Other Third Party") {
			
			Electronic_Payment_Facilitator_Other_ThirdParty_checkbox.click();
			wait.until(ExpectedConditions.visibilityOf(PSES_Name)).sendKeys(_PSESName);
			wait.until(ExpectedConditions.visibilityOf(PSES_PhoneNumber)).sendKeys(_PSESPhoneNumber);
			
		}
		else {
			
			wait.until(ExpectedConditions.visibilityOf(Payment_Settlement_Entity_checkbox)).click();
			
		}	
		
		//Select the Type Either Payment Card or Third Party Network
		if (select_transactionsReportedType == "Payment Card") {
			
			wait.until(ExpectedConditions.visibilityOf(Payment_Card)).click();
			
		}
		else if (select_transactionsReportedType == "Third Party Network") {
			
			wait.until(ExpectedConditions.visibilityOf(ThirdParty_Network)).click();
			
		}
		
		Number_of_Payment_Transactions_Box3.sendKeys(_box3);
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
		January_Box5a.sendKeys(_box5a);
		February_Box5b.sendKeys(_box5b);
		March_Box5c.sendKeys(_box5c);
		April_Box5d.sendKeys(_box5d);
		May_Box5e.sendKeys(_box5e);
		June_Box5f.sendKeys(_box5f);
		July_Box5g.sendKeys(_box5g);
		August_Box5h.sendKeys(_box5h);
		September_Box5i.sendKeys(_box5i);
		October_Box5j.sendKeys(_box5j);
		November_Box5k.sendKeys(_box5k);
		December_Box5l.sendKeys(_box5l);
		
		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_box6);
		State_Identification_No.sendKeys(_box7);
		StateTax_Withheld.sendKeys(_box8);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_box6a);
		State_Identification_No_Box.sendKeys(_box7a);
		StateTax_Withheld_Box.sendKeys(_box8a);
		
		saveButton.click();
		
	}

	public void Form_1099_LS_FilerInformation(String _policyNo, String _box1, String _year, String _month, String _date,
			String _issuersName, String _acquirersInformation) {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		policy_Number.sendKeys(_policyNo);
		Amount_paid_to_Payment_Recipient_Box1.sendKeys(_box1);
		
		Date_of_sale_Box2.click();
		
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
		
		Issuers_name.sendKeys(_issuersName);
		Acquirers_information.sendKeys(_acquirersInformation);
		
		saveButton.click();
		
	}

	public void Form_1099_LTC_FilerInformation(String _accountNo, String _officecode, String _box1, String _box2,
			String _InsuredsTin, String _InsuredsName, String _streetAddress, String _year, String _month, String _date) {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Gross_longterm_care_benefits_paid_Box1.sendKeys(_box1);
		Accelerated_death_benefits_paid_Box2.sendKeys(_box2);
		Check_one_Perdiem_Box3.click();
		Qualified_contract_optional_Box4.click();
		Terminally_ill_Box5.click();
		INSURED_TIN.sendKeys(_InsuredsTin);
		INSUREDS_Name.sendKeys(_InsuredsName);
		Street_Address.sendKeys(_streetAddress);
		
		Date_Certified.click();
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
		
		saveButton.click();
		
	}

	public void Form_1099_MISC_FilerInformation(String _accountNo, String _officecode, String _box1, String _box2,
			String _box3, String _box4, String _box5, String _box6, String _box8, String _box9, String _box10, 
			String _box11, String _box12, String _box14, String _box15, String _state, String _statePayersNumn, 
			String _stateTaxWitheld, String _stateIncome, String _state_1, String _statePayersNumn_1, 
			String _stateTaxWitheld_1, String _stateIncome_1) throws InterruptedException {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		Rents_Box1.sendKeys(_box1);
		Royalties_Box2.sendKeys(_box2);
		Other_Income_Box3.sendKeys(_box3);
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
		Fishing_Boat_Proceeds_Box5.sendKeys(_box5);
		Medical_Health_Care_Payments_Box6.sendKeys(_box6);
		Payer_made_direct_sales_of_5000_or_more_of_consumer_products_to_a_buyer_recipient_for_resale_Box7.click();
		Substitute_Payments_in_Lieu_of_Dividends_or_Interest_Box8.sendKeys(_box8);
		Crop_Insurance_Proceeds_Box9.sendKeys(_box9);
		Gross_Proceeds_Paid_to_an_Attorney_Box10.sendKeys(_box10);
		Fish_Purchased_For_Resale_Box11.sendKeys(_box11);
		Section_409A_Deferrals_Box12.sendKeys(_box12);
		Excess_Golden_Parachute_Payment_Box14.sendKeys(_box14);
		Nonqualified_deferred_compensation_Box15.sendKeys(_box15);
		
		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		StateTax_Withheld.sendKeys(_stateTaxWitheld);
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_state);
		State_Identification_No.sendKeys(_statePayersNumn);
		State_Income.sendKeys(_stateIncome);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		StateTax_Withheld_Box.sendKeys(_stateTaxWitheld_1);
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_state_1);
		State_Identification_No_Box.sendKeys(_statePayersNumn_1);
		State_Income_Box.sendKeys(_stateIncome_1);
		
		saveButton.click();
		
	}

	public void Form_1099_NEC_FilerInformation(String _accountNo, String _officecode, String _box1, String _box4,
			 String _state, String _statePayersNumn, String _stateTaxWitheld, String _stateIncome, String _state_1, String _statePayersNumn_1, 
				String _stateTaxWitheld_1, String _stateIncome_1) throws InterruptedException {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Nonemployee_Compensation_Box1.sendKeys(_box1);
		Payer_made_direct_sales_totaling_5000_or_more_of_consumer_products_to_recipient_for_resale_Box2.click();
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
		
		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		StateTax_Withheld.sendKeys(_stateTaxWitheld);
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_state);
		State_Identification_No.sendKeys(_statePayersNumn);
		State_Income.sendKeys(_stateIncome);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		StateTax_Withheld_Box.sendKeys(_stateTaxWitheld_1);
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_state_1);
		State_Identification_No_Box.sendKeys(_statePayersNumn_1);
		State_Income_Box.sendKeys(_stateIncome_1);
		
		saveButton.click();
		
	}

	public void Form_1099_PATR_FilerInformation(String _accountNo, String _officecode, String _box1, String _box2,
			String _box3, String _box4, String _box5, String _box6, String _box7, String _box8, String _box9, String _box10,
			String _box11, String _box12) {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Patronage_dividends_Box1.sendKeys(_box1);
		Nonpatronage_distributions_Box2.sendKeys(_box2);
		Per_unit_retain_allocations_Box3.sendKeys(_box3);
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
		Redeemed_nonqualified_notices_Box5.sendKeys(_box5);
		Section_199A_g_deduction_Box6.sendKeys(_box6);
		Qualified_payments_Section_199A_b_7_Box7.sendKeys(_box7);
		Section_199Aa_qual_items_Box8.sendKeys(_box8);
		Section_199A_a_SSTB_items_Box9.sendKeys(_box9);
		Investment_credit_Box10.sendKeys(_box10);
		Work_opportunity_credit_Box11.sendKeys(_box11);
		Other_credits_and_deductions_Box12.sendKeys(_box12);
		Specified_Coop_Box13.click();
		
		saveButton.click();
		
	}

	public void Form_1099_Q_FilerInformation(String _accountNo, String _officecode, String _box1, String _box2,
			String _box3, String _FMV) {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		Gross_distribution_Box1.sendKeys(_box1);
		Earnings_Box2.sendKeys(_box2);
		Basis_Box3.sendKeys(_box3);
		Trustee_to_trustee_transfer_Box4.click();
		Qualified_tuition_program_Box5_Private.click();
		Check_if_the_recipient_is_not_the_designated_beneficiary_Box6.click();
		fair_market_value_FMV.sendKeys(_FMV);
		
		saveButton.click();
		
	}

	public void Form_1099_R_FilerInformation(String _accountNo, String _officecode, String _box1, String _box2a,
			String _box3, String _box4, String _box5, String _box6, String _box7, String _box8, String _box8_per, 
			String _box9a, String _box9b, String _box10, String _box11, String _year, String _month, String _date, 
			String _stateTaxWitheld, String _state, String _statePayersNumn, String _box16, String _box17, String _box18, 
			String _box19, String _stateTaxWitheld_1, String _state_1, String _statePayersNumn_1, String _box16a, 
			String _box17a, String _box18a, String _box19a) throws InterruptedException {
		
		// Scroll Down to Label Name
		js.executeScript("arguments[0].scrollIntoView(true);", FilerInfoLabelName);

		accountNo.sendKeys(_accountNo);
		officeCode.sendKeys(_officecode);
		
		GrossDistribution_Box1.sendKeys(_box1);
		Taxable_amount_Box2a.sendKeys(_box2a);
		Taxable_amount_not_determined_Box2b.click();
		Total_distribution.click();
		Capital_gain_Box3.sendKeys(_box3);
		Federal_Income_Tax_Withheld_Box4.sendKeys(_box4);
		Employee_contributions_Designated_Roth_contributions_or_insurance_premiums_Box5.sendKeys(_box5);
		Net_unrealized_appreciation_in_employers_securities_Box6.sendKeys(_box6);
		
		dropdown = new Select(Distribution_codes_Box7);
		dropdown.selectByVisibleText(_box7);
		IRA_SEP_SIMPLE.click();
		Other_Box8.sendKeys(_box8);
		Other_Box8_percentage.sendKeys(_box8_per);
		Your_percentage_of_total_distribution_Box9a.sendKeys(_box9a);
		Total_employee_contributions_Box9b.sendKeys(_box9b);
		Amount_allocable_to_IRR_within_5years_Box10.sendKeys(_box10);
		_1st_year_of_desig_Roth_contrib_Box11.sendKeys(_box11);
		Do_you_have_a_FATCA_Filing_Requirement_Box12.click();
		
		Date_of_payment_Box13.click();
		
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
			
		Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		StateTax_Withheld.sendKeys(_stateTaxWitheld);
		dropdown = new Select(State);
		dropdown.selectByVisibleText(_state);
		State_Identification_No.sendKeys(_statePayersNumn);
		State_distribution_Box16.sendKeys(_box16);
		Local_Tax_Withheld_Box17.sendKeys(_box17);
		Name_of_locality_Box18.sendKeys(_box18);
		Local_distribution_Box19.sendKeys(_box19);

		Another_Combined_Federal_State_return_chck.click();
		Thread.sleep(1000);
		StateTax_Withheld_Box.sendKeys(_stateTaxWitheld_1);
		dropdown = new Select(state_Box);
		dropdown.selectByVisibleText(_state_1);
		State_Identification_No_Box.sendKeys(_statePayersNumn_1);
		State_distribution_Box16a.sendKeys(_box16a);
		Local_Tax_Withheld_Box17a.sendKeys(_box17a);
		Name_of_locality_Box18a.sendKeys(_box18a);
		Local_distribution_Box19a.sendKeys(_box19a);

		saveButton.click();
		
		
	}

}
