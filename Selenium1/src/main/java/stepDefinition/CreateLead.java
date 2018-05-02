package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.BeforeMethod;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	public static RemoteWebDriver driver; 

	
	@Before
	public void before(Scenario sc) {
		System.out.println(sc.getName());
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps");
		
	}
	/*@Given("Open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
	}

	@And("Use TimeOuts")
	public void timeOuts() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@And("Maximize the browser")
	public void maximizebrw() {
		driver.manage().window().maximize();
	}


	@And("Load the URL")
	public void loadURL() {
		driver.get("http://www.leaftaps.com/opentaps");
	}*/

	@And("Enter the username as (.*)")
	public void username(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter the password as (.*)")
	public void password(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@And("Click on login")
	public void login(){
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("Click on CRMSFA link")
	public void crmsfaLink(){
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on Leads")
	public void leadLink(){
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click on Create Lead")
	public void CreateLeadLink(){
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter the company name as (.*)")
	public void enterCname(String cNAme) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cNAme);
	}
	
	@And("Enter the first name as (.*)")
	public void enterFname(String fNAme) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fNAme);
	}
	
	@And("Enter the last name as (.*)")
	public void enterLname(String lNAme) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lNAme);
	}
	
	@When("Click the Create Lead button")
	public void clickCreateLeadbtn() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();
	}
	
	@Then("New lead is created")
	public void verifyLead() {
		System.out.println("Verify new lead is created");
		
	}
	
	@After
	public void after(Scenario sc) {
		System.out.println(sc.getStatus());
		driver.close();
	}
}







