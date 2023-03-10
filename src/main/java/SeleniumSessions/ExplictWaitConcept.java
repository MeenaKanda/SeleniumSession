package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitConcept {
    static WebDriver driver;
	
    public static void main(String[] args) {
	    driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		    
	//    By emailId = By.id("input-email111111111"); //if you give wrong locator it wait for 10 secs and raise TimeoutException and nosuchelement exception
	    By emailId = By.id("input-email");
	    By password = By.id("input-password");
	    By loginBtn = By.xpath("//input[@value='Login']");
	    
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // sele 4.x
//	    WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));  //until method returning webelement
//	    email_ele.sendKeys("test@gmail.com"); // enter value without using findelement
	  
	    //explict wait we appled only for email id . no need to apply implicitwait for password and click. if username loaded on the page
	    //automatically password and click element also loaded. so no need to wait unnecessarily for both.
	    
	    waitForElementPresence(emailId, 10).sendKeys("testing@gmail.com");
	    getElement(password).sendKeys("test@123");
	    getElement(loginBtn).click();
	
	}
    
    
   
    
    
    public static WebElement waitForElementPresence(By locator, int timeOut) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));  // sele 4.x
	    return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    
    public static WebElement waitForElementVisible(By locator, int timeOut) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));  // sele 4.x
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
}

//WEbDriverWait --> is a class and have 3 constructor
//Duration --> is a class. timeout with the help of duration class
//untill method coming from fluent class
//until()-> coming from wait I and overridden by fluent class and inherited in Webdriverwait class


//presenceOfElementLocated ---> An expectation for checking that an element is present on the DOM of a page. This does not necessarily mean that the element is visible.
//so it will not give 100% accurate correct result.

//visiblilityOfElementLocate--> An expectation for checking that an element is present on the DOM of a page and visible.Visibility means that the element is not only displayed but also has
//a height and width that is greater than 0.

//presenceOfElementLocated check element inside dom only
//visibilityOfElementLocated check element inside dom and also page. 

//from both we prefer visibility of element
