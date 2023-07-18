package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithouSelect {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

		By country = By.id("Form_getForm_Country");
		By options = By.xpath("//select[@name='Country']/option");  //we can use xpath to select get all dropdown option instead of using Select Class.
		
//		List<WebElement> optionsList =driver.findElements(country);   //we can't use this.count of the optionsList =1. 
 /*		List<WebElement> optionsList = driver.findElements(options);
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			    if(text.equals("India")) {
			    	e.click();
			    	break;
			    }
		}
		*/
		
	//	selectDropDownValueWithNoSelection(options, "India");
		
		System.out.println(getDropDownOptionsListWithNoSelection(options));
		System.out.println(getDropDownOptionsListWithNoSelection(options).contains("Brazil"));
		System.out.println(getDropDownOptionsListWithNoSelection(options).contains("India"));
	
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void selectDropDownValueWithNoSelection(By locator, String expValue) {
		 List<WebElement> optionsList = getElements(locator);
		 
		 for(WebElement e : optionsList) {
			 String text = e.getText();
			 System.out.println(text);
			      if(text.equals(expValue)) {
			    	  e.click();
			    	  break;
			      } 	  
	          }
		}
	
	public static List<String> getDropDownOptionsListWithNoSelection(By locator) {
		List<WebElement> optionsList = getElements(locator);
		List<String> optionsTextList = new ArrayList<String>();

		for(WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
}
