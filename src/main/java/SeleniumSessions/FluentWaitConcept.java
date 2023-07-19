package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		//WebDriverWait --> FluentWait --> Wait
		
		//WebDriverWait is not override any method from FluentWait except one method which is protected.so why don't we use WebdriverWait instead of FluemtWait
		//WebDriverWait is the extended version of FluentWait.
		
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By freeTrial = By.cssSelector("a[title='Free Trial']");
//		By freeTrial = By.cssSelector("a[title='Free Trial11111']");  //NoSuchElementException thrown after 10 seconds. //if wrong locator
		
		
		//another way of handling the exception with fluent wait
/*		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                     .withTimeout(Duration.ofSeconds(10))
				                     .ignoring(NoSuchElementException.class)          //ignore those exception between 10 secs
				                     .ignoring(StaleElementReferenceException.class)   //ignoring will be applied for only 10 seconds.
				                     .pollingEvery(Duration.ofSeconds(2))
		                             .withMessage(".....element is not found on the page......");  // message will be displayed if element not found within 10 seconds.
		  
		WebElement freeTrialEle = wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial));
		freeTrialEle.click();
		*/
		
		
		waitForElementPresenceWithFluentWait(10, 2, freeTrial).click();
	}

	public static WebElement waitForElementPresenceWithFluentWait(int timeOut, int pollingTime, By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .ignoring(NoSuchElementException.class)          
                .ignoring(StaleElementReferenceException.class)   
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .withMessage(".....element is not found on the page......");
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public static void waitForAlertWithFluentWait(int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .ignoring(NoAlertPresentException.class) 
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .withMessage(".....Alert is not found on the page......");
		
		 wait.until(ExpectedConditions.alertIsPresent());
	}
	
}


