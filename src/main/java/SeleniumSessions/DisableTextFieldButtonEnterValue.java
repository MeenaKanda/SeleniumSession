package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextFieldButtonEnterValue {

	public static void main(String[] args) throws InterruptedException {
		
		// 1.Enter value in disable text field:
/*		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		//password field is disable:
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("meena@123");   // org.openqa.selenium.ElementNotInteractableException: element not interactable
		
*/
		
		// 2. Enter click on disable button:
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		Thread.sleep(5000);
		
		WebElement submit_btn = driver.findElement(By.id("submitButton"));
		
		String disabelText = submit_btn.getAttribute("disabled");
		System.out.println(disabelText);  //true
		
		submit_btn.click();  //org.openqa.selenium.ElementClickInterceptedException
		
		
		
		
	
	
	
	
	}

}
