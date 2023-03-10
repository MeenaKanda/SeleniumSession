package SeleniumHW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class19DragAndDrop {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		 
		
		  WebElement draggable1 = driver.findElement(By. xpath("//li/img[@alt='The chalet at the Green mountain lake']")); //  NoSuchElementException
//		  WebElement draggable2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']")); 
//		  WebElement draggable3 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
//		  WebElement draggable4 =  driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']")); 
//		  WebElement draggable4 = driver.findElement(By.xpath("//li/img[@src='images/high_tatras2_min.jpg']"));

		  
		  
		  WebElement reachArea = driver.findElement(By.id("trash"));
		  
		  Actions act = new Actions(driver);
		  
		  act.clickAndHold(draggable1).moveToElement(reachArea).release().build().perform();
		 
		  // act.dragAndDrop(draggable4, reachArea).build().perform();
		 

		 
		  // ----------using Wait ------------------------- // 
		  
		/*
//		WebElement dragable1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']/parent::li"));
//		By pic1 = By.xpath("//img[@src='images/high_tatras_min.jpg']/parent::li");
		By pic1 = By.id("//img[@src='images/high_tatras_min.jpg']");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement draggable1 = wait.until(ExpectedConditions.visibilityOfElementLocated(pic1));

		WebElement targetPlace = driver.findElement(By.cssSelector("div#trash"));
		
		Actions act = new Actions(driver);
//		act.clickAndHold(draggable1).moveToElement(targetPlace).release().build().perform();
		act.dragAndDrop(draggable1, targetPlace).build().perform();
*/
	}
}