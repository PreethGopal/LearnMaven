package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement ss= driver.findElementByXPath("//label[text()='Select the languages that you know?']/following :: input[4]");
		
		ss.click();
		
		Thread.sleep(5000);
		
		System.out.println(ss.isSelected());
		
		driver.close();
						
	}

}
