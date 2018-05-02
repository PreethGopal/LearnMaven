package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("DemoSalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();

		//Click on Merge Leads 

		driver.findElementByXPath("//a[text()='Merge Leads']").click();

		Thread.sleep(2000);

		//Click the first icon

		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

		//Switch to new window

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> winList = new ArrayList<String>();

		winList.addAll(windowHandles);

		driver.switchTo().window(winList.get(1));		

		driver.findElementByXPath("//input[@name='id']").sendKeys("22");

		Thread.sleep(3000);

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);

		//Click the first row

		WebDriverWait wait= new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));

		String fromLead= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();	
		
		System.out.println(fromLead);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(winList.get(0));
		
		//Click on second icon

		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Thread.sleep(3000);	
		
		//Switch to new window

		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> winList1 = new ArrayList<String>();

		winList1.addAll(windowHandles1);

		driver.switchTo().window(winList1.get(1));		

		driver.findElementByXPath("//input[@name='id']").sendKeys("55");

		Thread.sleep(3000);

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);

		//Click the first row
		
		WebDriverWait wait1= new WebDriverWait(driver, 10);

		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));

		String toLead= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();	
		
		System.out.println(toLead);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();		
		
		Thread.sleep(3000);

		driver.switchTo().window(winList1.get(0));	
		
		//Click on Merge Button
		
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
		driver.switchTo().alert().accept();
		
		//Click on Find Leads button
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(fromLead);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//Verify the error message
		
		String errormsg= driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		System.out.println(errormsg);
		
		String error = "No records to display";
		
		if(errormsg.contains(error))
		{
			System.out.println("The message is successfully displayed");
		}
		else
		{
			System.out.println("The message is not successfully displayed");
		}
		
		//Close the browser
		
		driver.close();
		
		

	}

}
