package week4.day2;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import project1.ProjectMethods;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLeadJunit extends ProjectMethods{
	@Test
	
	public void createLead() {
		
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");
		
		type(locateElement("id", "username"),"DemoSalesManager");
		
		type(locateElement("id", "password"),"crmsfa");
		
		click(locateElement("class", "decorativeSubmit"));*/
		
		click(locateElement("link", "CRM/SFA"));
		
		click(locateElement("link", "Leads"));
		
		click(locateElement("link", "Create Lead"));		
				
		type(locateElement("id", "createLeadForm_companyName"),"TestLeaf 123");
		
		type(locateElement("id", "createLeadForm_firstName"),"Ravi");
		
		type(locateElement("id", "createLeadForm_lastName"),"Kanth");
		
		click(locateElement("class", "smallSubmit"));	
		
					
	}

}
