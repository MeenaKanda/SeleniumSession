package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		Thread.sleep(3000);

		//it give wrong answer 22 because of xpath 
//		List<WebElement> suggList = driver.findElements(By.xpath("//li[@role='presentation']//span"));
//        System.out.println(suggList.size());  //22
	
		//this is correct path
 /*   	List<WebElement> suggList = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span"));
        System.out.println(suggList.size());   //11
	
	    for(WebElement e : suggList) {
	    	String text = e.getText();
	    	System.out.println(text);
	    	if(text.contains("naveen automationlabs telegram")) {   // or equal()
	     		e.click();
	    		break;
	    	}
	    }*/
	
	    By googleSuggListLocator = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
	
	    doSearch(googleSuggListLocator,"naveen automation labs github" );		
	}
	
	public static void doSearch(By suggListlocator, String suggName) {
		List<WebElement> suggList = driver.findElements(suggListlocator);
        System.out.println(suggList.size());   //11
	
	    for(WebElement e : suggList) {
	    	String text = e.getText();
	    	if(text.length()>0) {
	    	System.out.println(text);
	    	}
	    	if(text.contains(suggName)) {   // or equal()
	    		e.click();
	    		break;
	    	}
	    }
	}
}



