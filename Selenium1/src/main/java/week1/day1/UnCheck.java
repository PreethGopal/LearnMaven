package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

		WebElement ss= driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]");
		
		Thread.sleep(2000);

		ss.click();

		Thread.sleep(5000);
		
		driver.close();
	}

}
