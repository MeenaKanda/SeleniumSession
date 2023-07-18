package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	//HTML -> HyperText Markup Language
//	WebElement->
	//1st browser - 2nd enter url - page will remain same for all browser.on the particualr page
	//WebElements in selenium(elements) - images, logo, text field, button,link, search field,menu links , icon,side links, footer links
	//in other tool it is call web objects.
	
	//By -> is a Abstract class which heip in locating element within the DOM //id -> is a locater pick it from the page.
	//DOM(document object model) - html page of entire page , have all each element of particular page in the form of html
	//<input , <img, <a -> is html tag
	//attributes(property) -> available in the form of key and value format // each attri have its own name and value
    //findElement() -> always return WebElement.store in webelement vari
	//WebElement -> Interface(I always non primitive type - String, class, Arrays, I) 
	
	static WebDriver driver;    //if it is non static we have to create obj to call. so make it static
	
	
	public static void main(String[] args) {
		
		//create a webelement(1st) + perform action(2nd)(click, senndkeys, gettext, isDisplayed....)(
		//create a webelement : need locator

	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen*123");
		
		
		//2nd:
//		WebElement emailId =  driver.findElement(By.id("input-email"));       //create webelement only, no action
//		WebElement password =  driver.findElement(By.id("input-password"));   // Webelement hit the server always.
//		
//		emailId.sendKeys("naveen@gmail.com");   //action
//		password.sendKeys("naveen@123");
		
		
		//3rd: By locator
//		By emailId = By.id("input-email");     //they are By locator //By.id will not hit the server //By locator will not hit the server.
//		By password = By.id("input-password");   //0 time hitting server
//		
//		WebElement eId = driver.findElement(emailId);   //fe -> always hit the server
//		WebElement pwd = driver.findElement(password);  //2 time hit server
//		
//		eId.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");
		
		
		//4th: By locator + generic method for webelement
//		By emailId = By.id("input-email");    
//		By password = By.id("input-password")
//	
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("naveen@123");
		
		
		//5th: By locator + generic methods for webelement and actions
//		By emailId = By.id("input-email");     //they are By locator //By.id will not hit the server
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "naveen@123");
		
		
		//6th: By locator + generic methods for webelement and actions in a ElementUtil class
		By emailId = By.id("input-email");    
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(password, "naveen@123");
	}

	public static WebElement getElement(By locator) {    //driver.fe we write only once even if we write for 100 by locator.//reusability
	    return	driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {   //fe and sendKeys method created only once
		getElement(locator).sendKeys(value);
	}
	
	// doSendKeys method can be used only inside the class, other dev can not use from outside class. so create this method in utility class (ElementUtil) for everyone access.
}

//DOM => Document Object Model
