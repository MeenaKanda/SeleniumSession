package SeleniumHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class19RightClickHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(ele).build().perform();
		
		List<WebElement> rightEle = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		System.out.println(rightEle.size());
		
		for(WebElement e : rightEle) {
			String text = e.getText();
			Thread.sleep(2000);   //want to see pressing correctly or not
			System.out.println(text);
			
		     if (text.equals("Edit")) {
				e.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
			}
			else if (text.equals("Cut")) {
				e.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
			}
			else if (text.equals("Copy")) {
				e.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
			}
			else if (text.equals("Paste")) {
				e.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
			}
			else if (text.equals("Delete")) {
				e.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
			}
			else if(text.equals("Quit")) {
				e.click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				break;
			}
			act.contextClick(ele).build().perform(); 
		}
		
		
	}

}
