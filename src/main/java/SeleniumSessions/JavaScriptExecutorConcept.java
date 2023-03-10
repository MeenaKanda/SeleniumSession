package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
	//selenium can not give every feature, so for certain thing we have to use javaScript.
	//browser understand only java script. many java script selenium can not provide you. some feature we have to do by our own
	//every tool can not give everything
	//JavaScriptExecutor is an interface which will help you to execute the java script from our java code

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
    		driver.get("https://www.amazon.com/");
//		driver.get("http://classic.crmpro.com/");
//		driver.get("https://app.hubspot.com/login");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;  //convert driver
//		
//		String title = js.executeScript("return document.title;").toString();
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


// 1. what is the different way of getting title?

//document..documentElement.InnerText  --> document means entire dom
//from entire dom go each and every document element and capture the text of that(innerText)


//use case of draw a border-> found a bug use border.

//selenium doesn't provide highlighting feature, we have to use javascript for that.

//flash -> can do during demo..highlight first and enter value

//scrolling only for vertical.vertical scrolling not done by selenium so we need javs script executor
//horizontal scrolling selenium will take care of it.
//we can not do horizontal  and vertical scrolling together at a same time


//selenium take screen shot but java script executor don't take screen shot

//java script is common for all the browsers like chrome, firefox, ie 


//<html   <head    <body  --> elements are available inside the body. title is part of head not body.

