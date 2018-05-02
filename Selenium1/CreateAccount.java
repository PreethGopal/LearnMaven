package Project2;

import java.sql.Driver;

import org.junit.Test;

import project1.ProjectMethods;

public class CreateAccount extends ProjectMethods{
	@Test

	public void createacc() throws InterruptedException {
		login();
		
		click(locateElement("xpath", "//div[@for='crmsfa']/a"));
		
		click(locateElement("xpath", "//a[text() = 'Accounts']"));
		
		click(locateElement("xpath", "//a[text()='Create Account']"));
		
		type(locateElement("xpath", "//input[@id='accountName']"), "Saratha Preethi");
		
		selectDropDownUsingText(locateElement("xpath", "//select[@name='industryEnumId']"), "Computer Software");
		
		selectDropDownUsingText(locateElement("xpath", "//select[@id='currencyUomId']"), "ALL - Albanian Lek");
		
		selectDropDownUsingText(locateElement("xpath", "//select[@id='dataSourceId']"), "Employee");
		
		selectDropDownUsingText(locateElement("xpath", "//select[@id='marketingCampaignId']"), "Car and Driver");
		
		type(locateElement("xpath", "//input[@id='primaryPhoneNumber']"), "8148514914");
		
		type(locateElement("xpath", "//input[@id='generalCity']"), "Los Vegas");
		
		type(locateElement("xpath", "//input[@id='primaryEmail']"), "gsarathapreethi@gmail.com");
		
		selectDropDownUsingText(locateElement("xpath", "//select[@id='generalCountryGeoId']"), "United States");
		
		selectDropDownUsingText(locateElement("xpath", "//select[@id='generalStateProvinceGeoId']"), "New York");
		
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		
		getText(locateElement("xpath", "//span[text()='Saratha Preethi  (10423)']"));
		
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "saratha");
		
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		
		click(locateElement("xpath", "(//a[@class='linktext'])[4]"));
		
		verifyExactText(locateElement("xpath", "//span[text()='Saratha Preethi  (10423)']"), "Saratha Preethi  (10423)");
		
		Thread.sleep(2000);
		
		closeBrowser();
		
		
		
		
		
			
		
		  
}
}
