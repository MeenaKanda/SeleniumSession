package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
    //quit() and close() in terms of window:
	//close() -> close the current window
	//quit() -> close all the windows
	
	//if it is single window -> doesn't matter close or quit . in both case if you want to check you have to open the window
	//close come in to picture when you have secondary or pop up window, then we have to switch into multiple window.
	
	public static void main(String[] args) {
		
		//Quit and close  concept wrto SID - session id
		
		WebDriver driver = new ChromeDriver();  //sid = 123
		//browser(chrome browser) getting open.
		//selenium connect to client and one session id(SID) 123 created and maintained throughout
		// the communication b/w client and server until use driver.quit().
		
		
		driver.get("https://www.google.com");  //123
		String title =driver.getTitle();  //123
		System.out.println("title of page : "+ title);  //Google
		 
		System.out.println(driver.getCurrentUrl()); //123
		
/*		driver.quit(); //123
		
		//try to get title after quit
	//	System.out.println(driver.getTitle());  //org.openqa.selenium.NoSuchSessionException  //sid = null
		//NoSuchSessionException : Session ID is null. Using WebDriver after calling quit()?
		//server is there but SID is null.
		
		
		driver = new ChromeDriver();   //new sid = 456 will be created  //initialize chrome driver once again
		driver.get("https://www.google.com");   //456
		System.out.println(driver.getTitle());  //456
		*/
	
		driver.close();
		//after close sid remain same(123) but invalid sid

//		System.out.println(driver.getTitle());  //sid =123 //NoSuchSessionException
		//NoSuchSessionException: invalid session id   //how to solve the problem? same like quit() we have to initialize driver
		driver = new ChromeDriver();   //new sid = 456 will be created
		driver.get("https://www.google.com");   //456
		System.out.println(driver.getTitle());
		
	}

}







