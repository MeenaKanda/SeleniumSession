package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String PWID = driver.getWindowHandle();

		
	//	driver.switchTo().newWindow(WindowType.TAB);  // open a new tab  //driver is now on the new tab.
		driver.switchTo().newWindow(WindowType.WINDOW); // open a new window // this one started Sel 4.x
		
		driver.get("https://www.google.com");
	//	driver.navigate().to("https://www.google.com");
		System.out.println("child window title : " + driver.getTitle());
		driver.close();   //after close driver is lost.
		
	//	System.out.println("parent window title : " + driver.getTitle());   //NoSuchWindowException: no such window thrown
		//because driver is lost after close. so driver is not in parent page. driver has to switch to parent window before gettitle.
		
		
		driver.switchTo().window(PWID);   // here driver switched to parent window
		System.out.println("parent window title : " + driver.getTitle());
		driver.quit();
		
		
		
	}

	
	
}
