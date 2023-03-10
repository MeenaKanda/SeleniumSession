package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class12StaticWebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		Thread.sleep(4000);
		
		//find all values in 2nd column:
		
		// //table[@id="customers"]/tbody/tr[2]/td[2]
		// //table[@id="customers"]/tbody/tr[3]/td[2]
		// //table[@id="customers"]/tbody/tr[4]/td[2]
		// //table[@id="customers"]/tbody/tr[5]/td[2]
		// //table[@id="customers"]/tbody/tr[6]/td[2]
		// //table[@id="customers"]/tbody/tr[7]/td[2]
		
		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[2]";
		
		for(int row=2; row<=7; row++) {
			String xpath = beforeXpath + row + afterXpath;
	//		System.out.println(xpath);
			String val = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(val);
		}
		
		System.out.println("------------------------");
		
		//find all values in 3rd column:
		
				// //table[@id="customers"]/tbody/tr[2]/td[3]
				// //table[@id="customers"]/tbody/tr[3]/td[3]
				// //table[@id="customers"]/tbody/tr[4]/td[3]
				// //table[@id="customers"]/tbody/tr[5]/td[3]
				// //table[@id="customers"]/tbody/tr[6]/td[3]
				// //table[@id="customers"]/tbody/tr[7]/td[3]
		
		String beforeXpath1 = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath1 = "]/td[3]";
		
		for(int row=2; row<=7; row++) {
			String xpath1 = beforeXpath1 + row + afterXpath1;
			String val1 = driver.findElement(By.xpath(xpath1)).getText();
			System.out.println(val1);
		}

	}

}
