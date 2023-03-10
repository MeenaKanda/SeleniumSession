package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //DOM V1/webeleId1

		WebElement fn = driver.findElement(By.id("input-email"));  //v1
		
		fn.sendKeys("meenakshi123@gmail.com");  //v1
		
		driver.navigate().refresh();   // when refresh page both page and dom will get refreshed/updated.  // DOM v2
		
//		Thread.sleep(5000);
		
		fn = driver.findElement(By.id("input-email")); //v2 //webele Id2 //create new web element so staleException don't come.
		
 		fn.sendKeys("kanda123@gmail.com");  //fn=v1 //webId1 //StaleElementReferenceException
		//fn is previous version(v1) but latest version is v2. that why when so sendkeys action on fn it give staleException.
        //can not use same old fn here. in order to avoid we have to create new webElement after refresh.
 		
 			}

}

//after refresh the page dom loaded first the browser read the dom with the help of dom API. then page displayed 

//click, back, forward, refresh  --> staleElementRefException come. because of those 4 update the dom/element
//fluent element
//