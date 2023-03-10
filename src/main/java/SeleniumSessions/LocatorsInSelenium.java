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
	
		//getText use cases : links, headers, paragraph, footer (whenever there is a text getText() works)
		//click: button, checkboxes, radiobutton, images,links, fileupload
		
		
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



//1.id : always different for each and every element on the page

//2.name: can be duplicate ex: same page have 2 login button may have same name. so prefer id compare to name.

//3.class: ex:form-control input-eg-> this class have 2 classes separated by space
//more than 1 element can have same class name. so we execute it enter the value on the top element.don't enter exact place that we think.
//enter from top to bottom order.eg: search, firstname , lastname,emailaddress all have same class name.
//purpose of class is:UI dev do graphical representation of all element look exactly same(len,hight,width,color,font size ) because of same class.
//UI dev create common class for all element in the ui point of view. these common class attached to an element so that elements look exactly same.

//preference from id,name,class -> first id , second name, last class

//4. all element dont have id, name, class . in that case use xpath
//xpath internally using id only


// 5.css is slighty faster than xpath and better performance.
//css also internally using id only

//never compare attributes with xpath and css. compare only b/w xpath and css

// 6. linktext : first we have to identify whether it is link or not( should have <a anker tag)
//some time it is look like link but it have <b in html. some time it look like a button but it is link.
//so always check in html .
//link-> every link have text of an element. text is not a attribute.
//link -> id,name,class not available. either we use xpath,css, or text.
//linkText -> can be duplicate. so if id is available we will pick id not text . but for link mostly dev don't provide id.
//ex: on the same page we can have same Text for more than 1 element. so priority goes to top duplicate element one on the page


//7. partialLinkText -> only for link. good application don't have long text. if they are long use partiallinkText.whole link look ugly if you write.
//linkText and partialLinkText -> linkText is better than partialLinkText. 

//<a - link
//<h2 - header
//<b  - button
//<p  - paragraph
//< head - header
//<img - image
//<div - division
//<i - 
//input -
//<small - 


// 1. what are different ways of creating WebElement?
//we have method driver.findElement and we have 8 locator stratagy are there. 

