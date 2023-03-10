package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcepts {
	
	//we have to move over to parent menu it shows child menu(which is hidden/not able to see unless mouse over so we can't interact directly.we have to use Actions Class) down
    // hidden elements -> not visible on the page. using Actions class make them visible first 
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		WebElement menu = driver.findElement(By.cssSelector("a.menulink"));
		
		
		//in order to perform mouse over action or keyboard action we have to use Actions Class
		Actions act = new Actions(driver);  //we have to pass driver in Actions class
	
		act.moveToElement(menu).build().perform();// whenever use actions class method we have to use to more methods build and perform.
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COURSES")).click();

	}

}

//By.linktext() -> we have to look for page elements text(upper case or lower case)
//we have to think about upper or lower case whatever visible on the page pass that
//but xpath will be validated in the dom.


//a[normalize-space()]  -> give me all the a  which have some space 
//normalize-space() -> it is a function. it will go and check and ignore the space of specific text. it work only for text.
//not good practice always use normalize space.

//moveToElement() -> move the mouse to middle of the element
//build() -> Generates a composite action containing all actions so far, ready to be performed
//act.moveToElement(menu) -> means i want to move to the element but no action so build and perform to be performed after .mandatory
