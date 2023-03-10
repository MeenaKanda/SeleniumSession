package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

/*		By country = By.id("Form_getForm_Country");
		
		Select select = new Select(driver.findElement(country));
		
		List<WebElement> countryList = select.getOptions();
		System.out.println(countryList.size() -1);   //-1 added because country also included in the dropdown list
     
		for(WebElement e : countryList) {
			
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Brazil")) {
				e.click();
				break;   //break is used so it will not go to remaining country for check unnecessarily after find exact country name.
			}
		}
     */
		
		By country = By.id("Form_getForm_Country");
		
/*		if(getTotalDropDownOptions(country)-1 == 232) {
			System.out.println("country drop down count is correct");
		}
		
		//Check only one country:
		if(getDropDownOptionsTextList(country).contains("India")){
			System.out.println("India is present");
		}
		
		//when you check multiple values: create list of array and pass it 
		List<String> expCountryList = Arrays.asList("India", "Brazil", "Belgium" );
		if(getDropDownOptionsTextList(country).containsAll(expCountryList)) {
			System.out.println("PASS");
		}
	*/
		
		selectDropDownValue(country, "North Korea");
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for(WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	// if the normal 3 method not working we can use this method also. but this one little slower than other 3 methods.
	public static void selectDropDownValue(By locator, String expValue) {
		List<WebElement> optionsList =getDropDownOptionsList(locator);
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}
	
	
	public static int getTotalDropDownOptions(By locator) {
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("total options ==> " + optionsCount);
		return optionsCount;
	}
	
	
	
	
	
	
	
	
	
	
	
//	public static int getTotalDropDownOptions(By locator) {
//		Select select = new Select(getElement(locator));
//		List<WebElement> optionsList = select.getOptions();
//		return optionsList.size();
//	}
//	
	
	
}

//select.getOptions();=>  it give all options(which is available in dropdown) belonging to this select tag
//getOption() -> used in Selection class.