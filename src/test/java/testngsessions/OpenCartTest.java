package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{

/*WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/");
	}*/
	
	
	@Test(priority = 1)
	public void titleTest() {
//		driver.get("https://naveenautomationlabs.com/opencart/"); 
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Your Store"); 
		
	}
	
	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
	    Assert.assertTrue(flag);   
	
	}
	
/*	@AfterTest
	public void tearDown() {
		driver.quit();
	}*/
	

	
}
