package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Search_page extends BaseClass{
	
	private static WebElement element=null;
	
	public Search_page(WebDriver driver){
		super(driver);
	}
	
	public static WebElement my_account() throws Exception {
	
		try{
			element=driver.findElement(By.xpath(".//*[@id='main-header']/div[1]/div/div/div[2]/div[2]/ul/div/span/span"));
			String username = driver.findElement(By.tagName(".//*[@id='main-header']/div[1]/div/div/div[2]/div[2]/ul/div/span/span")).getText();
			System.out.println(username + ("is logged in ."));
			Log.info("user logged in sucessfully" );
		} catch(Exception e) {
			Log.info("user not logged in");
			throw(e);
		}
		return element;
	}	
		
		public static WebElement city_link() throws Exception {
			try{
				element=driver.findElement(By.linkText("Pondicherry"));
			
				Log.info("Pondicherry city link  found ");
			}catch(Exception e){
				Log.info("Asked city link not found");
				throw(e);
			}
			return element;
		}
			public static WebElement city_search() throws Exception {
				try {
					element=driver.findElement(By.xpath(".//*[@id='resultpage']/div/div[1]/a/h4"));
					Log.info("Hotel name clicked");
					
				} catch(Exception e){
					Log.info(" hotel not found");
				}
				return element;
				
			}
			
		
			
		}


