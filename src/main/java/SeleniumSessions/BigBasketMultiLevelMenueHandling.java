package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenueHandling {

	// if you see ng-mouseover in html it is called angular base application. entire
	// application made with angular frame work.
	// angular is a frame work which is used to develop the UI pages.angular can be
	// automated with selenium
	static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {

	    driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
		By L1Cat = By.cssSelector("a.meganav-shop");
	//	selectProductLevell4Handling(L1Cat, "Beverages", "Tea", "Tea Bags");
		selectProductLevell4Handling(L1Cat, "Foodgrains, Oil & Masala", "Atta, Flours & Sooji", "Atta Whole Wheat");
		
	/*	WebElement shopParentEle = driver.findElement(By.cssSelector("a.meganav-shop"));
		
		Actions act = new Actions(driver);
		act.moveToElement(shopParentEle).build().perform();
		Thread.sleep(2000);
		
		WebElement L2Ele = driver.findElement(By.linkText("Beverages"));
		act.moveToElement(L2Ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L3Ele = driver.findElement(By.linkText("Tea"));
		act.moveToElement(L3Ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L4Ele = driver.findElement(By.linkText("Tea Bags"));
		act.moveToElement(L4Ele).click().build().perform();
		*/
	}

public static void selectProductLevell4Handling(By L1ByLocator, String l2, String l3, String l4) throws InterruptedException {
	
	WebElement shopParentEle = driver.findElement(L1ByLocator);
	
		Actions act = new Actions(driver);
		act.moveToElement(shopParentEle).build().perform();
		Thread.sleep(2000);
		
		WebElement L2Ele = driver.findElement(By.linkText(l2));
		act.moveToElement(L2Ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L3Ele = driver.findElement(By.linkText(l3));
		act.moveToElement(L3Ele).build().perform();
		Thread.sleep(2000);
		
		WebElement L4Ele = driver.findElement(By.linkText(l4));
		act.moveToElement(L4Ele).click().build().perform();
	
  }
}
