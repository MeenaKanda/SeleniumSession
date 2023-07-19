package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollIntoViewConcept {
	
	//scroll down until element which we pass is found.
	//if you want to go some session on the page , we can use this method ,the stop scrolling and interact with the element.

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Best Sellers in Books']"));
		
	//	JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
	//	jsUtil.scrollIntoView(ele);
		
		//different way of clicking :
		//1.normal click  --- click on UI --click on middle of the element
		//2.Actions class click -- move to element -- click on middle of the element
		//3.js click  -- click from DOM
		
		

	//    WebElement registry = driver.findElement(By.linkText("Registry"));
	//    jsUtil.clickElementByJS(registry);
	    
	    
//	    Actions act = new Actions(driver);
	    WebElement registry = driver.findElement(By.linkText("Registry"));
//	    act.moveToElement(registry).click().build().perform();
	    
	    registry.click();
	    
	}

}

