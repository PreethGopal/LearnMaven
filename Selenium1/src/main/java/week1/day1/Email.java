package week1.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("DemoSalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByPartialLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf new");

		driver.findElementById("createLeadForm_firstName").sendKeys("Ravi");

		//For Dropdown field

		WebElement id= driver.findElementById("createLeadForm_dataSourceId");

		Select aa = new Select(id);

		aa.selectByValue("Employee");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ravi G");
		
		driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("G");
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Team");
		
		WebElement id1 = driver.findElementById("createLeadForm_industryEnumId");
		
		Select bb = new Select(id1);
		
		bb.selectByValue("Computer Software");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
