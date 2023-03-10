package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGFlipcart {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		driver.findElement(By.name("q")).sendKeys("dress");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("laptop");
		
		
		
		
		Thread.sleep(4000);

//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']")).click();  //svg xpath not working
		driver.findElement(By.xpath("//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']")).click();
				
		
	}

}
