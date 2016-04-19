package page_objects;

import org.openqa.selenium.*;

import utility.Log;
//import utility.Utils;
import utility.Log;
  public class Login_page extends BaseClass {
         private static WebElement element = null;
      
public  Login_page(WebDriver driver) {
	super(driver);
}
	public static WebElement Username_txtbox() throws Exception{
		try{
			element= driver.findElement(By.id("login_username"));
			Log.info("User Name text box is found on the login page.");
		}catch(Exception e){
			Log.error("User Name text box is not found on the login page.");
			throw(e);
		}
		 return element;
}
	public static WebElement Password_txtbox() throws Exception{
		try{
			element=driver.findElement(By.id("login_passwd"));
			Log.info("Password text box found on the login page.");
		} catch(Exception e){
			Log.error("Password text box not found");
			throw(e);
		
		}
		  return element;
	}	  
		 public static WebElement Forgot_Password_link() throws Exception{
        	 try{
        		 element=driver.findElement(By.xpath("/html/body/div/section/div/div/div/div[2]/div/form/div[2]/p/a"));
        		 Log.info("Forgot password link found.");
        	 }
        	 catch(Exception e){
        		 Log.error("Forgot Password link not found.");
        		 throw(e);
        	 }
        	  return element;
         }
          public static WebElement Login_bttn() throws Exception{
        	  try{
        		  element=driver.findElement(By.id("btn-login"));
        		  Log.info("Login button found on the page");
        	  }
        	  catch(Exception e){
        		  Log.error("Login button not found on the page.");
        		  throw(e);
        	  }
                return element;
		
	}

}
