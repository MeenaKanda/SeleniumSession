package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithFluentFeatures {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		//WebDriverWait -- > FluentWait --> Wait
		
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By freeTrial = By.cssSelector("a[title='Free Trial']");
		
		
		//WebDriverWait with fluent features
/*		WebDriverWait wait = new WebDriverWait(null, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		wait.withMessage("  --- ele not found ----");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial)).click();
	*/
		
		//WebDriverWait without Fluent features
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));  //WebDriverWait with polling time
		wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial)).click();
	}

	
	//pollingEvery , ignoring, withMessage --> all coming from fluentWait. 
	//WebDriverWait using all FluentFeatures
	//polling time everything same in WebDriverWait and FluentWait both.
	
	//whatever achieve with FluentWait ,can be achieved with WebDriverWait also. no difference
}
