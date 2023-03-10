package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {

	public static void main(String[] args) {
		
		//how to click the 4th index on the web table? -interview Qs   
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.cfm?CFID=222937&CFTOKEN=73979165&jsessionid=b6302ea97d139a0ec9c924572f177c555c57");

		driver.findElement(By.xpath("(//input[@name='contact_id'])[4]")).click();
		//have to login first .it is not working for now .check later
		
		}

}
