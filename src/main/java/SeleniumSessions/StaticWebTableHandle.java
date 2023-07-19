package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	//static table
		Thread.sleep(4000);
	
	   int headerCount = getTableheaderCount();
	   System.out.println(headerCount);
	
	   int rowsCount = getRowCount();
	   System.out.println(rowsCount);
	   
	   
		//print all first column values:
	   // //table[@id="customers"]/tbody/tr[2]/td[1]   //only row are changing, column remain same
	   // //table[@id="customers"]/tbody/tr[3]/td[1]
	   // //table[@id="customers"]/tbody/tr[4]/td[1]
	   // //table[@id="customers"]/tbody/tr[5]/td[1]
	   // //table[@id="customers"]/tbody/tr[6]/td[1]
	   // //table[@id="customers"]/tbody/tr[7]/td[1]
	   
/*	   String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
	   String afterXpath = "]/td[1]";
	   
	   
	   for(int row=2; row<=7; row++) {
		   String xpath = beforeXpath + row  +afterXpath;
	//	   System.out.println(xpath);
		   String val = driver.findElement(By.xpath(xpath)).getText();
		   System.out.println(val);
		   
	   }*/
	
		  for(int col=1; col<=1; col++) {
		  for(int row=2; row<=7; row++) {
	         String val = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+row+"]/td["+col+"]")).getText();
	         System.out.println(val);
		  }
	  }
	   
	    System.out.println("------------------------");
	}

	//header count and column count are same
	public static int getTableheaderCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	
	}
}
