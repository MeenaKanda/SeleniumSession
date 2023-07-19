package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {
	
	// target="_blank" -? because of this this link will be open in a new tab

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
		
        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        
        // 1. get the window ids:
       Set<String> handles =  driver.getWindowHandles();  
       Iterator<String> it =handles.iterator();
       //it will pointing just above the memory location of set object(handles). set don't have index so we move locator to  next
  
       String parentWindowId = it.next();
       System.out.println("parent window id : " + parentWindowId);
       
       String childWindowId = it.next();
       System.out.println("child window id : " + childWindowId);
       
       //driver is in parent window now so we have to switch to child window
       //   driver.switchTo().window(String nameOrHandle);
       
       // 2. switching to window:
       driver.switchTo().window(childWindowId);  //supply the window id for switching
       System.out.println("child window url : " + driver.getCurrentUrl());
       
       driver.close();  //use close for closing child window.
       //after closing child window driver is lost. so we have to switch driver to parent window.
       
       driver.switchTo().window(parentWindowId);
       System.out.println("parent window url : " + driver.getCurrentUrl());
       driver.quit(); // use quit for closing parent window
       
      
       
	}

}

