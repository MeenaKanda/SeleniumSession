package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	// HeadLessBrowser : browser is launched but not visible
	// running testcases in the headless - testing is happening behind the scene
	// faster than normal  browser mode
	//execution happening behind the scence . so it will not disturb our work.
	
	//sanity test cases we use it work
	//if there are so many navigation headless mode might not work.
    // for the complex html dom - it might not work
	//dont prefer. it is not at all user requirement.
	//headless just to minimize the time to closing
	
	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions(); // this class is responsible for run chrome in headless
//		co.setHeadless(true);
		co.setHeadless(false); //false means it run in the normal mode.
//		co.addArguments("--headless");
//		co.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(co); // we have to pass co to run chrome in headless mode.
		driver.get("https://naveenautomationlabs.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        driver.quit();
        
       
	
	
	}

}

//co.setHeadless -> returns boolean
//ChromeOptions -> is a class from selenium

//incognite -> whatever you navigating it will not maintain history.
//it can be used by user where it dont maintain history.