package codingassessment.library;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HelperClass {

	WebDriver driver;
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public void launchBrowser(String url)
	{
		driver.get(url);
	}
	 
	public void navigateToAModule(String moduleName)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,400)");
		driver.findElement(By.xpath("//h5[normalize-space()='"+moduleName+"']")).click();
	}
}
