package SeleniumHW;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class19MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement addOn = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(addOn).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[text()='Visa Services' and @dir='auto'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Friends and Family']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Extra Seat'])[1]")).click();
		
		Set<String> getEles = driver.getWindowHandles();
	
		Iterator<String> winId = getEles.iterator();
		
		String parentId = winId.next();
		String childId1 = winId.next();
		String childId2 = winId.next();
		String childId3 = winId.next();
		
		Thread.sleep(3000);
		driver.switchTo().window(childId1).close();
		Thread.sleep(3000);
	
		driver.switchTo().window(childId2).close();
		Thread.sleep(3000);
		
		driver.switchTo().window(childId3).close();
		Thread.sleep(3000);
		
		driver.switchTo().window(parentId).quit();
		
		
		
	}

}
