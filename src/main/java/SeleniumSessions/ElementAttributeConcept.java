 package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	
	//getAttribute() -> get the value of given attribute. it return String 
	

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String ph = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//	    System.out.println(ph);
//		
//        String ph1 = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//	    System.out.println(ph1);
//	
//        String ph2 = driver.findElement(By.id("input-firstname")).getAttribute("name");
//	    System.out.println(ph2);
//	    
//	    
//	    String srcVal =  driver.findElement(By.className("img-responsive")).getAttribute("src");
//	    String titleVal = driver.findElement(By.className("img-responsive")).getAttribute("title");
//	
//	    System.out.println(srcVal + " -----> " + titleVal);
	    
		
		By fn = By.name("firstname");
		By logo = By.className("img-responsive");
		
		String ph = getElementAttribute(fn, "placeholder");
		String srcVal = getElementAttribute(logo, "src");
		String titleVal = getElementAttribute(logo, "title");
		
		System.out.println(ph);
		System.out.println(srcVal);
		System.out.println(titleVal);
		
		
	    
	    
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementAttribute(By locator, String attrName) {
		 return getElement(locator).getAttribute(attrName);
		}
}
