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
		//FE method throw NoSuchElementException on line 21 .not isDisplayed()
		//driver.findElement(logoImage) -> throw exception because of incorrect locator. not isDisplayed()
	    //mouse over to findElement you will see exception.
	}

}




// 1.what if element is not displayed?
//If ElementNotPresent -> means may be my locator is wrong or bug in the application.(could be script or bug in app)

// 2. do we have ElementNotFoundException in selenium? No exception like that.only NoSuchElementException in selenium.

//NoSuchElementException -> thrown either you give wrong locator or bug in the application(giving right locator but element (search) is not available on the page).
//in both case findelement() method only throw exception . isdisplayed() method don't throw exception in both case.