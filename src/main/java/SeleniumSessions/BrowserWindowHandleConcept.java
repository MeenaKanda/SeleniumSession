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
       Set<String> handles =  driver.getWindowHandles();  // it store window id of parent and child in  set. id in the form of string.
       //set is not index based so we can not fetch using index no. so we have to apply iterator
       //iterator()-> iterator generally used for collection those does not maintain order.
       //iterator can be used for index based also. generally used for non-index based collection
       
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

// 1. which attribute is responsible for link open in a new tab/ new browser window/ new browser pop up?
// ans: target="_blank" is responsible.
// this new open tab have its own url,title
//as a qa guys, we are not responsible for new open tab.just check the url, title correct or not.


// driver.getWindowHandles(); -> this give unique windowId and return Set<String>

//Set:
// 1. set does not maintain order.
// 2. can not have duplicate value
// 3. no index .


// why  parent windowId always store in first place and child window id store next in the order of click.
// driver always launch first in parent window and traversing to child. driver.getWindowHandles() take care of it.
// that's why when use driver.next() first time always get parent id 

//driver.close() -> it will close current window only
// driver.quit(); -> it will close all open child and parent windows.

//defaultcontent -> works on the frame(multiple frame) which is on the same page.
