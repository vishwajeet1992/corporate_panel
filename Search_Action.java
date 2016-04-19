package application_modules;

import page_objects.Search_page;

public class Search_Action  {
	
	public static void my_search() throws Exception{
		//Search_page.my_account().click();
		
		Search_page.city_link().click();
		
		Search_page.city_search().click();
		
	}
	
	

}
