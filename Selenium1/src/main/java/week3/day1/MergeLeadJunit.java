package week3.day1;

import org.junit.Test;

import wdMethods.SeMethods;

public class MergeLeadJunit extends SeMethods{

	@Test

	public void mergeLead() throws InterruptedException
	{
		startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("id", "username"),"DemoSalesManager");

		type(locateElement("id", "password"),"crmsfa");

		click(locateElement("class", "decorativeSubmit"));

		click(locateElement("link", "CRM/SFA"));

		click(locateElement("link", "Leads"));

		click(locateElement("link", "Merge Leads"));

		click(locateElement("Xpath", "(//img[@alt='Lookup'])[1]"));

		switchToWindow(1);

		type(locateElement("Xpath", "//input[@name='id']"), "10004");

		click(locateElement("Xpath", "//button[text()='Find Leads']"));

		Thread.sleep(2000);

		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

		switchToWindow(0);
		
		Thread.sleep(3000);
		
		//clickWithoutSnap();

		click(locateElement("Xpath", "(//img[@alt='Lookup'])[2]"));
			
		switchToWindow(1);

		type(locateElement("Xpath", "//input[@name='id']"), "10005");
		
		Thread.sleep(3000);

		click(locateElement("Xpath", "//button[text()='Find Leads']"));

		Thread.sleep(2000);

		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		switchToWindow(0);

		Thread.sleep(3000);
		
		click(locateElement("Xpath", "//a[@class='buttonDangerous']"));
		
		acceptAlert();
		
		click(locateElement("Xpath", "//a[text()='Find Leads']"));
		
		type(locateElement("Xpath", "//input[@name='id']"), "10004");
		
		click(locateElement("Xpath", "//button[text()='Find Leads']"));
		
		getText(locateElement("Xpath", "//div[text()='No records to display']"));
		
		verifyExactText(locateElement("Xpath", "//div[text()='No records to display']"), "No records to display");
		
		closeBrowser();	
		

	}

}
