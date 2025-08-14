package tax2efile.Pages;

import tax2efile.Base.PageProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageProperties {

	public LoginPage(WebDriver Driver) {
		super(Driver);
	}

	@FindBy(id = "LoginEmail")
	private WebElement username;

	@FindBy(id = "LoginPassword")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement loginbutton;

	@FindBy(xpath = "//a[contains(@href,'https://testaccount.tax2efile.com/Account/PasswordRecovery')]")
	private WebElement forgotPasswordLinkText;

	@FindBy(xpath = "(//a[contains(@href,'https://testaccount.tax2efile.com/Account/Registration/')])[2]")
	private WebElement registerButton;

	public DashboardPage FillUserCredentials(String name, String pass) {

		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(name);
		password.sendKeys(pass);
		loginbutton.click();
		return new DashboardPage(driver);
	}

}
