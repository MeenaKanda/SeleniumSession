package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextField {
	
	//gettext() -> method works those element which have text already available inside the dom
	//gettext method-> will not work for text field.it will not capture text of the text field entered.so in order to get value entered in text field
	//we have to use getAttribute(value) method to get value entered in text field.

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement fn = driver.findElement(By.id("input-firstname"));
		fn.sendKeys("naveenautomationlabs");
		
//		String name = fn.getText();  //gettext() will not get value entered in text field.  //dont use
//		System.out.println(name);   // it give blank space. 
//		
		
		String name = fn.getAttribute("value");  //getAttribute() helps to get value entered by passing attribute
		System.out.println(name);   //naveenautomationlabs
		
		WebElement ln = driver.findElement(By.id("input-lastname"));
		ln.sendKeys(null);      //java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
		
		
	}

}
