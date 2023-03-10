package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By continueBtn = By.cssSelector("input[type='submit']");
		
		Actions act = new Actions(driver);
		
//		act.sendKeys(args);  
		act.sendKeys(driver.findElement(fn), "meena").build().perform();
	    act.sendKeys(driver.findElement(ln), "kanda").build().perform();
	    act.click(driver.findElement(continueBtn)).build().perform();
		
	    //ElementNotINteractableException - element is there on the page but not able to interact.
	    //when we open the application chat box is coming. this chatbox overlapping/blocking the element where selenium have to interact.
	    //in such case selenium not able to interact with the element so throw exception.
	    //some time page is not maximize so selenium not able to see/interact/find the specific element where it has to interact.
	    
	    ////ElementNotINteractableException  -> can be handle by Actions class or java Script Executor
	    
	    
	    //ElementNotInterceptedException
	    //in such case we can use Action class.
	    //SendKeys in Action class mouse will go to element click first then action(enter value) will happen.so no exception happen in Action Class.
	    //In normal type no click on element just send value only.so exception coming in this type.
		
//	    doActionsSeneKeys(fn, "meena");
//	    doActionsSeneKeys(ln, "kanda");
//	    doActionsClick(continueBtn);
//	    
	    
	    
	}

	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSeneKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	
	
	
	
}
// SendKeys in Actions class -> Equivalent to calling: Actions.click(element).sendKeys(keysToSend).
//Click() in Actions Class-> Clicks in the middle of the given element. Equivalent to: Actions.moveToElement(onElement).click()

//sendkeys() method are overloaded:
// 1. act.sendKeys()  ---> Sends keys to the active element
//active element -> when we launch the application curser is blanking on the element of the page is called active element
//but no guarantee curser will blink on the element 

//2.act.sendKeys(WebElement,keys)  -> we have to pass webelement where to enter value. 
//act.sendKeys() -> sendkeys here is Actions class sendkeys




