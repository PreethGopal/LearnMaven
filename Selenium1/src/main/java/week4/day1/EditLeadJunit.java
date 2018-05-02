package week4.day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import project1.ProjectMethods;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import wdMethods.SeMethods;


public class EditLeadJunit extends ProjectMethods{
	
	@Test(groups="smoke")
	
		public void editLead() throws InterruptedException {
		
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("id", "username"),"DemoSalesManager");

		type(locateElement("id", "password"),"crmsfa");

		click(locateElement("class", "decorativeSubmit"));*/

		click(locateElement("link", "CRM/SFA"));

		click(locateElement("link", "Leads"));

		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"),"s");
		
		Thread.sleep(3000);
		
		click(locateElement("xpath", "//button[text() = 'Find Leads']"));
		
		Thread.sleep(3000);
		
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		verifyTitle("View Lead | opentaps CRM");
		
			
		}
	}


