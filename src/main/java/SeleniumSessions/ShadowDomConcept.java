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
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")\r\n"
//				+ "<input type=​\"text\" id=​\"pizza\" placeholder=​\"Enter pizza name\">​");   //create this js query in console //right click the element copy js path and past in console 
		//it return browser ele we need webelement.so convert them into webelement
		
		WebElement pizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");   
	
	//	webelement need to be interacted with selenium and have to enter the value over .browser element can not do that so we convert them into webele
	
	    pizza.sendKeys("veg pizza");
	    
	    
	}

}
