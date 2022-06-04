package codingassessment.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPage {

	WebDriver driver;
	public AlertPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public boolean handleAlerts() throws InterruptedException
	{
		boolean result = false;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,400)");
		driver.findElement(By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']")).click();
		js.executeScript("window.scrollTo(0,400)");
		WebElement e = driver.findElement(By.xpath("//span[normalize-space()='Alerts']"));
		e.click();
		js.executeScript("window.scrollTo(0,0)");
		driver.findElement(By.xpath("//span[normalize-space()='On button click, alert will appear after 5 seconds']/parent::div/following-sibling::div/button")).click();
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alrt.getText());
		alrt.accept();
		result =true;
		return result;
		
		
	}
}
