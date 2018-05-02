package week3.day1;

import org.junit.Test;
import org.openqa.selenium.Keys;

import wdMethods.SeMethods;

public class DeleteLeadJunit extends SeMethods {
	@Test
	public void deleteLead() throws InterruptedException {


		startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("id", "username"),"DemoSalesManager");

		type(locateElement("id", "password"),"crmsfa");

		click(locateElement("class", "decorativeSubmit"));

		click(locateElement("link", "CRM/SFA"));

		click(locateElement("link", "Leads"));

		click(locateElement("Xpath", "//a[contains(text(),'Find Leads')]"));
		
		click(locateElement("Xpath", "//span[text()='Phone']"));
		
		type(locateElement("Xpath", "//input[@name='phoneAreaCode']"),"91");
		
		//type(locateElement("Xpath", "//input[@name='phoneNumber']"),"8939326843");
		
		click(locateElement("Xpath", "//button[text() = 'Find Leads']"));
		
		Thread.sleep(3000);
		
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		click(locateElement("Xpath", "//a[text()='Delete']"));
		
		click(locateElement("Xpath", "//a[contains(text(),'Find Leads')]"));
		
		type(locateElement("Xpath", "//input[@name='id']"), "10320");
        
        click(locateElement("Xpath", "//button[text()='Find Leads']"));
        
        verifyExactText(locateElement("Xpath", "//div[text()='No records to display']"), "No records to display");

		closeBrowser();	

	}
}
