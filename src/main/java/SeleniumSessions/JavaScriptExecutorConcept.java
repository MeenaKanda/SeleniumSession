package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
    		driver.get("https://www.amazon.com/");
//		driver.get("http://classic.crmpro.com/");
//		driver.get("https://app.hubspot.com/login");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;  //convert driver
//		
//		String title = js.executeScript("return document.title;").toString();  //convert js string to string
//		System.out.println(title);
//		
//		js.executeScript("alert('hi this is alert');");
		
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
	     
//		jsUtil.generateAlert("this is my js alert and we are on amazon home page");
//		jsUtil.generateConfirmPopUp("are you sure ???");
	    
//	    jsUtil.refreshBrowserByJS();
		
		
/*		String pageText = jsUtil.getPageInnerText();   //java script print all the text from all html.
		System.out.println(pageText);
		if(pageText.contains("Deals & Sales Pipeline")) System.out.println(true);
		if(pageText.contains("Reports")) System.out.println(true);
	*/
		
//		WebElement un = driver.findElement(By.name("username"));   //crm
//		jsUtil.drawBorder(un);
		
//		WebElement form = driver.findElement(By.id("hs-login"));  //hubspot
//		jsUtil.drawBorder(form);
		
		
/*		WebElement un = driver.findElement(By.name("username"));
		jsUtil.flash(un);
		un.sendKeys("meena@gmail.com");
		*/
		
		
/*		jsUtil.scrollPageDown();   //scrolling only for vertical
		Thread.sleep(2000);
		jsUtil.scrollPageUp();
		Thread.sleep(2000);
		jsUtil.scrollPageDown();
		Thread.sleep(2000);
		jsUtil.scrollPageUp();
		Thread.sleep(2000);
		jsUtil.scrollPageDownMiddlepage();
		Thread.sleep(2000);
		jsUtil.scrollPageDown("1200");
		*/
		
		
		String text = driver.findElement(By.tagName("html")).getText();
		System.out.println(text);
		//amazon have 6 html, it capture the first html and print all the text from the first html
		
		String title1 = driver.findElement(By.tagName("title")).getText();    //hubspto
		System.out.println("title of the page ::: " + title1);
		
		String title2 = driver.findElement(By.xpath("//title")).getText();    //hubspto
		System.out.println("title of the page ::: " + title2);
		
		
		List<WebElement> eleList = driver.findElements(By.xpath("//html"));
		System.out.println(eleList.size());
	}
}


