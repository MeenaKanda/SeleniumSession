package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;



public class Class17RelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(3000);
		
		WebElement base = driver.findElement(By.id("input-email"));
		
//		WebElement nearest = driver.findElement(RelativeLocator.with(By.tagName("label")).near(base));
		WebElement nearest =  driver.findElement(with(By.tagName("label")).near(base));
		WebElement aboveEle = driver.findElement(with(By.tagName("h2")).above(base));
		WebElement nearest1 =  driver.findElement(with(By.tagName("p")).near(base));
		
		System.out.println(nearest.getText());
		System.out.println(aboveEle.getText());
		System.out.println(nearest1.getText());
		
	}

}
