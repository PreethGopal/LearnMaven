package week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

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

		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Create Lead").click();

		WebElement findElementById2 = driver.findElementById("createLeadForm_marketingCampaignId");

		Select bb = new Select(findElementById2);

		List<WebElement> allOptions = bb.getOptions();

		//System.out.println(allOptions.size());

		bb.selectByIndex(allOptions.size() -2);
	}

}
