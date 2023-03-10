package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        Thread.sleep(3000);
		
        driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();   //clicking image on the page, after click it take to new frame
        Thread.sleep(3000);
 //       driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("2345 abcd");  //NoSuchElementException: no such element  
        // have to switch to frame first
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
      
        driver.findElement(By.id("RESULT_TextField-7")).sendKeys("India 1989");
        driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2008");
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("VolwksWagan");
        driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Jetta");
        driver.findElement(By.id("RESULT_TextField-5")).sendKeys("silver");
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("10100");
        driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Meenakshi");
        driver.findElement(By.id("RESULT_TextField-9")).sendKeys("8851 166th ave ne");
        driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Apt A190");
        driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Redmond");
        List<WebElement> state = driver.findElements(By.xpath("//select[@id='RESULT_RadioButton-12']/option"));
        for(WebElement e : state) {
        	String text = e.getText();
        	if(text.equals("Washington")) {
        		e.click();
        	}
        }
    
        driver.findElement(By.id("RESULT_TextField-13")).sendKeys("98052");
        driver.findElement(By.id("RESULT_TextField-14")).sendKeys("45637829");
        driver.findElement(By.id("RESULT_TextField-15")).sendKeys("meena123@gmail.com");
        driver.findElement(By.id("FSsubmit")).click();
       
        // now driver is still in frame so we have to switch to main frame.
        
	    driver.switchTo().defaultContent();
	}

}
