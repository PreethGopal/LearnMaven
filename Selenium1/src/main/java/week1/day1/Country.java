package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement country= driver.findElementById("userRegistrationForm:countries");
	    
	    Select tt =new Select(country);
	    
	    //tt.selectByVisibleText("Egypt");
	     
	    tt.selectByValue("56");
	}

}
