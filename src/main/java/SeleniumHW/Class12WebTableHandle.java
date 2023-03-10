package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12WebTableHandle {

	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
        driver.findElement(By.name("password")).sendKeys("Selenium@12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        
        driver.switchTo().frame("mainpanel");
        driver.findElement(By.linkText("CONTACTS")).click();
		
        Thread.sleep(4000);
        
        String val = getUserPhoneNumber("Ali khan");
        System.out.println(val);
		
	}

    // //(//a[text()='Ali khan']/parent::td/following-sibling::td/span)[position()=1]
    public static String  getUserPhoneNumber(String userName) {
    	return driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td/span)[position()=1]")).getText();
    }
    
    public static void getUserHomePhone() {
    	
    }

    public static void getUserMobileNumber() {
    	
    }
    
    public static void getUserEmail() {
    	
    }
}
