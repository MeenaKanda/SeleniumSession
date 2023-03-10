package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	//sometime when we try to search in google . it gives you suggestion , and try to fetch complete list of all suggestions
	//suggestions are coming from server or browser? //browser can not store this informations.in browser internally create one SQL Query
	//select a star from suggestion table where key = naveen automation labs.one api will be called internally then it fetch the data from the server
	//from the data base and data base to webserver and webserver to the browser and the suggestions will be displayed.google server is super fast so we
	//get the result quickly.
	//Thread.sleep(3000);  --> is important here. or it dont load

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


//dyanamic xpath also there. see later.
