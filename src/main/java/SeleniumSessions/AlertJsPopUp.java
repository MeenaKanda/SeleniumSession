package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUp {

	public static void main(String[] args) throws InterruptedException {
		//Java Script has 3 kind of pop up box
		//Java Script alert - 3 types ->alert, confirm, prompt
		//authontication pop up
		//browser window pop up/advertisement pop up
		//file upload pop up
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
/*		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		//driver is on the page now. we have to move/switch driver from page to alert page. now driver capture text from alert and click ok on alert page.
		// once click ok button driver again back to main page.
		
		Alert alert = driver.switchTo().alert();  //Switches to the currently active modal dialog for this particular driver instance.  //Alert is an interface
		String text = alert.getText();
		System.out.println(text);
		
//		alert.accept();   // click on ok button
		alert.dismiss();  //cancel the alert  //use escape in keyboard
		*/
		
		//confirm:
/*		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
	    
		Alert alert = driver.switchTo().alert();  //Switches to the currently active modal dialog for this particular driver instance.
		String text = alert.getText();
		System.out.println(text);
	
//		alert.accept();   //click on ok
		alert.dismiss();  //click on cancel
		*/
		
		//prompt:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
        Thread.sleep(3000);
	    
		Alert alert = driver.switchTo().alert();  //Switches to the currently active modal dialog for this particular driver instance.
		String text = alert.getText();
		System.out.println(text);
	
		alert.sendKeys("Meena");  //here selenium enter the value but we won't able to see value on the box screen
		Thread.sleep(3000);
		alert.accept();   //click on ok
//		alert.dismiss();  //click on cancel 
		
		
	}

}

// open the dom, first you see  element where you see dom and next is console. 
// in the console you can execute java script. browser understand only java script.browser can not understand java ,python.
//so whatever you are writing in the console should be java script.

//in console when you pass
// 1. alert('hi this is my alert') and alert pop up on page and we can't inspect anything on the alert.can't get id,xpath for ok button in alert.
//alert is not an web element it is alert element.because of alert the entire page is freezed.
// 2. prompt('hello naveen')
// prompt('enter ur id')   --> cancel / ok 
// prompt is also not an web element
// 3. confirm('are you sure you want to delete this user?')   ---> cancel / ok message on the page

//Qs: when NoAlertPresentException: no such alert will be thrown?
// Ans: when we page don't have alert pop up , we use Alert alert = driver.switchTo().alert(); --> this will throw NoAlertPresentException.

// Qs: can we get 2 or multiple java script alert/pop up at same time?
// ans: we never get 2 or more pop up at same time. we don't know which pop up have to switch.

// how do we know it is java script alert pop up?
// java script pop up have no url, it is not part of browser, can't inspect anything on that pop up(no xpath, id nothing)

 //Qs: is it possible JS prompt can have 2 text field on the prompt?
//ans: prompt pop up always have 1 text field. not more than 1. sendkeys confuse which to apply text.



// in some application for error message they give you pop up(alert), some error message give message on the page only