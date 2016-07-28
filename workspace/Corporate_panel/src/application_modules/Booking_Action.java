package application_modules;
import page_objects.Booking_Form;
import utility.Log;

public class Booking_Action {
	
	public static void mybooking() throws Exception{
	  Booking_Form.name().sendKeys("Test booking");
	  Log.info("Traveller name typed");
	  Booking_Form.number().sendKeys("7894561230");
	  Log.info("Traveller phone number typed");
	  //Booking_Form.payAtHotel().click();
	  Booking_Form.email().sendKeys("test@corporate.com");
	  Log.info("Traveller E-mail typed");
	  
	  Booking_Form.project().sendKeys("p1");
	  Log.info("Project id entered ");
	  Booking_Form.employee_code().sendKeys("e-77");
	  Log.info("employee code is entered");
	  Booking_Form.check_box().click();
	  Log.info("I understand checkbox selected"); 
	  
	}
	public static void paymentaction() throws Exception{
		try{
		    if(Booking_Form.payAtHotel() != null){
			Booking_Form.payAtHotel().click();
			Log.info("Pay at hotel button clicked");
		    }
		    
		else if(Booking_Form.billToCompany() != null){
			Booking_Form.billToCompany().click();
			Log.info("Bill to company clicked");
		}else{
			Booking_Form.payOnline().click();
			Log.info("Pay online button clicked");
		}
	
		    }	
		
		
			catch(Exception e){
			Log.info("No payment button found ");
			System.out.println("ddddddddd"+e);
			throw (e);
		}
		
		
	}
}


	
	
