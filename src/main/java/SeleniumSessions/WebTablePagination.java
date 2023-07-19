package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTablePagination {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		
		//single selection:
		while(true) {
			 // //why using FEs not FE?
			//if the element not identified on the first page itself FE throw nosuchelementException , and FEs return 0 (empty list).so use FEs.
			
			
			//ele is on the first page itself
			if(driver.findElements(By.xpath("//td[text()='United States']")).size()>0) {  
				selectCountry("United States");
				break;
			}
			
			else {
				//pagination logic:
				WebElement next = driver.findElement(By.linkText("Next"));
				
				   if(next.getAttribute("class").contains("disabled")) {
					   System.out.println("pagination is over.... country is not found");
					   break;
				   }
				   
				next.click();
				Thread.sleep(1000);
			}
		}
		
	}

	private static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
//	private static void selectCountry(String countryName) {
//		Actions act = new Actions(driver);
//		WebElement clickEle = driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']"));
//		act.moveToElement(clickEle).click().build().perform();
//	}
//	
	
}

