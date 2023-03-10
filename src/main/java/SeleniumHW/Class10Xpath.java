package SeleniumHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class10Xpath {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> LinksCount = driver.findElements(By.xpath("//a"));   //using xpath
//		List<WebElement> LinksCount = driver.findElements(By.tagName("a"));   //using tagName
//		List<WebElement> LinksCount = driver.findElements(By.xpath("//p[contains(text(),'By creating an account')]")); 

		int count = 0;
		for(WebElement e : LinksCount) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(count + " : " + text);
			}
			count++;
		}
		
		driver.quit();
	}

}
