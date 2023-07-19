package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
     
	//ChromeDriver -> Selenium created this class
	
	
	public static void main(String[] args) {
		
		//1. open browser: chrome, ff
//		ChromeDriver driver = new ChromeDriver();  
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FireFoxDriver();
		
//		String browser = null; //NullPointerException
		
		String browser = "firefox";
		WebDriver driver = null;
		
		//cross browser logic:
//		if(browser.equals("chrome")) {
//			driver = new ChromeDriver();
//		}
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
     	else if(browser.equals("firefox")) {
    	driver = new FirefoxDriver();
		}
//		else if(browser.equals("safari")) {
//			driver = new SafariDriver();
//		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("plz pass the right browser...." + browser);
		}
			
		
		//2. enter url:
//		driver.get("http://www.google.com");  //correct //http is a protocol
//		driver.get("www.google.com");  //org.openqa.selenium.InvalidArgumentException
		driver.get("https://google.com");   //correct  //return void

		
		//3. get the title:
		String actTitle = driver.getTitle();
		System.out.println("page title : " + actTitle);
		
		
		//validation point/checkpoint:
		if(actTitle.equals("Google")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
	
		
//		driver.close();
		driver.quit();  
		
		
	}

}
