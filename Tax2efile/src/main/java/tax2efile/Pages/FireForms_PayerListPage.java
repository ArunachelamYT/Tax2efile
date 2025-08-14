package tax2efile.Pages;

import tax2efile.Base.PageProperties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FireForms_PayerListPage extends PageProperties {

	public FireForms_PayerInformationPage PayerInfoPage;

	public FireForms_PayerListPage(WebDriver Driver) {
		super(Driver);
		PayerInfoPage = new FireForms_PayerInformationPage(Driver);
	}

	@FindBy(id = "btnaddlist")
	private WebElement add_payerinfo_button;

	public void click_AddPayerInfoButton() {

		add_payerinfo_button.click();
	}

	public FireForms_RecipientListPage SelectProfileAndStartFiling() throws InterruptedException {

		String fname = FireForms_PayerInformationPage.fname;
		String lname = FireForms_PayerInformationPage.lname;
		String bname = FireForms_PayerInformationPage.businessName;

		// Check the Profile Name in list: [Arunachela eswaran S] and click Start
		// E-Filing
		List<WebElement> profileNameList;
		List<WebElement> Start_Filling;

		int profileNameMatched = 0;
		boolean foundprofileName = false;
		do {

			Thread.sleep(1000);

			profileNameList = driver
					.findElements(By.cssSelector("#myTable tbody tr[style *='display: table-row'] td:nth-child(3)"));

			for (int i = 0; i < profileNameList.size(); i++) {

				String trimmedText = profileNameList.get(i).getText().trim();

				if (trimmedText.contains(fname + " " + lname)) {
					profileNameMatched = 1;
					Start_Filling = driver.findElements(By.xpath(
							"//table[@id='myTable'] //tbody //tr[@style='display: table-row;']/td[1]/a[@id='btnstartFiling']"));
					Start_Filling.get(i).click();
					foundprofileName = true;
					break;
				} 
				else if (trimmedText.contains(bname)) {

					profileNameMatched = 1;
					Start_Filling = driver.findElements(By.xpath(
							"//table[@id='myTable'] //tbody //tr[@style='display: table-row;']/td[1]/a[@id='btnstartFiling']"));
					Start_Filling.get(i).click();
					foundprofileName = true;
					break;

				}
			}

			if (foundprofileName) {

				break;
			}

			driver.findElement(By.xpath("//ul[@id='pagination2']/li[@class='footable-page-arrow'][2]")).click();

		} while (profileNameMatched < 1);

		return new FireForms_RecipientListPage(driver);

	}

}
