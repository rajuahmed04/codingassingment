package codingassessment.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import codingassessment.library.HelperClass;
import codingassessment.library.TestBaseClass;
import codingassessment.pages.AlertPage;

public class AssingmentTest extends TestBaseClass{

	JavascriptExecutor js;
	@Test(description="task2 assert the alert present")
	public void assingment() throws InterruptedException {
		HelperClass helperObj = new HelperClass(driver);
		helperObj.launchBrowser("https://demoqa.com/");
		AlertPage alrtPage = new AlertPage(driver);
		boolean result = alrtPage.handleAlerts();
		Assert.assertTrue(result);
		
	}
}
