package tax2efile.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public static ThreadLocal<WebDriver> driver =  new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver(String browser) {
		WebDriver dr;
		
		if(driver.get() == null) {
			
			switch (browser) {
			
			case "Chrome":
				dr = new ChromeDriver(); // Initialize driver if not already done
				dr.manage().window().maximize();
				driver.set(dr);
				break;
				
			case "Edge":
				dr = new EdgeDriver(); // Initialize driver if not already done
				dr.manage().window().maximize();
				driver.set(dr);
				break;
				
			case "Firefox":
				dr = new FirefoxDriver(); // Initialize driver if not already done
				dr.manage().window().maximize();
				driver.set(dr);
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected Browser: " + browser);
			}
			
			
		}
		
		return driver.get();
	}
	
	public static void quitDriver() {
		
		if (driver.get() != null) {
			
			driver.get().quit(); // Close the browser
			driver.remove(); // Remove the driver from ThreadLocal!
			
		}
	}
}
