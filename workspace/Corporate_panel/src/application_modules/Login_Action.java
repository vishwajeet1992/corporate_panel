package application_modules;


import page_objects.Login_page;
import utility.Log;
   

public class Login_Action {
        public static void Execute() throws Exception{
      Login_page.Username_txtbox().sendKeys("test corporate");	
      Log.info("username is entered in the text box");
      
      Login_page.Password_txtbox().sendKeys("pass");
      Log.info("Password is entered in the text box");
      
      Login_page.Login_bttn().click();
      Log.info("Login Button is clicked.");
      	  
        }
}
