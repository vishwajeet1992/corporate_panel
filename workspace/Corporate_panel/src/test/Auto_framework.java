package test;

import org.apache.log4j.xml.DOMConfigurator;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import application_modules.Login_Action;
import page_objects.BaseClass;
import utility.Utils;

public class Auto_framework {
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeMethod() throws Exception{
		 // Configuring Log4j logs, without it logging won't work.
		DOMConfigurator.configure("/home/vishawjeet/workspace/Corporate_panel/src/log.xml");

		driver= Utils.OpenBrowser();
		driver.manage().window().maximize();
		new BaseClass(driver);
	}
	@Test
	public  void main() throws Exception {
		try{
			Login_Action.Execute();
			if (BaseClass.bResult==true){
				System.out.println("test case passed");
			}
			else{ 
				throw new Exception("test case failed");
					
				}
			}
		catch (Exception e){
			throw (e);
		}
		
	}
	
}
