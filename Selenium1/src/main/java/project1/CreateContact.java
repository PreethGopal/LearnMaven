package project1;

import org.junit.Test;

public class CreateContact extends ProjectMethods{

	@Test
	public void contact() throws InterruptedException
	{
		login();
		
		click(locateElement("xpath", "//div[@for='crmsfa']/a"));
		
		click(locateElement("xpath", "//a[text()='Contacts']"));
		
		click(locateElement("xpath", "//a[text()='Create Contact']"));
		
		type(locateElement("xpath", "//input[@id='firstNameField']"), "Saratha");
		
		type(locateElement("xpath", "//input[@id='lastNameField']"), "Preethi");
		
		type(locateElement("xpath", "//input[@id='createContactForm_firstNameLocal']"), "Preeth");
		
		type(locateElement("xpath", "//input[@id='createContactForm_lastNameLocal']"), "gopal");
		
		type(locateElement("xpath", "//input[@id='createContactForm_personalTitle']"), "G");
		
		type(locateElement("xpath", "//input[@id='createContactForm_birthDate']"), "12/17/93");  //createContactForm_birthDate-button
		
		type(locateElement("xpath", "//input[@id='createContactForm_generalProfTitle']"), "Test Leaf"); 
		
		type(locateElement("xpath", "//input[@id='createContactForm_departmentName']"), "Test Engineer");
		
		Thread.sleep(2000);
		
		selectDropDownUsingText(locateElement("xpath", "//select[@id='createContactForm_preferredCurrencyUomId']"), "ALL - Albanian Lek");		
		
		click(locateElement("xpath", "//img[@alt = 'Lookup']"));
		
		switchToWindow(1);
		
		type(locateElement("xpath", "//input[@name = 'id']"), "100");
		
		click(locateElement("xpath", "//button[text()= 'Find Accounts']"));
		
		Thread.sleep(2000);
		
		clickWithNoSnap(locateElement("xpath", "(//a[@class = 'linktext'])[1]"));
		
		Thread.sleep(3000);
		
		switchToWindow(0);
		
		Thread.sleep(3000);
		
		type(locateElement("xpath", "//textarea[@id='createContactForm_description']"), "Contact info is saving");
		
		type(locateElement("xpath", "//textarea[@id='createContactForm_importantNote']"), "Contact info is saving");
		   
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneAreaCode']"), "65025");
		
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneNumber']"), "10025698");
		
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneExtension']"), "652");
		
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneAskForName']"), "preeth");
		
		type(locateElement("xpath", "//input[@id='createContactForm_primaryEmail']"), "gsarathapreethi@gmail.com");
		
		verifyExactText(locateElement("xpath", "//input[@id='generalToNameField']"), "Saratha Preethi");
		
		type(locateElement("xpath", "//input[@id='createContactForm_generalAttnName']"), "prth");
		
		type(locateElement("xpath", "//input[@id='createContactForm_generalAddress1']"), "St.Lowerd st");
		
		type(locateElement("xpath", "//input[@id='createContactForm_generalAddress2']"), "Santhome paul");
		
		type(locateElement("xpath", "//input[@id='createContactForm_generalCity']"), "Los Vegas");
		
		selectDropDownUsingText(locateElement("xpath", "//select[@id='createContactForm_generalStateProvinceGeoId']"), "New York");
		
		type(locateElement("xpath", "//input[@id='createContactForm_generalPostalCode']"), "60025");
		
		type(locateElement("xpath", "//input[@id='createContactForm_generalPostalCodeExt']"), "10");
		
		Thread.sleep(3000);
		
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		
			
		
		
}
}