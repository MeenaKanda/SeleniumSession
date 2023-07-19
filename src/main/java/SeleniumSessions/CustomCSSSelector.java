package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
	
		//id:
		// #id
		// #input-firstname    -- css     //see all tags which have id=input-firstname
		//   //input[@id='firstname'] -- xpath
		By fn = By.cssSelector("#input-firstname");
		
		//tag#id
		// input#input-firstname  // see only input tags which have id=input-firstname. it is better readable and faster
		
		
		//class:
		// .class
		// .form-control
		// .login-email  -> we can use one of class also if it have multiple class
	
		// tag.class
		// input.form-control
		// input.login-email  ->we can use one of class also if it have multiple class
		
		// .c1.c2.c3...cn  ->if you have multiple no of classes
		// .form-control.private-form__control.login-email
		
		// tag.c1.c2.c3...cn 
		// input.form-control.private-form__control.login-email
		// input.form-control.login-email   -> we can use any of 2 class out of 3 in any sequence
		// input.form-control.login-email
		
		
		// tag#id.class
		// input#username.login-email
		// tag.class#tag
		// input.login-email#username
		
		// #id.class
		// #username.login-email
		// .class#id
		// .login-email#username
		
		// tag.c1.c2.c3..cn#id
		// input.form-control.private-form__control.login-email#username
		// tag#id.c1.c2.c3..cn
		// input#username.form-control.private-form__control.login-email
		// input.form-control#username.private-form__control.login-email  // we can use id in between classes also. but not recommended confusing
		
		
		//other attr:
		// tag[attr='value']
		// input[type='text']  -> css 
		// //input[@type='text'] -> xpath
		// input[placeholder='First Name']
		// input[id='input-firstname']   --> we can use id also
		
		//class=form-control private-form__control login-email
		// input[class='form-control private-form__control login-email']  -- this works
		// input[class='login-email'] --css - this don't work. for multiple class we can't use only single class.should use all. it give 0 element
		//input[@class='login-email'] -- xpath --don't work  -- 0 element
		//input[contains(@class,'login-email')] --xpath--works
		
		
		//when use multiple attribute in css:
		// tag[attr1='value'][attr2='value'][attr3='value']
		// input[type='text'][id='input-firstname']
		// input[type='text'][id='input-firstname'][placeholder='First Name'] -- css
		// //input[@type='text' and @id='input-firstname' and @placeholder='First Name']  -- xpath
		
		
		// tag#id[attr='value']
		// tag#id[attr='value'].class  --- can do in any sequence
		// input#input-firstname[placeholder='First Name']
        // input#input-firstname[placeholder='First Name'][type='text']
		// input#input-firstname[placeholder='First Name'][type='text'].form-control    //we can do in any sequence
	    //  input[placeholder='First Name'][type='text'].form-control#input-firstname
	    
	    
		// h1[text()='Register Account']
		//text is not supported in CSS. in that case we have to use xpath
		
		//contains: in css  * used for contains
		// tag[attr*='value']
		// input[name*='first']
		// input[placeholder*='Name']
		// input[class*='login-email']
		
		
		//starts=with: in css ^ used for starts-with
		// input[placeholder^='First']
		// input{id^='meena_']
		
		//ends-with:
		// tag[attr$='value]
		// input[placeholder$='Name']
		
		
		//parent to child:
		// parent tag child tag     ---- direct + indirect child element
		// parent tag > child tag > child tag   ---- direct child elements
		
		// // parent tag child tag
		// div input
		//div.private-form__input-wrapper input
		// div.private-form__input-wrapper input#username
	
		//https://www.orangehrm.com/orangehrm-30-day-trial
		//select#Form_getForm_Country option
		//form#Form_getForm select   -- 1 element
		//form#Form_getForm > select   -- 0 element
		// select tag is indirecy child element form form parent so use space not >
		
		
		//https://app.hubspot.com/login
		// form#hs-login >div           -->8 elements// give direct div elements
		// form#hs-login div            -->20 elements // give direct and indirect elements
		
		
		//child to parent: backward traversing??
		// in css child to parent traversing not possible.
		
		
		// we can combine two or more html tag by using , in css (but not available in xpath)
		//what is the use cases? we can do quick sanity check. all important elements are there and working or not.
		//in css we are checking all the element together separated by , using one css 1 By locator . but when use xpath we have to create 4 By locator.
		//https://app.hubspot.com/login
		// input#username,button#bu,input#password,button#ssoBtn  -- it give 4 elements
		//FEs(css).size--> 4
		int impFieldsCount = driver.findElements(By.cssSelector("input#username,button#bu,input#password,button#ssoBtn")).size();
		System.out.println(impFieldsCount);	
		if(impFieldsCount == 4) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		// here 1 By locator have 4
		
		
		//https://naveenautomationlabs.com/opencart/index.php?route=account/login
		//img[title='naveenopencart'],input[name='search'],button[data-toggle='dropdown']
		
		
		//not in css:
		// :not() -> add what you want to exclude inside ().
		//https://app.hubspot.com/login
		//class=form-control private-form__control login-email
		//class=form-control private-form__control login-password m-bottom-3
		// input.form-control.private-form__control:not(#password)  -> exclude one 
		
		//https://naveenautomationlabs.com/opencart/index.php?route=account/register
		// input.form-control:not(input[name='search'])  --> out of 7 common elements excluded one element
		//input.form-control:not(input[name='search'],input[name='firstname'])  --> out of 7 we excluded 2 elements.
		//we can exclude how many we want by using ,
		
		
		//indexing :
		//https://www.orangehrm.com/orangehrm-30-day-trial
		// select#Form_getForm_Country > option:first-child    --> it give first child of option tag (with tag) under parent select.prefer this
		// select#Form_getForm_Country > option:last-child
		
		// select#Form_getForm_Country > option:first-of-type
		// select#Form_getForm_Country > option:last-of-type
		
		// select#Form_getForm_Country > :first-child      --> it give whatever first child available under select(without tag)
		// select#Form_getForm_Country > :first-of-type
	
	   //specific index: // we should know what is in which index? work well for month dropdown.
		// select#Form_getForm_Country > option:nth-of-type(20)    //with tag
		// select#Form_getForm_Country > option:nth-of-type(100)
		// select#Form_getForm_Country > :nth-of-type(12)  // without tag
		
		
		//sibling concept in css:
		// + sign are used for immediate sibling.
		// div.col-sm-4+div.col-sm-5               ---> give immediate sibling
		// div#content+aside#column-right
		// div[id='content']+aside[id='column-right']
		
		// ~ is used for immediate and following siblings
		// div.private-form__label-wrapper~div   -->  //4 give all forward siblings
	
	
		
        //xpath          vs           css:
//1. syntax:       complex                       simple
//2. text():         yes                         no
//3. AND:            yes							yes
//4. OR              yes							yes, comma
//5. forward:        yes							yes
//6. backwards: 	 yes							no
//7. forward sibling: yes							yes	
//8. backward sibling: yes							no
//9. not: 				no							yes
//10. index: 			yes							yes
//11. capture grp:     yes							no
//12. performance:     good							good
//13. starts-wtih		yes							yes
//14. contains			yes							yes
//15. ends-with: 		no							yes
//16. webtable: 		easy						limited


	
	}

}

