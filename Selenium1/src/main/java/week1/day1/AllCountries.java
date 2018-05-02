package week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		WebElement country= driver.findElementById("userRegistrationForm:countries");

		Select tt =new Select(country);

		List<WebElement> allOptions = tt.getOptions();

		System.out.println(allOptions.size());
		
		for(WebElement options : allOptions)
		{
			System.out.println(options.getText());
		}
	}

}
