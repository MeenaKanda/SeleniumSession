package SeleniumHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6TextFieldsCount {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
/*		List<WebElement> textFieldList = driver.findElements(By.tagName("input"));
		
		//find textfield count:
		int textCount = textFieldList.size();
		System.out.println("total text fields on the page : " + textCount);   //14
		
		int count = 0;
		for(WebElement e : textFieldList) {
			System.out.println(e.getAttribute("name"));
			//System.out.println(count + " : " + e.sendKeys("Meena"););
		//	e.sendKeys("Meena");   //org.openqa.selenium.ElementNotInteractableException
	//		count ++;
		}
	*/
	
		//find links count:
/*	   List<WebElement> linksCount = driver.findElements(By.tagName("a"));
	   int linksTotal = linksCount.size();
	   System.out.println("total links on the page : " + linksTotal);   //81
	   
	   //can not click the links while iterate? but can get value of links
	   int count = 0;
	   for(WebElement e : linksCount) {
	         String linksVal = e.getText();
	       
	         if(linksVal.length() > 0) {
	         System.out.println(count + " ; " + linksVal);
	         }
	         count++;
	   }
	   */
	
	   System.out.println("-------------------------");
	   
	   List<WebElement> ImageCount = driver.findElements(By.tagName("img"));
	   int ImageTotal = ImageCount.size();
	   System.out.println("total images on the page : " + ImageTotal);  //1
	   
	   
	   //why it is not working?
/*	   for(WebElement e : ImageCount) {
			System.out.println(e.getText());
		
		}
	   */
	   
	   
	   //find text field :
	   
/*	   List<WebElement> textElement = driver.findElements(By.xpath("//fieldset[@id='account']/div"));
		System.out.println(textElement.size());
		
		int count = 0;
		for(WebElement e: textElement) {
			String text = e.getText();
			if(text.length()>0) {
				count ++;
			System.out.println(text);
			}
		}
		System.out.println("no of element in text field : " + count);
		*/
		
	 //find text field :
		List<WebElement> textElement = driver.findElements(By.xpath("//fieldset//div[@class='form-group required']"));
		System.out.println(textElement.size());  //7
		
		int count = 0;
		for(WebElement e: textElement) {
			String text = e.getText();
			if(text.length()>0) {
				count ++;
			System.out.println(text);
			}
		}
		System.out.println("no of elements in text field : " + count);  //6
		
		
		
		
	}
	

}
