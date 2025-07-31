package tax2efile.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tax2efile.Base.PageProperties;

public class FireForms_RecipientListPage extends PageProperties{
	
	public FireForms_RecipientInformationPage RecipientInfoPage;

	public FireForms_RecipientListPage(WebDriver _driver) {
		
		super(_driver);
		RecipientInfoPage = new FireForms_RecipientInformationPage(driver);
	}
	
	@FindBy(id = "btnaddList")
	private WebElement addRecipientBtn;
	
	@FindBy(id = "btnEfilefiling")
	private WebElement efileBtn;
	
	
	public FireForms_RecipientListPage AddRecipient() {
		
		
		addRecipientBtn.click();
		
		return this;
		
	}


	public ReviewPage SelectRecipientsAndStartFiling() throws InterruptedException {
		
		String fname = FireForms_RecipientInformationPage.fname;
		String lname = FireForms_RecipientInformationPage.lname;
		
		List<WebElement> recipientNameList;
		List<WebElement> Select_Recipient_Checkbox;

		int recipientNameMatched = 0;
		boolean foundrecipientName = false;
		do {

			Thread.sleep(1000);

			recipientNameList = driver
					.findElements(By.cssSelector("#myTable tbody tr[style='display: table-row;'] td:nth-child(3)"));

			for (int i = 0; i < recipientNameList.size(); i++) {

				String trimmedText = recipientNameList.get(i).getText().trim();

				if (trimmedText.contains(fname + " " + lname)) {
					recipientNameMatched = 1;
					Select_Recipient_Checkbox = driver.findElements(By.xpath(
							"//table[@id='myTable'] //tbody //tr[@style='display: table-row;']/td[1]/input[@id='selectedRecipients']"));
					Select_Recipient_Checkbox.get(i).click();
					foundrecipientName = true;
					break;
				}
			}

			if (foundrecipientName) {

				break;
			}

			driver.findElement(By.xpath("//ul[@id='pagination2']/li[@class='footable-page-arrow'][2]")).click();

		} while (recipientNameMatched < 1);
		
		efileBtn.click();
		
		return new ReviewPage(driver);
		
	}
	
	
	
	

}
