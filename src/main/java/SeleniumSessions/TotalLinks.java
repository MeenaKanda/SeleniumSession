package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//get total blank links count? ---assignment
public class TotalLinks {

	    static WebDriver driver;
	
	    public static void main(String[] args) {
		

	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		//find all links on the page:
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		//inside the memory it create list referred by linkslist. all the links available on this page
		//storing it here. it will try to fetch links from top to bottom order. 0 to N no of links there.
		// linksList-> dynamic array . it maintain the order with index no. .size() used
		//why selenium return dynamic array not static array?-> no guarantee we always get same no of links all the time.
		
		//List => is Interface and order based collections
		
		
		//print the total links count:
		int linksCount = linksList.size();
		System.out.println("total links : " + linksCount);
		
	
		//print the text of each link:
	    //and avoid blank text
/*		for(int i=0; i<linksCount; i++) {
			String text = linksList.get(i).getText();
			
			if(text.length()>0) {
			System.out.println(i + " : " + text); 
			}
		}
		*/
		
		//for each:  prefer this .
 /*   	int count = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
			    if(text.length()>0) {
			    	System.out.println(count + " : " +text);
			    }
			    count++;
		}*/
		
		
		//get how many blank links ---Assignment
		//method 1:
		int count1 = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
			
			if(text.length() > 0){
				count1++;
				System.out.println(count1 + " : " + text);
			}
		}
		
		System.out.println("total no of not blank list  = " + count1);
		
		System.out.println("total no of blank list = " + (linksCount - count1));
		
		
		System.out.println("********************************------------------******************************");
		
		//get how many blank links ---Assignment
		//method 2:
/*		int count2 = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
			
			if(text.length() == 0) {
				count2++;
				System.out.println(count2 + " : " + text);
			}
		}
		System.out.println("total no of blank list = " + count2);
		*/
		
	}

}


//driver.findElements ->  we can't perform any action like click , sendkeys. because of elements.
//driver.findElements -> returns List<WebElement>

//it is possible some links may have blank text.
//if there is 100 elements available inside DOM.it is not mandatory all the 100 elements visible on the page also.
//may have 100 elements visible on page or <100 also possible on page. but >100 elements visible on page not possible.
//dev may create dummy elements inside DOM but they don't want to display on the page.

//whenever we create any app (amazon.com) when app hit amazon server , server will return home page which one loaded first
//DOM or Page loaded first? 
//Ans: DOM will be loaded first. all elements loaded in DOM first(css,html). every browser having some DOM API's and browser will
//try to fetch the information from DOM and all these elements will be displayed on this page(amazon.com) in the respective manner(order).

//sometime some links(blankLink) are available on the page which are having  blank text. that why we get some blank space(value) when execute.





//