package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//when you pass wrong xpath syntax/format of the locator:
//		driver.findElement(By.xpath("//////input[@@@id=@'name']")).sendKeys("testing");  //InvalidSelectorException
		
		
		//with correct syntax but wrong locator(did not find any element)
		driver.findElement(By.xpath("//input[@id='namemeena']")).sendKeys("testing");   //NoSuchElementException
		
		
		//NoAlertException : if alert is not there
		//NoFrameException: when no frame available but you still try to jump/switch into that frame
		//NoBrowserWindowException:
	}

}
