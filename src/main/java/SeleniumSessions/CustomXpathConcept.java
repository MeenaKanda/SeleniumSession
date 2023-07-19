package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//xpath : is a address of the element in htme dom. not an attribute
		
		//1. absolute xpath: /html/body/div[2]/div/div/div[2]/div/div/div[1]/a
		//in order find specific element we have to start from begininng of html orderly to reach.
		// the problem is if they introduce more div or change position of element ,it will affect xpath
		//so never use absolute xpath.
		
		//2. relative xpath:custom xpath
		
		//1.with one attr
		//tag[@attr='value']
		//input[@id='input-email']
		//input[@placeholder='E-Mail Address]
		
		//2.with 2 and 3 attrs usning and
		//tag[@attr1='value' and @attr2='value']
		//input[@type='text' and @name='email']
		//tag[@attr1='value' and @attr2='value' and @attr='value']
		//input[@type='text' and @name='email' and @id='input-email']
		
		//3.with no attr
		//tag
		//input
		//img
		//a
		
		//4. 2 or 3 attrs with or
		//tag[@attr1='value' or @attr2='value']
		//input[@type='text or @type='email']
		
		//some element have no attributes . only text available. in that case
		//xpath with text():  text()-> is a function in xpath
		//text is not an attribute,its the text content of the element.
		//don't use @text.... we use text() function 
		//tag[text()='value']
		//h2[text()='Returning Customer']
		//h2[text()='New Customer']
		//a[text()='Terms & Conditions']  //find how many terms&conditions on the page
		////h1[text()='Love your software']
		
//		By newCus = By.xpath("//h2[text()='New Customer']");
		//text() function we can use for link also.
		//check My Account links is present on the page -- two times
		By myAcc = By.xpath("//a[text()='My Account']");
		int myAccount = driver.findElements(myAcc).size();
		System.out.println(myAccount);
		if(myAccount == 2) {
			System.out.println("PASS");
		}
		
		
		//text() with attribute:
		//tag[@attr='value' and text()='value'] or ViceVersa
		//h1[@class='h0-80' and text()='Love your software']
		//h1[text()='Love your software' and @class='h0-80']
		//a[@class='list-group-item' and text()='Register']
		
		//tag[@attr1='value' and @attr2='value' and text()='value']
		////a[text()='Register' and @class='list-group-item' and  @href ]
		//a[text()='Register' and @class  and  @href ]
		//a[ @class  and  @href and text()='Register' ]
		
		//give all the links which is having url/href.[url always defined in href]
		//a[@href]
		
		
		//some element having long text. if we are using xpath with text() we have to write the whole long text. this is issue
		// to avoid we use contain() function
		//p[text()='Freshworks makes ridiculously easy-to-use marketing, sales, support and IT solutions.']
	
		//contains()-> in contains() we don't need to write whole long text. just write part of it. 
		//contains() with attribute:
		//tag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail')]
		//input[contains(@placeholder,'Address')]
		//input[contains(@id,'email')]  //with contains
		//input[@id='input-email']  //without contains
	
		//contains() with one attribute and use another attribute without contains():
		//tag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@placeholder,'E-Mail') and @name='email']
		//input[contains(@placeholder,'E-Mail') and @name='email' and @type]
		//input[contains(@placeholder,'E-Mail') and @name='email' and @type='text']
		//input[@name='email' and @type and contains(@placeholder,'Address')]

	
		//dynamic id/attribute:
