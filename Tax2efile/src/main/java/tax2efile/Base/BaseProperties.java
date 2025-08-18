package tax2efile.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import tax2efile.Utilities.RunLevel;

public class BaseProperties {

	protected WebDriver driver;
	
	protected RunLevel runLevel;

	@BeforeMethod
	@Parameters("runLevel")
	public void SetupBrowser(@Optional("FILINGFEE") String RunLevelParam) { //REVIEW || FILINGFEE
		
		this.runLevel = RunLevel.valueOf(RunLevelParam.toUpperCase());
		driver = DriverFactory.getDriver("Chrome");
		
	}

	@AfterMethod
	public void TearDown() {
		
		DriverFactory.quitDriver();
	}

}
