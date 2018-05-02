package week4.day1;

//import org.testng.annotations.Test;

import org.testng.annotations.Test;
import project1.ProjectMethods;
/*
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import wdMethods.SeMethods;*/

public class MergeLeadJunit extends ProjectMethods{

	@Test (groups="sanity" , dependsOnGroups="smoke")

	public void mergeLead() throws InterruptedException
	{
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("id", "username"),"DemoSalesManager");

		type(locateElement("id", "password"),"crmsfa");

		click(locateElement("class", "decorativeSubmit"));*/

		click(locateElement("link", "CRM/SFA"));

		click(locateElement("link", "Leads"));

		click(locateElement("link", "Merge Leads"));

		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));

		switchToWindow(1);

		type(locateElement("xpath", "//input[@name='id']"), "102");

		click(locateElement("xpath", "//button[text()='Find Leads']"));

		Thread.sleep(2000);

		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

		switchToWindow(0);
		
		Thread.sleep(3000);
		
		clickWithNoSnap(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
			
		switchToWindow(1);

		type(locateElement("xpath", "//input[@name='id']"), "102");
		
		Thread.sleep(3000);

		click(locateElement("xpath", "//button[text()='Find Leads']"));

		Thread.sleep(2000);

		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		switchToWindow(0);

		Thread.sleep(3000);
		
		clickWithNoSnap(locateElement("xpath", "//a[@class='buttonDangerous']"));
		
		Thread.sleep(3000);
				
		acceptAlert();
		
		Thread.sleep(3000);
		
		click(locateElement("xpath", "//a[text()='Find Leads']"));
		
		type(locateElement("xpath", "//input[@name='id']"), "10206");
		
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		
		getText(locateElement("xpath", "//div[text()='No records to display']"));
		
		verifyExactText(locateElement("xpath", "//div[text()='No records to display']"), "No records to display");
		
		//closeBrowser();	
		

	}

}
