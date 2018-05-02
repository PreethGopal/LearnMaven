package week4.day1;

//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import project1.ProjectMethods;

/*import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import wdMethods.SeMethods;*/

public class DeleteLeadJunit extends ProjectMethods {
	
	@Test (groups="sanity", dependsOnGroups="smoke")
	
	public void deleteLead() throws InterruptedException {


		/*startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("id", "username"),"DemoSalesManager");

		type(locateElement("id", "password"),"crmsfa");

		click(locateElement("class", "decorativeSubmit"));*/

		click(locateElement("link", "CRM/SFA"));

		click(locateElement("link", "Leads"));

		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		
		click(locateElement("xpath", "//span[text()='Phone']"));
		
		type(locateElement("xpath", "//input[@name='phoneAreaCode']"),"91");
		
		//type(locateElement("xpath", "//input[@name='phoneNumber']"),"8939326843");
		
		click(locateElement("xpath", "//button[text() = 'Find Leads']"));
		
		Thread.sleep(3000);
		
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		click(locateElement("xpath", "//a[text()='Delete']"));
		
		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		
		type(locateElement("xpath", "//input[@name='id']"), "10320");
        
        click(locateElement("xpath", "//button[text()='Find Leads']"));
        
        verifyExactText(locateElement("xpath", "//div[text()='No records to display']"), "No records to display");

		//closeBrowser();	

	}
}
