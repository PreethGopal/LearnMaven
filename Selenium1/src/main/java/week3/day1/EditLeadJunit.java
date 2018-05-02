package week3.day1;

import org.junit.Test;

import wdMethods.SeMethods;


public class EditLeadJunit extends SeMethods{
	@Test
		public void editLead() throws InterruptedException {
		
		startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("id", "username"),"DemoSalesManager");

		type(locateElement("id", "password"),"crmsfa");

		click(locateElement("class", "decorativeSubmit"));

		click(locateElement("link", "CRM/SFA"));

		click(locateElement("link", "Leads"));

		click(locateElement("Xpath", "//a[contains(text(),'Find Leads')]"));
		
		type(locateElement("Xpath", "//label[text()='Lead ID:']/following::input[2]"),"s");
		
		Thread.sleep(3000);
		
		click(locateElement("Xpath", "//button[text() = 'Find Leads']"));
		
		Thread.sleep(3000);
		
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		verifyTitle("View Lead | opentaps CRM");
		
			
		}
	}


