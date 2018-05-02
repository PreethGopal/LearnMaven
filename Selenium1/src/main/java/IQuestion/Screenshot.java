package IQuestion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");

		driver.findElementById("video-title").click();
		
		driver.findElementById("Play").click();
		
		WebElement element = driver.findElementById("related");
		
		

	}

}
