package tax2efile.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseProperties {

	protected WebDriver driver;

	@BeforeMethod
	public void SetupBrowser() {
		
		driver = DriverFactory.getDriver("Chrome");
	}

	@AfterMethod
	public void TearDown() {
		
		DriverFactory.quitDriver();
	}

}
