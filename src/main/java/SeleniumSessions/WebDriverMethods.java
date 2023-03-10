package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com");
	
	    
	    driver.manage().window().maximize();   //this is not a builder pattern
//	    driver.manage().window().fullscreen();
//	    driver.manage().window().minimize();
	    
	   
	    
	    driver.manage().deleteAllCookies();  
	    
	    String url = driver.getCurrentUrl();
	    System.out.println("current url : " + url);
	    
	    if(url.contains("Amazon.com")) {
	    	System.out.println("PASS");
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    
	
	    
	   String pgSrc =  driver.getPageSource();
	   System.out.println(pgSrc);   //entire pagesource will print on the console
	   if(pgSrc.contains("Footer")) {
		   System.out.println("PASS");
	   }
	
	   
	   driver.quit();
	   
	   
	}
	
	
	

}
