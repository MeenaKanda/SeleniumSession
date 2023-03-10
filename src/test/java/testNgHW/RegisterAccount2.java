package testNgHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterAccount2 {

public WebDriver driver;
	
	public boolean doRegister(String firstName, String lastName, String email, String phoneNo, String password) {
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email);
		
		driver.findElement(By.name("telephone")).clear();
		driver.findElement(By.name("telephone")).sendKeys(phoneNo);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("confirm")).clear();
		driver.findElement(By.name("confirm")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String confirmMesg = 
		driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(confirmMesg);

//		driver.findElement(By.xpath("(//a[text()='Logout'])[last()]")).click();
//		driver.findElement(By.xpath("(//a[text()='Register'])[last()]")).click();

	
		if(confirmMesg.contains("Your Account Has Been Created!")) {
			return true;
		}
		return false;
		
	}

	
	@DataProvider
	public Object[][] getRegisterData() {
		
		return new Object[][] {
			
			{"meera123", "kavin1", "meera123@gmail.com", "122387789", "kavin123123"},
			{"laksh123", "rajesh1", "laksh123@gmail.com", "123803279", "rajesh123123"},
			{"nithya123", "balu1", "nithya123@gmail.com", "127222279", "balu123123"}
			
		};
	}
	
	@Test(dataProvider = "getRegisterData")
	public void registerTest(String firstName, String lastName, String email, String phoneNo, String password) {
		
		boolean flag = doRegister(firstName, lastName, email, phoneNo, password);
		Assert.assertTrue(flag);
	}
	
	@BeforeMethod    
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
	}
	
	
}
