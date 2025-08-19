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

		System.out.println("Form 1099 A is Process");

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

}
