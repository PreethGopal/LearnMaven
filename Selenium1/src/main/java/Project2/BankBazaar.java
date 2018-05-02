package Project2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BankBazaar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.bankbazaar.com/personal-loan.html");

		driver.findElementByXPath("//div[@class='tab-sec custom-quote']").click();

		Thread.sleep(3000);

		driver.findElementByXPath("//span[@class='sprite-gender icon-gender-female']").click();

		Thread.sleep(2000);

		driver.findElementByXPath("//span[@class='sprite-city icon-city-chennai']").click();

		Thread.sleep(2000);

		driver.findElementById("form_applicantPlaceHolder_companyName_autoComplete").sendKeys("IBM", Keys.ENTER);

		
		//driver.findElementByXPath("(//button[text()='Continue'])[2]").click();

		Thread.sleep(2000); 

       	WebElement slider = driver.findElementByXPath("//div[@class ='eform-slider-1 ']");
       	
       	//System.out.println(slider.getText());

		Actions move = new Actions(driver);
		
		move.clickAndHold(slider).dragAndDropBy(slider, 180, 0).build().perform();

		Thread.sleep(2000);






	}

}
