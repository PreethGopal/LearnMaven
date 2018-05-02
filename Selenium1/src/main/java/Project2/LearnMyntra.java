package Project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMyntra {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses",  Keys.ENTER);
	
		List<WebElement> list = driver.findElementsByXPath("//span[text()='(40% OFF)']/preceding::h4[1][contains(text(),'Unisex')]/preceding::div[1][@class='product-brand']");
		
	    List<Integer> priceList = new ArrayList<>();	
		
		for (WebElement price : list) {
			
			System.out.println(price.getText());	
		}
		
		List<WebElement> uniqueList = driver.findElementsByClassName("product-brand");
		
		Set<String> st = new TreeSet<>();
		
		for (WebElement value : uniqueList) {
			
			st.add(value.getText());
			
		}
		
		System.out.println(st);		
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//label[@class = 'colour-label'])/following::li[3]").click();
		
		Thread.sleep(2000);
		
		WebElement brandName = driver.findElementByXPath("(//div[@class='product-thumbShim'])[2]/following::div[2][@class='product-brand']");
		
		System.out.println("Brand Name is " +brandName.getText());
		
		driver.findElementByXPath("(//div[@class='product-thumbShim'])[2]/following::a[1]").click();
		
		//brandName.click();
		
		driver.findElementByXPath("//span[text()='ADD TO BAG']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[text()='GO TO BAG']").click();
		
		WebElement brandName1 = driver.findElementByXPath("//a[@class='c-gray']");
				
		System.out.println(brandName1.getText());
		
		
		
		
		
		
		driver.close();
	

}
}