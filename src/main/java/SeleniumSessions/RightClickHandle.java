package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
//		act.contextClick().build().perform();  // here not passing any element //right click the current mouse location.
	    // by default we we launch the browser with selenium , mouse is always in the left corner (0 0) location.
		//we want to right click on the specific element so pass element in contentClick()
		
//		act.contextClick(ele).build().perform();  // it right click exact element 

		
		List<WebElement> rightEle = driver.findElements(By.cssSelector("ul.context-menu-list span"));
	    System.out.println(rightEle.size());
	    
	    for(WebElement e : rightEle) {
	    	String text = e.getText();
	    	System.out.println(text);
	    	if(text.equals("Copy")) {
	    		e.click();
	    	Alert alert = driver.switchTo().alert();
	    	System.out.println(alert.getText());
	    	alert.accept();
	    		break;
	    	}
	    }
	
	}

}