//		<input id=firstname_123>
//		<input id=firstname_456>
//		<input id=firstname_789>
	    //here everytime id attribute number only changing.so we can't write locator without contains().
		//use case of contains() => in this case we have to use contains().
		
		//By.id("firstname_123"); // not the right xpath
		//input[contains(@id,'firstname_')]  -- this is right xpath with contains()
	
	   //contains() with text():
		//tag[contains(text(),'value')]
		//p[contains(text(),'marketing, sales, support and IT solutions.')]
		//h2[contains(text(),'50,000 companies')]
	
		//on the particular page give me all the links which contains amazon
		//EX: out of 300 links just give me those links which contains amazon
		//a[contains(text(),'Amazon')]
		//this contains find all the links having amazon anywhere(can be starting ,middle, or in the end)
	
	   //contains() with text() and contains with attribute:
	   //tag[contains(text(),'value') and contains(@attr,'value')]
 	   //a[contains(text(),'Science') and contains(@href,'amazon.science')]
		
	   
		//contains() with text() and attribute without contains():
		//tag[contains(text(),'value') and @attr='value']
		//a[contains(text(),'Science') and @class='nav_a']
		
		
		//starts-with(): text()
		//tag[starts-with(text(),'value)]
		//a[starts-with(text(),'Amazon')]  
		//this starts-with() find all the links which starts with Amazon .
		//----------------------------------------//
		//p[starts-with(text(),'Dear Lucy is an intelligent sales analytics platform')]
		
		//starts-with(): attr
		//tag[starts-with(@attr,'value')]
		//a[starts-with(@href,'https://naveenautomationlabs.com/')]
		//input[starts-with(@aria-labelledby,'UIFormControl') and @id='username']
		
		
		//ends-with() in xpath??? --NA
		
		
		
		//position/index in xpath:
		
		//capture group-> capture the entire xpath in a group by bracket ().
		//() -> this bracket is called capture group bracket	
		
		// (//input[@class='form-control'])[1]
		// (//input[@class='form-control'])[2]
		By.xpath("(//input[@class='form-control'])[1]");
		// (//input[@class='form-control'])[position()=1]
		
		// find last element on the page:
		// (//input[@class='form-control'])[6]     ---- hard coded value
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1]
		// (//input[@class='form-control'])[last()-2]
		
		//in amazon.com find is help is in last position in last column of footer link or not? interview Qs
		// (((//div[contains(@class,'navFooterLinkCol')])[last()])//a)[last()]
	
		driver.findElement(By.xpath("(((//div[contains(@class,'navFooterLinkCol')])[last()])//a)[last()]")).getText();
		//to check we are getting help in last position or not
	
	
	    //class in locator: className, xpath, css
		//same element have more than 1 class/ no of classes separated by space
		
		By.xpath("//input[@class='form-control private-form__control login-email']");  //valid  //using xpath should use all classes
		By.xpath("//input[@class='login-email']");  //not valid [can't use just 1 class when element have more classes]
		By.xpath("//input[contains(@class,'login-email')]"); //valid using contains method
		
		By.className("form-control private-form__control login-email"); // not valid //using className only one class allowed
		By.className("login-email "); //valid
		
	    
		//traverse from parent to child:
		
		//parent/child ---> direct
		//parent//child ---> direct+indirect
		
		
		//child to parent: backward traversing in xpath
		// to reach immediate parent -> /.. or /parent::tag(for immediate parent)
		// to reach indirect parent(grand parent) -> /ancestor::tag
		// //input[@id='input-email']/..
		
		//traverse from sibling to sibling: for immediate siblingsx
		// //input[@id='input-email']/preceding-sibling::label
		driver.findElement(By.xpath("//input[@id='input-email']/preceding-sibling::label"));
		
		// //label[@for='input-email']/following-sibling::input  //if have only one sibling(input tag)
		// //label[@for='input-email']/following-sibling::input[@type='text']  // in order to differentiate which sibling we are calling when have more followint sibling with same tag
		
		
		
		// https://classic.freecrm.com/   //traverse from left to right on the web table
		// //a[contains(text(),'Ali khan')]/../preceding-sibling::td/input[@type='checkbox']
	    // //a[contains(text(),'Romi singh')]/parent::td/preceding-sibling::td/input[@type='checkbox']
	
	
		// (//a[text()='Ali khan']/parent::td/following-sibling::td)[position()=1]/a
		driver.findElement(By.xpath("(//a[text()='Ali khan']/parent::td/following-sibling::td)[position()=1]/a")).getText();   //Ali Khan
	
		// //a[text()='Ali khan']/parent::td/following-sibling::td/span
		driver.findElements(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/span")); //it give all 3 phone numbers
	
	
		
		// https://www.espncricinfo.com/   //web table score
		// (//span[text()='Dawid Malan']/../../../following-sibling::td//span)[2]
		driver.findElement(By.xpath("(//span[text()='Dawid Malan']/ancestor::td/following-sibling::td//span)[2]")).getText();
	    // (//span[text()='Dawid Malan']/ancestor::td/following-sibling::td//span)[2]
	    driver.findElement(By.xpath("(//span[text()='Dawid Malan']/ancestor::td/following-sibling::td//span)[2]")).getText();
	    
	
	   //using * in xpath
	  //  //* -> gives all the tag on the html
	 //   //*[@id] -> gives all the tags which have id
	 //   //*[@id and @class] -> give all the tags which have id and class both
	    
	// //*[@id='input-firstname'] -->if 100 elements on the page it will check each and every element which having id ='input-firstname
	//  //input[@id='input-firstname']  //100->10->1  //-->100 out of 100 only 10 elements are input tag. so it check only 10 element which one have id ='input-firstname.not checking all 100.
	                                    // so this is faster than *
	
	}

}

