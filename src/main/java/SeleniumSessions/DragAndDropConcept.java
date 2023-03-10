package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	//selenium can not ineract with c and d driver. we can drag and drop within the page.cannot drag and drop between windows or tabs.
	//Selenium can do drag and drop from one element to another element within the same page.

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
//	    act.clickAndHold(srcEle).moveToElement(targetEle).release().build().perform();    //it is builder patter
		
		
//		act
//		    .clickAndHold(srcEle)
//		        .moveToElement(targetEle)
//		              .release()
//		                    .build()
//		                          .perform();     
//		
		
		
		act.dragAndDrop(srcEle, targetEle).build().perform();  // this one also we can use to perform.
		
		
	}

}

//build() -> it arrange all the Actions in the same sequence(action 1 2 and 3) in the internal build.

//when we use multiple actions always use build and perform.



//act.clickAndHold(srcEle).moveToElement(targetEle).release().build().perform(); -> it work  // safer side use with build and perform.
//act.clickAndHold(srcEle).moveToElement(targetEle).release().perform();  -> it works . without build, only with perform also work.
//act.clickAndHold(srcEle).moveToElement(targetEle).release().build();   -> dont work.

