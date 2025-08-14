package tax2efile.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tax2efile.Base.PageProperties;

public class DashboardPage extends PageProperties {

	public DashboardPage(WebDriver Driver) {
		super(Driver);
	}

	@FindBy(xpath = "//img[@alt='Form 1099']")
	private WebElement FM1099;

	public FireForm1099_ServicesPage Click_FORM1099() {
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//h3[text()='Welcome to your Dashboard!']"))));
		FM1099.click();
		return new FireForm1099_ServicesPage(driver);
	}

}
