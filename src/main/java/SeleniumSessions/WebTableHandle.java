package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
        driver.findElement(By.name("password")).sendKeys("Selenium@12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
		
        Thread.sleep(4000);
        
        //in order to interact with the element which is available inside/under the frame, first we have to 
        //switch to frame and the interact with the element
        //frame is available inside html dom.
        driver.switchTo().frame("mainpanel");
        driver.findElement(By.linkText("CONTACTS")).click();
	    //inside DOM is "Contacts and on the page is"CONTACTS". which on pick?
        //always consider visible on the page one not dom. because selenium interact whatever visible on the page.
	
        Thread.sleep(4000);
        
 //       driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	
        selectUser("deepti gupta");
        selectUser("Ali khan");
        
	    String cName = getUserCompanyName("Ali khan");
	    System.out.println(cName);

	    cName = getUserCompanyName("deepti gupta");
	    System.out.println(cName);

	    cName = getUserCompanyName("Romi singh");
	    System.out.println(cName);
	    
	    
	
	}
	
	// this all methods are Application specific utility .not generic utility for all application .
	
	//Dynamic Xpath:::::::::::
	
	// //a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']
	public static void selectUser(String userName) {  //dynamic xpath
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	
	// //a[text()='Ali khan']/parent::td/following-sibling::td/a[@context='company']
	public static String getUserCompanyName(String userName) {
	return	driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	    
	}
	

}

// HW: create utility for moblie no, home no, phone no, emailid also.
