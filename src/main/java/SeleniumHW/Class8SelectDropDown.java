package SeleniumHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class8SelectDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		By country = By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select");

		Select select = new Select(driver.findElement(country));

//		List<WebElement> optionsList = selection.getOptions();
//		
//		System.out.println("size of DD country  : " + optionsList.size());
//		
//		for(WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}

/*		// 1.selectBy Index:
		select.selectByIndex(0);

		Thread.sleep(2000);
		// 2.selectByValue:
		select.selectByValue("ASM");

		Thread.sleep(2000);
		// 3.selectByVisibleValue
		select.selectByVisibleText("Indonesia");
		*/
		
/*		doSelectDropDownByIndex(country, 0);
		Thread.sleep(2000);
		doSelectDropDownByValue(country, "AND");
		Thread.sleep(2000);
		doSelectDropDownByVisibleText(country, "Brazil");
		
*/
		System.out.println("------------------------------------");
		
		//only for one element
		System.out.println(getSelectDropDownOptionsTextList(country).contains("Australia"));
		System.out.println(getSelectDropDownOptionsTextList(country).contains("Bahamas"));
		
		//for more element
		List<String> arrayVal = Arrays.asList("Australia", "Bahamas", "India");
		if(getSelectDropDownOptionsTextList(country).containsAll(arrayVal)) {
			System.out.println("all elements present PASS");
		}
		
		//
		System.out.println(getTotalDropDownOptions(country));
		
		selectDropDownValue(country, "Canada");
		
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

	public static List<WebElement>  getSelectDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static List<String> getSelectDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getSelectDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for(WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);	
		}
		return optionsTextList;
	}
	
	
	public static void selectDropDownValue(By locator, String expVal) {
		List<WebElement> optionsList = getSelectDropDownOptionsList(locator);
		for(WebElement e : optionsList) {
			String text = e.getText();
			if(text.equals(expVal)) {
				e.click();
				break;
			}
		}
	}
	
	public static int getTotalDropDownOptions(By locator) {
		int optionsCount = getSelectDropDownOptionsList(locator).size();
		System.out.println("total count ==>" + optionsCount);
		return optionsCount;
	}
	
	
	
	
	
	
	
	
	
	
}