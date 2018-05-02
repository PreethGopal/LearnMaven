package week5.day1;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import project1.ProjectMethods;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLeadJunit extends ProjectMethods{
	@Test(dataProvider = "fetchData")
	
	public void createLead(String cName, String fName , String lName, String email, String ph) {
		
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");
		
		type(locateElement("id", "username"),"DemoSalesManager");
		
		type(locateElement("id", "password"),"crmsfa");
		
		click(locateElement("class", "decorativeSubmit"));*/
		
		click(locateElement("link", "CRM/SFA"));
		
		click(locateElement("link", "Leads"));
		
		click(locateElement("link", "Create Lead"));		
				
		type(locateElement("id", "createLeadForm_companyName"),cName);
		
		type(locateElement("id", "createLeadForm_firstName"),fName);
		
		type(locateElement("id", "createLeadForm_lastName"),lName);
		
		type(locateElement("id", "createLeadForm_primaryEmail"),email);
		
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"),ph);
				
		click(locateElement("class", "smallSubmit"));	
		
					
	}

}
