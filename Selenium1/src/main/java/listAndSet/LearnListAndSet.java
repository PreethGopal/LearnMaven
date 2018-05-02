package listAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListAndSet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElementByXPath("//button[text()='✕']").click();

		driver.findElementByXPath("//input[@title='Search for products, brands and more']").sendKeys("bags", Keys.ENTER);

		Thread.sleep(5000);

		List<WebElement> prices = driver.findElementsByXPath("//div[@class='_1vC4OE']");

		List<Integer> priceList = new ArrayList<>();	
		
		for (WebElement price : prices) {
			
			String value = price.getText();	
			
			String replace = value.replaceAll("[₹,]", "");
			
			int amt = Integer.parseInt(replace);
			
			System.out.println(amt);
			
			priceList.add(amt);
		}
		
		Collections.sort(priceList);
		
		System.out.println("#####################################");
		
		System.out.println(priceList.get(0));
		
		System.out.println("#####################################");
		
		System.out.println(priceList);
							
		driver.close();

	}
}

		
		
		
		
		
		

		


