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
		//driver.switchTo().defaultContent();  //take to main page
		driver.findElement(By.id("inp_val")).sendKeys("ABC--456");
		
		driver.switchTo().defaultContent();   //come back to main page
		//Selects either the first frame on the page, or the main document when a page contains iframes. 
		*/
//		
//		driver.switchTo().frame("pact1").switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("PQR");
		
		
		//write statement in single line::::
		driver.switchTo().frame("pact1").switchTo().frame("pact2").findElement(By.id("jex")).sendKeys("PQR");
	
		}
}


