package week3.day1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import wdMethods.SeMethods;

public class DuplicateLeadJunit extends SeMethods {
	@Test
	public void DuplicateLead() throws InterruptedException{

		startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("id", "username"),"DemoSalesManager");

		type(locateElement("id", "password"),"crmsfa");

		click(locateElement("class", "decorativeSubmit"));

		click(locateElement("link", "CRM/SFA"));

		click(locateElement("link", "Leads"));

		click(locateElement("Xpath", "//a[contains(text(),'Find Leads')]"));
		
		click(locateElement("Xpath" , "//span[text()='Email']"));
		
		type(locateElement("Xpath", "//input[@name='emailAddress']" ),"santhosh1@gmail.com");
		
		Thread.sleep(3000);
		
		click(locateElement("Xpath", "//button[text() = 'Find Leads']"));
		
		Thread.sleep(3000);
		
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		//getText(locateElement("Xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']"));
		
		Thread.sleep(3000);
		
		click(locateElement("Xpath", "//a[text()='Duplicate Lead']"));
		
		verifyTitle("Duplicate Lead");
		
		Thread.sleep(3000);
		
		click(locateElement("Xpath", "//input[@class='smallSubmit']"));



	}
}
