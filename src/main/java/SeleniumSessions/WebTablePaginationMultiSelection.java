package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTablePaginationMultiSelection {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		while(true) {
		if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {  
			selectMultipleCountry("India");
		}
		
		
		//pagination:
		WebElement next = driver.findElement(By.linkText("Next"));
		
		 if(next.getAttribute("class").contains("disabled")) {
			 System.out.println("all are clicked");
			   break;
		   }
		   
		next.click();
		Thread.sleep(1000);
		
	}
		}
		
		
	private static void selectMultipleCountry(String countryName) {
		List<WebElement> clickEle =  driver.findElements(By.xpath("(//td[text()='"+countryName+"'])//preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : clickEle) {
			e.click();
		}
	}
	
/*	private static void selectMultipleCountry(String countryName) {
		Actions act = new Actions(driver);
		List<WebElement> clickEle = driver.findElements(By.xpath("(//td[text()='"+countryName+"'])//preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : clickEle) {
			act.moveToElement(e).click().build().perform();
		}
	}*/
		
	
}
