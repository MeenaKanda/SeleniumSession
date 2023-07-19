package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {
	
//	Select DropDown/DropBox  

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

	//	By country = By.id("Form_getForm_Country");
		
		//dropdown--htmltag should be ==> <select>
		//so use Select class in Selenium
		
/*		WebElement country_ele = driver.findElement(country);
//		Select select = new Select();  // in Select class default const.. not available
		Select select = new Select(country_ele);  //for Select class we have to pass WebElement as a parameter.
		
		// 1. selectByIndex : if 2 more country added in future the index no will be changed. so not preferred in that case
//		select.selectByIndex(5);
		
		// 2. selectByValue 
		select.selectByValue("Belgium");  //value attribute
		
		// 3. selectByVisibleText
		select.selectByVisibleText("India"); //text of the option  //if the value attribute (2nd option) not available, pick visiblet
		*/
		
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country, 5);
		Thread.sleep(2000);
		doSelectDropDownByValue(country, "Belgium");
		Thread.sleep(2000);
		doSelectDropDownByVisibleText(country, "India");
		
		
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
}



