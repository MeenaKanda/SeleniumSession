package SeleniumSessions;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pesuedoElementConcepts {
	
	//  ::before or ::after -> it is called pesudo class  -> we can't do copy xpath/css for :: before ::after
//we have to create java script to fetch the value of ::before
	// we are going to execute java script using  selenium java code
	//selenium can not give every method how application working. so we create java script for that and execute with the help of selenium with java,
	//selenium with python, selenium with ruby
	//java script executer execute java with selenium
	

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//convert driver into java script executer:
/*		JavascriptExecutor js = (JavascriptExecutor)(driver); // ->casting driver into JavaScriptExecutor
		
		// window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')
		//we can not use xpath here. querySelecor so we have to use css selector
		
		String script ="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		//return is javascript return
		
		String mand_fiels = js.executeScript(script).toString();
		
		System.out.println(mand_fiels);
		
		if(mand_fiels.contains("*")) {
			System.out.println("this is a mandatory field");
		}
		
		*/

		System.out.println(getMandatoryField("firstname"));
		System.out.println(getMandatoryField("lastname"));
		System.out.println(getMandatoryField("email"));
		System.out.println(getMandatoryField("telephone"));
		System.out.println(getMandatoryField("password"));
		System.out.println(getMandatoryField("confirm"));
	}

	
	
	public static String getMandatoryField(String name) {
	
		
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		String script ="return window.getComputedStyle(document.querySelector(\"label[for='input-"+name+"']\"),'::before').getPropertyValue('content')";
		String mand_field = js.executeScript(script).toString();
//		System.out.println(mand_field);
		if(mand_field.contains("*")) {
			System.out.println("this mandatory field is : ");
		}
		return mand_field;
		
	}
}
