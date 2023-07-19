package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
      
public class ElementNotPresent {
        static WebDriver driver;
	public static void main(String[] args) {
		

	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//By locator:
//		By logoImage = By.className("img-responsive");
		By logoImage = By.className("img-responsive11111");  //deliberately make class name wrong  //this locator will not hit the server.
		//so it don't create exception.
		By search =  By.name("search");

		//create  WebElement + perform action
		boolean flagImg = driver.findElement(logoImage).isDisplayed();   //NoSuchElementException  //NSE
		System.out.println(flagImg);
		
	}

}

