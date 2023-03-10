package SeleniumHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7CrmParagraph {
	
	static WebDriver driver;
	
	public static void main(String []args) {
		
		   driver = new ChromeDriver();
		   driver.get("http://classic.crmpro.com/");
		   
		  List<WebElement> paraCount =  driver.findElements(By.tagName("p"));
		   
		   int totalPara = paraCount.size();
		   System.out.println("total no of paragraph : " +  totalPara);
		   
		   int count = 0;
		   for(WebElement e : paraCount) {
			   System.out.println(count + " : " + e.getText());
			   count++;
		   }
		   
		   System.out.println("-----------------------------");
		 
		   List<WebElement> imgCount =  driver.findElements(By.tagName("img"));
		   
		   int totalImg = imgCount.size();
		   System.out.println("total no of image : " + totalImg);
		   
		   for(WebElement e : imgCount) {
			  String imgText = e.getText();
			  System.out.println("image text is : " + imgText);
		   }
		  
		   System.out.println("-----------------------------");
		   
		   List<WebElement> linksCount =  driver.findElements(By.tagName("a"));
		   
		   int totalLinks = linksCount.size();
		   System.out.println("total no of links on the page : " + totalLinks);
		   
		   
		   
		
		
		
		
	}

}
