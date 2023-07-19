package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionWithFEs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.freshworks.com/");
		driver.get("https://www.freshworks.com/security/");
		
		List<WebElement> linksList = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));  //v1
		
		for(int i=0; i<linksList.size(); i++) {
			System.out.println(linksList.get(i).getText());
			linksList.get(i).click();  //v1 the moment click the page will be refreshed,dom is updated.
			//in order to avoid stale create new webelement which is update every time/cycle.
			//v2 -dom
			//v3 dom
			//v4-dom
			driver.navigate().back();
			Thread.sleep(2000);
			
			 linksList = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a")); //v2 v3 v4
		}
		

/*			WebDriver driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
			List<WebElement> linksList = driver.findElements(By.xpath("//footer//a"));
			
			for(int i=0; i<linksList.size(); i++) {
				System.out.println(linksList.get(i).getText());
				linksList.get(i).click();
				driver.navigate().back();
				Thread.sleep(2000);
				
			linksList = driver.findElements(By.xpath("//footer//a"));
		
	           }*/
		
	
	}
}
