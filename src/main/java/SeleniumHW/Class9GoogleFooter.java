package SeleniumHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9GoogleFooter {

	static WebDriver driver;
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> footerLinks =driver.findElements(By.xpath("//div[@jscontroller='NzU6V']/div/a"));
	    WebElement settingLink = driver.findElement(By.xpath("//span[@jscontroller='nabPbb']//div[@jsname='oYxtQd']/div"));
		System.out.println(settingLink.getText());
	    System.out.println(footerLinks.size());
		
		for(WebElement e: footerLinks) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
