package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//sometime when launch the application =>page is loading and title is not immediately available on that page. in that case case we use implicit wait. explicit wait don't work.
	    
      
		driver = new ChromeDriver();
	
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    
	    driver.findElement(By.linkText("Forgotten Password")).click();
	    
//	    System.out.println(driver.getTitle()); // loading.....checking...... because of loading and checking
	    //title may not be available so that time we have to apply wait 
	    
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	    wait.until(ExpectedConditions.titleContains("Password?"));   //until return boolean
//	    System.out.println(driver.getTitle());   //fetching the title after wait.
		
	    
//	    String title = waitForTitleContainsAndFetch(10, "Password?1111"); //if we pass wrong title it give you TimeOutException
	    String title = waitForTitleContainsAndFetch(10, "Password?");
	    if(title.contains("Forgot Your Password?")) {
	    	System.out.println("PASS");
	    }
	    
	    
	 
	    
	    //
	    driver.navigate().to("https://www.amazon.com/");
	    driver.findElement(By.xpath("//span[text()='All deals']")).click();
	    
	    if(waitForURLContains(10, "amazon.com")) {
	    	System.out.println("URL is correct");
	    }
	    else {
	    	System.out.println("URL is in-correct");
	    }
	    
	    
	}

	
	public static String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue) {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		    wait.until(ExpectedConditions.titleContains(titleFractionValue));   //supply part of title
		    return driver.getTitle();
	}
	
	
	public static String waitForTitleAndFetch(int timeOut, String titleValue) {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		    wait.until(ExpectedConditions.titleIs(titleValue));     //supply full title here
		    return driver.getTitle();
	}
	
	public static String waitForURLContainsAndFetch(int timeOut, String urlFractionValue) {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		    wait.until(ExpectedConditions.urlContains(urlFractionValue)); //supply part of url
		    return driver.getTitle();
	}
	
	
	public static boolean waitForURLContains(int timeOut, String urlFractionValue) {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		  return wait.until(ExpectedConditions.urlContains(urlFractionValue));   //supply part of 
		  }
	
	
 
	public static String waitForURLAndFetch(int timeOut, String urlValue) {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		    wait.until(ExpectedConditions.urlToBe(urlValue));   //supply complete url
		    return driver.getTitle();
	}
	
	
}


