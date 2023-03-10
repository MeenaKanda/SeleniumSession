package testNgHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchItem {

	public WebDriver driver;
	
	public boolean doSearch(String searchName, String productItem) throws InterruptedException {
		driver.findElement(By.name("search")).sendKeys(searchName);
		driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-default btn-lg']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		driver.findElement(By.xpath("//a[text()='"+productItem+"']")).click();
		
		String itemName = 
		driver.findElement(By.xpath("//div[@class='col-sm-4']//h1")).getText();
		
		if(itemName.equals(productItem)) {
			return true;
		}
		return false;
	}
	
	@DataProvider
	public Object[][] getSearchData() {
		return new Object[][] {
			{"macbook", "MacBook Air"},
			{"macbook", "MacBook Pro"},
			{"samsung","Samsung SyncMaster 941BW"},
			{"samsung","Samsung Galaxy Tab 10.1"}
			
		};
	}
		
	@Test(dataProvider= "getSearchData")
	public void searchTest(String searchName, String productName) throws InterruptedException {
		boolean flag = doSearch(searchName, productName);
		Assert.assertTrue(flag);
	}
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
