package project1;

import org.junit.Test;

public class EditAndSave extends ProjectMethods {

	@Test
	public void contact() throws InterruptedException
	{
		login();
		
		click(locateElement("xpath", "//div[@for='crmsfa']/a"));
		
		click(locateElement("xpath", "//a[text()='Contacts']"));
		
		click(locateElement("xpath", "//a[text()='Find Contacts']"));
		
		type(locateElement("xpath", "//input[@name='id']"), "10100");
		
		click(locateElement("xpath", "//button[text()='Find Contacts']"));
		
		Thread.sleep(2000);
		
		clickWithNoSnap(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		
		click(locateElement("xpath", "//a[text()='Edit']"));
		
		type(locateElement("xpath", "//input[@id='updateContactForm_personalTitle']"), "opal");
		
		click(locateElement("xpath", "(//input[@name='submitButton'])[1]"));
		
		
	
	

}
}