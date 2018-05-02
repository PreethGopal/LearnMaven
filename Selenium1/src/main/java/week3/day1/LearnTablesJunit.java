package week3.day1;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class LearnTablesJunit extends SeMethods{
@Test
		public void Erail() throws InterruptedException {

		startApp("chrome", "https://erail.in/");
		
		clear(locateElement("id", "txtStationFrom"));		
		
		typeUsingKeys(locateElement("id", "txtStationFrom"),"MS", Keys.ENTER);
		
		clear(locateElement("id", "txtStationTo"));

		typeUsingKeys(locateElement("id", "txtStationTo"),"SBC", Keys.ENTER);
		
		verifySelected(locateElement("id", "chkSelectDateOnly"));
		
		click(locateElement("id", "chkSelectDateOnly"));
		
		Thread.sleep(3000);
		
		WebElement table = locateElement("xpath", "//table[@class='DataTable TrainList']");
		
		webTable(table, 1);
		
		
		
		
		
		
		
		
		



	}

	
}


