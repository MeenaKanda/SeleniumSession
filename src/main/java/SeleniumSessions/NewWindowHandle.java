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
		
		
		//random pop up: can not be handled
		//some times you go to login page registration page suddenly one pop up coming we have to click on cross button to close it .
		// it kind of disturbing out work. it come randomly we have no idea where it is coming . this is called random pop up.
		//can we handle random pop up?  can not be handle. no tool in the market can not be handle.
		// better solution ,in QA/Stage/Test environment ---we block these pop up.because it is not part of functionality.it is from production.it is just advertisement point of you.
		// better disable those pop up in QA environment.
		//random pop up come any time
		// but advertisement pop up come when you launch the application and can be handle those like browser window handle
	    //advertisement pop up--> advertisement coming in the form of pop up.
	
	    // can window have alerts and browser window pop up together?
		// No.it is not possible . at a time only one can have. 
		//Ex: if window have alert it freeze the page. 
	
	}

	
	
}
