package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class NavigationConcepts {
	
	//-> <- or not webelement. they are browser element/buttons.
	//so -> <- there is no xpath,css, id name. 

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
//		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		
//		driver.navigate().to("https://www.amazon.com/");   // here it takes direct string
		driver.navigate().to(new URL("https://www.amazon.com/"));  //it take URL type of string
//		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();  //come back to google
		System.out.println(driver.getTitle());
		
		driver.navigate().forward(); //go to amazon again
		System.out.println(driver.getTitle());
		
		driver.navigate().back();  //come back to google
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh(); // used to refresh the page
		
		
		
			}

}

// 1. difference b/w get() and navigate().to() method
//both are synanyms
//to() method internally calling get() method which is implemented in remote webdriver class.
//to() and get() can maintain history .how to prove? we can do back and forward using get() and do()

//get() is not over loaded
//to() method is overloaded[to(URL url) and to(String url)].both to() methods internally calling get() method only and get() launching the url.

//who is launching url on the browser? ans: get() method

// we can launch the url using to() method also instead of get(). but method chaining happen[to() calling get()]. so performance little slow when use to().



