package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		
		int totalFrame = driver.findElements(By.xpath("//frame")).size();  //total frame on this page
		System.out.println(totalFrame);
		
/*		String header = driver.findElement(By.tagName("h2")).getText(); //selenium not able to locate the element
		//because header h2 available inside the frame.driver is currently on the page. so move the driver to inside the frame first.then 
		//driver able to interact with the element.
		System.out.println(header);  //NoSuchElementException: no such element
		*/
		
//		driver.switchTo().frame(2);  //passing index  //not prefer
//		driver.switchTo().frame("main");  //passing name or id //name="main"
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']"))); //passing WebElement

		
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header); 
		
		driver.switchTo().defaultContent();  //come back to main frame 
		
		// frame  - old application you see frame
		// iframe  - in modern application you see iframe
		//in automation point of view we don't bother about frame or iframe . both are same
	}

}

// how do we get to know there is a frame? //right click and see view frame source option
//and: go inside dom, frame also having its own html dom and frame having its own property also.
// under main html dom ,frame is available ,inside frame h2 is available
//frame is also web element , have its own tag and attribute.


//frame() method is overloaded
//driver.switchTo().frame(int index);  //we have to calculate frame index manually.if one more frame added then position of frame will be changed
//htme index start from 1. In java index start from 0.

//driver.switchTo().frame(String nameOrId);  // passing Id or name of this frame.


//driver.switchTo().frame(WebElement frameElement); // passing the webelement of the frame

//when you switch to frame after completes works in that frame, driver has to come out of frame and back to main frame.

// two types of frame :
//2. iframe

// why developer create a frame or iframe?
// ans: for security of the web element . banking application. they kept everything in the small iframe(usename, password)


