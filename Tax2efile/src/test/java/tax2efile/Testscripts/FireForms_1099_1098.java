package tax2efile.Testscripts;

import org.testng.annotations.*;

import tax2efile.Base.BaseProperties;
import tax2efile.Pages.DashboardPage;
import tax2efile.Pages.FilingFeePage;
import tax2efile.Pages.FireForm1099_ServicesPage;
import tax2efile.Pages.FireForms_PayerListPage;
import tax2efile.Pages.FireForms_RecipientListPage;
import tax2efile.Pages.LoginPage;
import tax2efile.Pages.OrderConfirmationPage;
import tax2efile.Pages.ReviewPage;
import tax2efile.Utilities.RunLevel;

public class FireForms_1099_1098 extends BaseProperties {

	String ProfileName = "Arunachela eswaran S";

	@Test
	public void Form_1099A() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-A", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "A", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_A_FilerInformation("qpD0wByXxS", "RT12", "2025", "Aug", "14",
				"200", "400", "Description of Box 6");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099B() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-B", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "B", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_B_FilerInformation("qpD0wByXxS", "RT12",
				"A - Short-term transactions reported on forms 1099B showing basis was reported to IRS", "635365383",
				"Description of property (Example: 1Abc&)", "2025", "Aug", "14", "100", "101", "102", "103",
				"Short-term", "24", "800", "900", "1000", "1100", "1300", "Arkansas", "123456789012345", "222", "Maine",
				"543210987654321", "333");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099C() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-C", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "C", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_C_FilerInformation("qpD0wByXxS", "RT12", "2025", "Aug", "14",
				"200", "300", "400", "C", "700");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099CAP() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-CAP", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "CAP", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_CAP_FilerInformation("qpD0wByXxS", "RT12", "2025", "Aug", "14",
				"200", "300", "Select all");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099DIV() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-DIV", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "DIV", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_DIV_FilerInformation("qpD0wByXxS", "RT12", "10011", "100", "200",
				"201", "202", "203", "204", "205", "1300", "400", "500", "600", "700", "1008 W MAIN ST6", "900", "1000",
				"1200", "1300", "Arkansas", "123456789012345", "222", "Maine", "543210987654321", "333");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}
	}

	@Test
	public void Form_1099G() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-G", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "G", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_G_FilerInformation("qpD0wByXxS", "RT12", "100", "200", "2022",
				"400", "500", "600", "700", "900", "Arkansas", "123456789012345", "222", "Maine", "543210987654321",
				"333");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099INT() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-INT", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "INT", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_INT_FilerInformation("qpD0wByXxS", "RT12", "100", "200", "300",
				"360.24", "500", "600", "Albania", "901", "900", "1000", "1100", "1200", "1300", "CU1234567",
				"Arkansas", "123456789012345", "222", "Maine", "543210987654321", "333");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099K() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-K", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "K", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_K_FilerInformation("qpD0wByXxS", "RT12", "101", "2005",
				"Electronic Payment Facilitator/Other Third Party", "Arunachelam", "9876543210", "Third Party Network",
				"300", "18.72", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "Arkansas",
				"123456789012345", "222", "Maine", "543210987654321", "333");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099LS() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-LS", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "LS", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_LS_FilerInformation("12345678901234567890", "100", "2025", "Aug",
				"14", "Yt user", "1008 W MAIN ST -2025");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099LTC() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-LTC", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "LTC", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_LTC_FilerInformation("DRgVnJVWJV", "RT24", "100", "200",
				"123456789", "Arunachelam", "1008 W MAIN ST", "2025", "Aug", "14");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099MISC() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-MISC", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "MISC", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_MISC_FilerInformation("DRgVnJVWJV", "RT24", "100", "200", "300",
				"400", "500", "600", "800", "900", "1000", "1100", "1200", "1400", "1500", "California", "123456789",
				"160", "222", "Maine", "987654321", "161", "333");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099NEC() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-NEC", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "NEC", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_NEC_FilerInformation("DRgVnJVWJV", "RT24", "100", "24",
				"California", "123456789", "160", "222", "Maine", "987654321", "161", "333");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099OID() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-OID", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "OID", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_OID_FilerInformation("nbTqXSKaCe", "1234", "100", "200", "300",
				"400", "500", "600", "Description Box 7", "800", "900", "1000", "1100", "Arkansas", "123456789012345",
				"222", "Maine", "543210987654321", "333");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099PATR() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-PATR", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "PATR", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_PATR_FilerInformation("DRgVnJVWJV", "RT24", "100", "200", "32",
				"199.68", "500", "600", "700", "800", "900", "1000", "1100", "1200");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099Q() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-Q", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "Q", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_Q_FilerInformation("DRgVnJVWJV", "RT24", "100", "200", "300",
				"1723 GOSNELL RD");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

	@Test
	public void Form_1099R() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.FillUserCredentials("arunachelaeswarans@yakshnatechnologies.in",
				"Test@123");

		FireForm1099_ServicesPage _1099ServicePage = dashboardPage.Click_FORM1099();

		FireForms_PayerListPage payerListPage = _1099ServicePage.StartE_filing("Form 1099-R", "2024");

		payerListPage.click_AddPayerInfoButton();

		payerListPage.PayerInfoPage.ProvidePayerInformation("Corporation", ProfileName, "123456789");

		payerListPage = payerListPage.PayerInfoPage.ProvidePayerAddressInformation("Within U.S", "1008 W MAIN ST",
				"SALEM", "null", "Virginia", "24153", "8823792231");

		FireForms_RecipientListPage recipientListPage = payerListPage.SelectProfileAndStartE_Filing();

		recipientListPage.AddRecipient().RecipientInfoPage.RecipientInformation("EIN", "R", "123456789", ProfileName,
				"arunachelam@gmail.com", "arunachelam@gmail.com");

		recipientListPage.RecipientInfoPage.RecipientAddressInformation("Outside U.S", "1723 GOSNELL RD", "VIENNA",
				"Virginia", "Colombia", "VA34556");

		recipientListPage.RecipientInfoPage.Form_1099_R_FilerInformation("DRgVnJVWJV", "RT24", "100", "99", "98",
				"190.80", "500", "97", "1K", "800", "5", "6", "900", "1000", "1999", "2025", "Aug", "14", "423164",
				"California", "486466449", "496", "4949", "1723 GOSNELL RD", "4994", "784", "Colorado", "648378433",
				"154", "494", "1723 GOSNELL RD", "79697676");

		ReviewPage reviewPage = recipientListPage.SelectRecipientsAndStartFiling();

		FilingFeePage filingFeePage = reviewPage.ClickSaveButton();

		// With Skip Payment Flow
		if (runLevel == RunLevel.REVIEW) {

			filingFeePage.ContinueWithoutPayment();

		}

		// Without Skip Payment Flow
		else if (runLevel == RunLevel.FILINGFEE) {

			filingFeePage.PMSDetails()
					.CreditCardInfo("YT Tech", "American Express", "1234567890123456", "Jan", "2034", "2353")
					.BillingInfo("YT User");

			OrderConfirmationPage orderconfirmPage = filingFeePage.ClickPayNow();

			orderconfirmPage.CheckOrderIsConfirmed();
		}

	}

}
