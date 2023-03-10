package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5LocatorInSelenium {

	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
	}
	
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	    //By locators:
	    By firstName = By.id("input-firstname");
	    By lastName = By.id("input-lastname");
	    By email    = By.name("email");
	    By telephone = By.xpath("//*[@id=\"input-telephone\"]");
	    By password = By.cssSelector("#input-password");
	    By conPassword = By.xpath("//*[@id=\"input-confirm\"]");
	    By agree = By.name("agree");
	    By continueButton = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
	    
	    By header = By.cssSelector("#content > h1");
	    By orderHistory = By.linkText("Order History");
	    
	    doSendKeys(firstName, "Meenakshi");
	    doSendKeys(lastName, "Kandaswamy");
	    doSendKeys(email, "meena12 @gmail.com");
	    doSendKeys(telephone, "123456789");
	    doSendKeys(password, "meena123!");
	    doSendKeys(conPassword, "meena123!");
	    doClick(agree);
	    doClick(continueButton);
	    
	   String val = doElementGetText(header);
	   System.out.println(val);
	   
	   doClick(orderHistory);
	    
	}

	
	
	
}
