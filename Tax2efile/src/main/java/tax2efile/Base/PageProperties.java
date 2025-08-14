package tax2efile.Base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tax2efile.Pages.FireForms_PayerInformationPage;

public class PageProperties {

	protected WebDriver driver;

	protected WebDriverWait wait;

	protected Select dropdown;
	
	protected JavascriptExecutor js;

	public PageProperties(WebDriver _driver) {

		this.driver = _driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		js = (JavascriptExecutor)driver;
	}

}
