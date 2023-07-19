package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.microchip.com/prochiplicensing/#/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("firstName")).sendKeys("Meenakshi");
		driver.findElement(By.id("lastName")).sendKeys("kandaswamy");
		driver.findElement(By.id("email")).sendKeys("meena123@gmail.com");
		driver.findElement(By.id("company")).sendKeys("Infy");
		driver.findElement(By.id("phone")).sendKeys("98763678476");
		driver.findElement(By.id("hostID")).sendKeys("AB-CD-EF-GH-IJ-KL");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("88851 166th avn");
		driver.findElement(By.id("city")).sendKeys("Redmond");
		driver.findElement(By.id("postalCode")).sendKeys("9805678");
		driver.findElement(By.id("country")).sendKeys("USA");
		driver.findElement(By.id("state")).sendKeys("WA");
		
		
		WebElement design = driver.findElement(By.xpath("//label[text()='When is your design planned for production?']/preceding-sibling::select"));
		Select select = new Select(design);
	
		select.selectByVisibleText("2023");
		
		
//		WebElement design1 = driver.findElement(By.xpath("//label[contains(text(),'What is your HDL preference?')]/preceding-sibling::select"));
		WebElement design1 = driver.findElement(By.xpath("//label[text()='What is your HDL preference?']/preceding-sibling::select"));
		Select select1 = new Select(design1);
		select1.selectByVisibleText("VHDL");
		
		WebElement design2 = driver.findElement(By.xpath("//label[text()='Which CPLD will you be using?']/preceding-sibling::select"));
		Select select2 = new Select(design2);
		select2.selectByVisibleText("ATF1502");
		
		WebElement design3 = driver.findElement(By.xpath("//label[starts-with(text(),'Total CPLD volume?')]/preceding-sibling::select"));
		Select select3 = new Select(design3);
	//	select3.selectByVisibleText("1000 - 5000 units");
	//	select3.selectByIndex(2);
		select3.selectByValue("> 5000 units");
		
	}

}


