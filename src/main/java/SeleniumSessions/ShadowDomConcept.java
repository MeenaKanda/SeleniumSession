package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
		
//		driver.findElement(By.id("pizza")).sendKeys("veg pizza"); // this one don't work
		
		//browser -> browser have page -> on the page shadowDOM element available-> under shadowDom one more shadowDom is availabel
		//inside 2nd shadowDOM input element is available. this input element directly not available on the page.
		//input available under shadowDom.
		//we can not switch to shadowDOM like frame(driver.switchTo.frame()) in selenium.
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")\r\n"
//				+ "<input type=​\"text\" id=​\"pizza\" placeholder=​\"Enter pizza name\">​");   //create this js query in console //right click the element copy js path and past in console 
		//it return browser ele we need webelement.so convert them into webelement
		
		WebElement pizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");   
	
	//	webelement need to be interacted with selenium and have to enter the value over .browser element can not do that so we convert them into webele
	
	    pizza.sendKeys("veg pizza");
	    
	    
	    
	    
	}

}

//we can not use driver.findelemnt for shadowDom .so selenium is not a right choice if the application is full of shadowdom.
//in playwright it can not be very difficult like selenium. 
//we have to look the dom for checking the shadow dom.
//shadow root(open) - selenium able to automate. 
//shadow root(close) - can not automate by any tool , ask developer make it open to automate

//use case of shadow dom:
//date security, element security
//In banking application, financial application they put some important thing inside shadow dom.
