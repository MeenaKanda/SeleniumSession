package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1.browser specific: can not be used for the cross browser
//		ChromeDriver driver = new ChromeDriver();
//		FireFoxDriver driver1 = new FireFoxDriver();

		
		//2.WD = new CD  - valid top casting - recommended - local execution - practically use this
//		WebDriver driver = new ChromeDriver();
		
 
		//3.SC = new CD() - valid but not recommended
 //      SearchContext driver = new ChromeDriver();
        //only can use fe,fEs methods.
		
	
		//4.RWD = new CD(); - valid top casting - recommended(not aware)
//		RemoteWebDriver driver = new ChromeDriver();
		
		 
		//5.WD = new RWD  - valid top casting - recommended -GRID- used for remote execution
//		WebDriver driver = new RemoteWebDriver();  //The constructor RemoteWebDriver() is not visible
//		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
	
	    //6. SC - new RWD();  - valid but not recommended
//		SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
	
	}

}

    