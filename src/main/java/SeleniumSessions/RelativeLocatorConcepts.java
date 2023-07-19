package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcepts {

	public static void main(String[] args) throws InterruptedException {
//new feature of selenium 4.X		
//		        above
//		     near  
//		 left     .   right
//		
//	        
//		        below
//	 
// from the base element(.) we have to go left right above below or near by element.
		// nearest ele -> it create 100 pixel of boundary. within the boundary it capture
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);
		
	    WebElement ele = driver.findElement(By.linkText("Laval, Canada"));
	    
//	    String rightIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele)).getText();  // call with method using class name
	    //the element tag p which is available right side of ele.
	 
	    String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();  
	    // we import the static method so we can use method without using class name
	    System.out.println(rightIndex);
		
	    
	    String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
	
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
	    System.out.println(aboveCity);
	    
	    String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
	    System.out.println(belowCity);
	    
	    String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
	    //nearest element(ele) of p is base only. doesn't matter who is nearest
	    System.out.println(nearCity);
	    
	    
	    String nearCity1 = driver.findElement(with(By.tagName("a")).near(ele)).getText();
	    System.out.println(nearCity1);
	
	}

}

