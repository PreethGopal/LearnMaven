package listAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/search?fromCityName=Chennai&fromCityId=123&toCityName=Bangalore&toCityId=122&onward=23-Apr-2018&opId=0&busType=Any");
		
		Thread.sleep(3000);
		
		
		//((JavascriptExecutor)driver).executeScript(script, args);
		
		List<WebElement> element = driver.findElementsByClassName("service-name");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//label[@for='showRedDeals'])[1]").click();
		
		Thread.sleep(3000);
				
		/*
		 ((JavascriptExecutor)

				 driver).executeScript(3window.scrollTo(0,

				 document.body.scrollHeight)”);*/
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(2000);
		
			
		//driver.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element);
		
		Set<String> operators = new TreeSet<>();
		
		for (WebElement operator : element) {
			
			operators.add(operator.getText());
														
		}
		
		System.out.println(operators);
						
		//driver.close();
			
		
	}

}







