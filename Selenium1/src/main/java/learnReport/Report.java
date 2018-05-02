package learnReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentHtmlReporter html = new ExtentHtmlReporter("./report/results.html");
		html.setAppendExisting(true);
		
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("TC-001 Create Lead", "Create a new lead");
		
		test.assignAuthor("Preethi");
		test.assignCategory("smoke");
		
		test.pass("Data DemoSalesManager created successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());

		test.pass("Data CRM/SFA created successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		
		test.pass("Data login successfully");
		
		extent.flush();

	}

}
