package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {
	
	//if you want to get links or images from particular panel (not from whole page ) you have to create xpath locator. 

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
/*		List<WebElement> panelLinksList = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
	
		System.out.println(panelLinksList.size());
		
		for(WebElement e : panelLinksList) {
			String text = e.getText();
			System.out.println(text);
		}*/
	
		By rightPanelLinks = By.xpath("//aside[@id='column-right']//a");
	    List<String> rightElesList = getElementsTextList(rightPanelLinks);
	    System.out.println(rightElesList);
	    System.out.println(rightElesList.contains("Login"));    //true  //contains method return boolean
	    System.out.println(rightElesList.contains("Wish List")); //true
	    System.out.println(rightElesList.contains("Newsletter")); //true
	
	}
	
	//Selenium have no method available which give List of String(List<String>). it always give List<WebElement> with the help of driver.findElements
    //that why we have create list of sting and store string value in to the ArrayList.
	public static List<String> getElementsTextList(By locator) {
		
		List<String> eleTextList = new ArrayList<String>();  //initially size=0
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
