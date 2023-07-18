package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanda\\Downloads\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kanda\\Downloads\\chromedriver_win32.exe");
		
		WebDriver driver = new ChromeDriver();   //when use selenium version 4.5.3
        //when you use <4.6 version you get this error
		//Exception in thread "main" java.lang.IllegalStateException: 
		//The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property; 
	    //<4.6.0 you have to configure .exe file
		//>=4.6.0 onwards we don't need to configure .exe file.
	    //who's responsible to provide .exe file from selenium 3 onwards? 
		//vendor responsibility . before selenium 3 -> selenium responsibility to provide .exe file
	    //chromium-> is a team in google. they are responsible for the chrome Driver
		//.exe file is a platform dependent(windows, mac)
	
		
		// Browser(chrome) version 106 -- .exe 106 -> works
		// Browser(chrome) version 108 -- .exe 108 -> works
	   //Browser(chrome) version 109 -- .exe 108 -> system stil have 108 .it does't work
	   //browser get updated version(109) every 15 days, again you have to manually download .exe file to (108 t0 109).it is not compatable.
		//because of compatibility issue from 4.6.0 onwards selenium says we don't need to worry system.set property.
		//we will take care of binary file(.exe) management with the help of selenium manager.
		
		
		//from 4.6.0  -> selenium manager released. 
		//before selenium manager called webdrivermanager.
		//developer of webdrivermanager -> bonigarcia
		
		//if we have chrome 109 -> we will automatically go and check in your system(window/mac/linux).do you have .exe file? if yes do you have 109?
		//if you have 109, we don't download .if you don't have 109(108) then we will automatically upgrade to 108 to 109.it all internally do that.
	
	    //before every time we have to check the browser version and .exe file. now we don't need to worry about that.selenium automatically do that work from 4.6.0 
	
		//109 chrome --> win/mac/linux -- .exe 109
		//109 chrome --> win/mac/linux -- .exe 108 -->109
		//110 chrome --> win/mac/linux -- .exe 109 -->110
		//115 chrome --> win/mac/linux -- .exe 110 -->115
		
		//every software is backward compatable also. so we can see all the older version also in site.
		//it up to you which version want to use (newer or older version)
		
	}
}
