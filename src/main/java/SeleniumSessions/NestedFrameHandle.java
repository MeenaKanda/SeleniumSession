package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//nested iframes
		   //f1 -- have its own ele
		      //f2 -- have its own ele
		         //f3 -- have its own ele
		
/*		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("ABC");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("POR");

		driver.switchTo().parentFrame();  //sel4.x --f1
		driver.findElement(By.id("inp_val")).sendKeys("ABC--new");
		
		driver.switchTo().frame("pact2");  //f2
		driver.switchTo().frame("pact3");  //f3
		driver.findElement(By.id("glaf")).sendKeys("Meena");
		
//		driver.switchTo().defaultContent();  //take out of all frame  //main page
//		driver.findElement(By.id("inp_val")).sendKeys("ABC--456");  //so don't work
		
		driver.switchTo().parentFrame();  //f2
		driver.switchTo().parentFrame();  //f3
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("inp_val")).sendKeys("ABC--456");
		
		driver.switchTo().defaultContent();   //come back to main page
		//Selects either the first frame on the page, or the main document when a page containsiframes. 
		*/
//		
//		driver.switchTo().frame("pact1").switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("PQR");
		
		driver.switchTo().frame("pact1").switchTo().frame("pact2").findElement(By.id("jex")).sendKeys("PQR");
	
		}
}


// in sales force application we have nested frame more.

// f1 to f2  or  f2 to f3 directly -> possible
//f1 to f3 directly ---> not possible
//f3 to f2 or f2 to f1 directly -> possible using parentFrame()
//jump f3 to f1 directly --> not possible 

//can not enter value directly into f3 without coming into f1 and f2. first come to f1 then f2 then f3 then enter value

