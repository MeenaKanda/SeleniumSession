package SeleniumHW;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7PanelFooterLinks {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
/*		List<WebElement> footerImagesList = driver.findElements(By.xpath("//div[@class ='container']/div/div/ul/li/a"));
		
		System.out.println(footerImagesList.size());
		
		for(WebElement e : footerImagesList) {
			String imgVal = e.getText();
			System.out.println(imgVal);
		}*/
		
		
		// bY locator:
		By footerLinks = By.xpath("//div[@class ='container']/div/div/ul/li/a");
		
		List<String> footerVal = getElementTextList(footerLinks);
		System.out.println(footerVal);
		System.out.println(footerVal.contains("About Us"));  //true
		System.out.println(footerVal.contains("Returns"));   //true
		System.out.println(footerVal.contains("Brands"));    //true
		System.out.println(footerVal.contains("   My Account  "));  //false
		
		
	}

	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getElementTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String eleText = e.getText();
			eleTextList.add(eleText);
			
		}
		return eleTextList;
	}
}
