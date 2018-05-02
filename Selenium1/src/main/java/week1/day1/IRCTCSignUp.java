package week1.day1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCSignUp {
	public static void main(String[] args) throws InterruptedException {
	
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    
    ChromeDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
    
    driver.findElementById("userRegistrationForm:userName").sendKeys("Preethgopal");
    
    driver.findElementById("userRegistrationForm:password").sendKeys("Meeragopal17$");
    
    driver.findElementById("userRegistrationForm:confpasword").sendKeys("Meeragopal17$");
    
    WebElement id = driver.findElementById("userRegistrationForm:securityQ");  
    
    Select aa=new Select(id);
    
    aa.selectByVisibleText("What is your pet name?");  
    
    driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Jacky");
    
    driver.findElementById("userRegistrationForm:firstName").sendKeys("Preethi");
    
    driver.findElementById("userRegistrationForm:middleName").sendKeys("Meera");

    driver.findElementById("userRegistrationForm:lastName").sendKeys("Prasanth");
    
    driver.findElementById("userRegistrationForm:gender:1").click();
    
    driver.findElementById("userRegistrationForm:maritalStatus:0").click();
    
    WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");

    Select bb=new Select(dobDay);
    
    bb.selectByIndex(16);
    
    WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
    
    Select cc=new Select(month);
    
    cc.selectByVisibleText("DEC");
    
    WebElement year= driver.findElementById("userRegistrationForm:dateOfBirth");
    
    Select dd=new Select(year);
    
    dd.selectByIndex(7);    
    
    WebElement sas= driver.findElementById("userRegistrationForm:occupation");
    
    Select ss =new Select(sas);
    
    ss.selectByVisibleText("Private");
    
    WebElement country= driver.findElementById("userRegistrationForm:countries");
    
    Select tt =new Select(country);
     
    tt.selectByVisibleText("India");
    
    driver.findElementById("userRegistrationForm:email").sendKeys("gsarathapreethi@gmail.com");
    
    driver.findElementById("userRegistrationForm:mobile").sendKeys("8148514914");
    
    WebElement nationality= driver.findElementById("userRegistrationForm:nationalityId");
    
    Select ff =new Select(nationality);
    
    ff.selectByVisibleText("India");
    
    driver.findElementById("userRegistrationForm:address").sendKeys("No.E14,Indira Gandhi St");
    
    driver.findElementById("userRegistrationForm:pincode").sendKeys("600036", Keys.TAB);
    
    Thread.sleep(2000);
    
    WebElement city= driver.findElementById("userRegistrationForm:cityName");
    
    Select mm =new Select(city);
    
    mm.selectByVisibleText("Chennai");
    
    Thread.sleep(2000);
    
    WebElement po= driver.findElementById("userRegistrationForm:postofficeName");
    
    Select nn =new Select(po);
    
    nn.selectByValue("Indian Institute Of Technology S.O");
    
    driver.findElementById("userRegistrationForm:landline").sendKeys("044 22223233");
    
    Thread.sleep(5000);    
    
	}
}
    
    
    
   
   
    
    
    
    
    
    

    
    
    
    
    
    
    
   

    
    
    
    
    
    
    
    
    
    
    
    
    
   


