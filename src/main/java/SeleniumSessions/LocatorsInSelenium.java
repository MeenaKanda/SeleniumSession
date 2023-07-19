package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	
	//how many locators are in selenium?  
	//8 locators : id, name, classname, xpath, css selector, linkText, partiallinktext, tagname.
	

	static WebDriver driver;

	public static void main(String[] args) {

		// create a webelement(1st) + perform action(2nd)(click, senndkeys, gettext,
		// isDisplayed....)(
		// create a webelement : need locator

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
		// 1.id - unique attributes
	//	driver.findElement(By.id("input-email")).sendKeys("meena123@gmail.com");
	
		// 2.name: is not unique attribute
	//	driver.findElement(By.name("email")).sendKeys("meena134@gmail.com");
		
	//	By emailId = By.name("email");
	//	driver.findElement(emailId).sendKeys("meena113@gmail.com");

		//3. class name: is not unique attribute.can be duplicate most of the time - not recommended if it duplicate
		//use class name only if it is unique
//		driver.findElement(By.className("form-control")).sendKeys("meena123@gmail.com");  //enter into search field
	
	   //4. xpath: its is not an attribute. its the address of the element in HTML DOM
/*	   driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("meena123@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("meena123!");
	   driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();
	*/
	
/*	  By emailId = By.xpath("//*[@id=\"input-email\"]");
	  By password = By.xpath("//*[@id=\"input-password\"]");
	  By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
	
	 doSendKeys(emailId, "meena123@gmail.com");
	 doSendKeys(password, "meena123");
	 doClick(loginBtn);
	 */
		
	//5. css selector : its not an attribute
/*		driver.findElement(By.cssSelector("#input-email")).sendKeys("meena123@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("meena123");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input.btn.btn-primary")).click();
		*/
		
		//By locator : css selector
/*		By emailId = By.cssSelector("#input-email");
		By password = By.cssSelector("#input-password");
		By loginBtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input.btn.btn-primary");
		
		doSendKeys(emailId, "meena123@gmail.com");
		doSendKeys(password, "meena123");
		doClick(loginBtn);
		*/
	
		//6. linkText: only for links --> htmltag of linkText is = a
		//LinkText can be duplicate. its not an attribute. its the text of the link.
		
//		driver.findElement(By.linkText("Register")).click();
/*		By registerLink = By.linkText("Register");
		doClick(registerLink);
		*/
		
		
		//7. partialLinkText: only for links. 
		//partialLinkText can be duplicate. its not an attribute. its the text of the link.
		//Forgotten password
		//Forgotten UserId
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		//8. tagName: htmltag (only for special case we use)
		//tagName can be duplicate.
		//getText() -> give visible text of an element.
		
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
/*		By header1 = By.tagName("h2");
		String headerName = doElementGetText(header1);
		System.out.println(headerName);
		*/
		
		//using css selector:
//		String header2 = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > h2")).getText();
//	    System.out.println(header2);  
	
		//getText work whenever element having text.
		//getText use cases : links, headers, paragraph, footer (whenever there is a text getText() works)
		//click: button, checkboxes, radiobutton, images,links, fileupload
		//sendKeys use cases : textbox/textfield, dropdown, fileupload
		
		
/*		By payment = By.linkText("Recurring payments");
		String val = doElementGetText(payment);
		System.out.println(val);  //Recurring payments
		*/
		
	}

public static WebElement getElement(By locator) {
	return driver.findElement(locator);
}

public static void doClick(By locator) {
	getElement(locator).click();
}

public static void doSendKeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}

public static String doElementGetText(By locator) {
	return getElement(locator).getText(); 
}

}

