package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	
	public WebDriver driver;
	
	public boolean doLogin(String userName, String password) {  //here we are only supply -ve data
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMesg = 
		driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMesg);
		if(errorMesg.contains("No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;
	}
	
	
	@DataProvider
	public Object[][] getLoginNegativeDate() {
		
		return new Object[][] {  //4 rows and 2 columns  //testNg understand only 2D Object Array only
			
			{"abcd123@gamil.com", "test134"},  //1st row given to loginTest() first then 2nd 3rd 4th row
			{"1234367@gamil.com", "abcdse"},   //row 2
			{"abc", "testtttt134"},
			{"test000@gamil.com", ""},
		};
	}
	
	

	@Test(dataProvider = "getLoginNegativeDate", priority = 1, expectedExceptions = ArithmeticException.class)
	public void loginTest(String userName, String password) {    //source for loginTest() is data provider //login running 4 time for row 1 2 3 4
	                                                        // this concepts also called parameterization of test cases.
		boolean flag = doLogin(userName, password);
		Assert.assertTrue(flag);
	}
	

/*	@Test
	public void loginTest() {
		Assert.assertTrue(doLogin("abcd123@gamil.com", "test134"));   // 1 row and 2 column
	}*/
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
	}
}

