package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertPopUp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	    driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
/*		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());   //untill return Alert
		System.out.println(alert.getText());
		alert.accept();
		 //selenium switch to alert internally
	*/
//	    acceptSendKeys(10, "this is prompt");    //why not working
		
		
		
	}

	public static Alert waitForAlertPresence(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	    return wait.until(ExpectedConditions.alertIsPresent()); 
	}
	
	public static String getAlertText(int timeOut) {
		return waitForAlertPresence(timeOut).getText();
	}
	
	public static void acceptAlert(int timeOut) {
		waitForAlertPresence(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
		waitForAlertPresence(timeOut).dismiss();
	}
	
	public static void acceptSendKeys(int timeOut, String value) {   //not sending value 
		waitForAlertPresence(timeOut).sendKeys(value);
	}
	
}
