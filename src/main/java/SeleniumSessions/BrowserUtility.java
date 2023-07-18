package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {

	 //utility class -> create a generic method so anyone can use that for their application.
	//use those utility whenever needed. it work for any kind of applications.no need to write a code again and again unnecessarily.
	//reusability 
	
	//don,t have main method(because others should use those methods from outside)
	
//	public WebDriver driver;    //default value of driver is null.because it is non-pri data type//any action on this give you nullponterException
	//if it is public any one can able to access it from outside of class .so it give you nullpointeException . to avoid this make it private.
	
	private WebDriver driver;
	
	//whenever you create a utility method we have to provide documentation also
	// to create a documentation:  /** then press enter
	
	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * @param browserName
	 * @return  This returns the specific browser driver
	 */  
	
	
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is : " + browserName);
	
	
	switch (browserName.toLowerCase().trim()) {
	case "chrome":
		driver = new ChromeDriver();
		break;
	case "edge":
		driver = new EdgeDriver();
		break;
	case "firefox":
		driver = new FirefoxDriver();
		break;
	
	default:
		System.out.println("please pass the right browser......" + browserName);
		break;
	}
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	return driver;
	}
	

	
	
	
	
	//driver.get(url);using selenium method , by using  selenium method internally we creater our own custom method launchURL
	// it give better functionality.
	//wrapper method(launchURL) on top of selenium method
	//https://www.amazon.com
	public void launchURL(String url) {
		
		if(url == null) {
			System.out.println("url can not be null");
		}
	
		else if(url.indexOf("https") == 0) {      //url.contains("http")
			driver.get(url);
		}
	}
	
	
	public String getPageTitle() {
		
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		return title;
	}
	
	
	public String getPageURL() {
		
		String url = driver.getCurrentUrl();
		System.out.println("page current url : " + url);
		return url;
	}
	
	
	public void closeBrowser() {   //wrap on top of selenium method
		if(driver != null) {
			driver.close();
		}
	}
	
	public void quitBrowser() {    //wrapper function  //user call the wrapper method which internally use selenium method
		if(driver != null) {       //if driver == null , driver.quit(); give nullPointerException
			driver.quit();      //internally using selenium mehtod
		}
	}
	
	
}
