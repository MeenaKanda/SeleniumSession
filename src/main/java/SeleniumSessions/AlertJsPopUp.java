 package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUp {

	public static void main(String[] args) throws InterruptedException {
		//Java Script has 3 kind of pop up box
		//Java Script alert - 3 types ->alert, confirm, prompt - these alert come because of java script written by the developer
		//authontication pop up
		//browser window pop up/advertisement pop up
		//file upload pop up
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
/*		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		//driver is on the page now. we have to move/switch driver from page to alert page. now driver capture text from alert and click ok on alert page.
		// once click ok button driver again back to main page.
		
		Alert alert = driver.switchTo().alert(); 
		String text = alert.getText();
		System.out.println(text);
		
//		alert.accept();  
		alert.dismiss();  
		*/
		
		//confirm:
/*		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
	    
		Alert alert = driver.switchTo().alert();  
		String text = alert.getText();
		System.out.println(text);
	
//		alert.accept();   //click on ok
		alert.dismiss();  //click on cancel 
		*/
		
		//prompt:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
        Thread.sleep(3000);
	    
		Alert alert = driver.switchTo().alert();  
		String text = alert.getText();
		System.out.println(text);
	
		alert.sendKeys("Meena");  //here selenium enter the value but we won't able to see value on the box screen
		Thread.sleep(3000);
		alert.accept();  
//		alert.dismiss();   

		
	}

}

