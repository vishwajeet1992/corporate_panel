package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils extends Log {
	public static WebDriver driver=null;
	public static WebDriver OpenBrowser() throws Exception{
		String sBrowserName;
		try{
			driver = new FirefoxDriver();
			Log.info("Webdriver initiated successfully.");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on driver for 20 seconds");
			driver.get("https://www.roomoncall.in/account");
			Log.info("Web application launched successfully");
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		catch (Exception e){
			Log.info("Class Utils | Method OpenBrowser | Exception desc : ");
		}
		return driver;
	}
	}
