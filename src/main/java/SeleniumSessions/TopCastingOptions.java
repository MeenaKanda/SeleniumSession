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
		
		 
		//5.WD = new RWD  - valid top casting - recommended - used for remote execution
//		WebDriver driver = new RemoteWebDriver();  //The constructor RemoteWebDriver() is not visible
//		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		//remote execution -> if you want to run test cases on the cloud/on the server/some other machine/on AWS
		//in that case we have to give IP Address(remoteaddress), and capability(which browser version you want to use on that machine)
		
	
	    //6. SC - new RWD();  - valid but not recommended
//		SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
	
	
	
	}

}

    //for local execution we prefer
    //WebDriver driver = new ChromeDriver();

    //for local execution we prefer
    //WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);

    //ChromiumDriver top casting we don't use.

