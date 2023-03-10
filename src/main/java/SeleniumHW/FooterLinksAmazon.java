package SeleniumHW;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksAmazon {

	static WebDriver driver;

	public static void main(String[] args) {
		
	
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> footerPanelLinks = driver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility']/ul/li/a"));
		
	/*	System.out.println("total no of footer links : " + footerPanelLinks.size());
		
		int count = 0;
		for(WebElement e : footerPanelLinks) {
			
			String footerLinks = e.getText();
			System.out.println(count + " :: footer links are : " + footerLinks);
			count++;
		}*/
		
		By fooLoctor = By.xpath("//div[@class='navFooterLinkCol navAccessibility']/ul/li/a");
		
		List<String> footerList = getElementsTextList(fooLoctor);
		System.out.println(footerList);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<String> textList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String strList = e.getText();
			textList.add(strList);
		}
		return textList;
	}
}



//div[@class='navFooterLinkCol navAccessibility']/ul/li/a