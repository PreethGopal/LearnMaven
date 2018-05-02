package project1;

import org.junit.Test;

public class DeleteContactInfo extends ProjectMethods{

	@Test
	public void contact() throws InterruptedException
	{
		login();
		
		click(locateElement("xpath", "//div[@for='crmsfa']/a"));
		
		click(locateElement("xpath", "//a[text()='Contacts']")); 
		
		
		
		
		
		
		

}
}