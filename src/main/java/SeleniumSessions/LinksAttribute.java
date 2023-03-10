package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		driver.findElements(By.tagName("a"));
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
/*		List<WebElement> linksList = getElements(links);
		System.out.println("total links : " + linksList.size());
		
		int count = 0;
		for(WebElement e : linksList) {
			
			String hrefVal = e.getAttribute("href");   
			String linkText = e.getText();
			
			System.out.println(count + " ::::::: " + hrefVal + "=======> " + linkText);
			count++;
		}*/
		
		//hrefval -> if we copy and past the link in website it take you to the site.
		//it is called web scraping_> means we are scraping a date from amazon application
        //as a tester we validate. but real time scraping developer scrap the date from selenium tool and give the particular data
		// to the machine learning team(ML). here they fetch price from one site amazon and compare price with other shop walmart.
	
	   
/*		List<WebElement> imagesList = getElements(images);
		System.out.println("total images : " + imagesList.size());
		
		for(WebElement e : imagesList) {
			String srcVal = e.getAttribute("src");
			System.out.println(srcVal);
		}*/
		
		getElementAttributes(images, "src");
		getElementAttributes(links, "href");
	
	}
	
	public static void getElementAttributes(By locator, String value) {
		List<WebElement> eleList = getElements(locator);
		
		for(WebElement e : eleList) {
			String attrVal = e.getAttribute(value);
			System.out.println(attrVal);
		}
	
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}


//href -> if we click the link on website it will take you to the link site


//img -> don't have text