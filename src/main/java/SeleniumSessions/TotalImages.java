package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> ImagesList = driver.findElements(By.tagName("img"));
	//	List<WebElement> ImagesList = driver.findElements(By.tagName("img111")); //if pass wrong locator size will be 0.
		System.out.println(ImagesList.size());

		
	}

}

//if we pass wrong locator in FE -> it throw NoSuchElementException
//if we pass wrong locator in FEs-> give listcount 0 . don't throw any exception


//                                                   FE            vs             FEs

//1.return type                                       WebElement                   List<WebElement>
//2.if element not available on this page            NSE                           empty list -> size=0
//3.action perform                                  yes action perform            no action perform



