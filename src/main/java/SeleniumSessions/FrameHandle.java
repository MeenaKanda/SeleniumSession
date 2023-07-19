package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		
		int totalFrame = driver.findElements(By.xpath("//frame")).size(); 
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
		
		
	}

}

