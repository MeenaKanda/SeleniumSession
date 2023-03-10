package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutonticationPopUpHandle {
	
	//AutonticationPopUp --> when we enter url this pop up come(username,password). we have to enter username and password within the url
	//it is not an webelement, can not inspect, no xpath available

	public static void main(String[] args) {
	
		//https://@the-internet.herokuapp.com/basic_auth
	
		//we have to enter username and password withinthe url
		WebDriver driver = new ChromeDriver();
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//username= admin
		//password= admin
		
		//limitation: Ex: password/username= admin@123 .if username/password have @ it won't work. because after @ the address of url should only be there.
		// in that case have 2 @ make confusion. 
		
		String username = "admin";
		String password = "admin";
		
//		driver.get("https://"+username+":"+username+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
	}

}
