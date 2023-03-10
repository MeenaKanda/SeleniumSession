package testNGHW1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	@Test(priority = 1)
	public void titleTest() {
//		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println("page title ::: " + title);
		Assert.assertEquals(title, "Account Login");
	}
	
	
	@Test
	public void isEmailExistTest() {
		boolean flag = driver.findElement(By.name("email")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test
	public void isPasswordExistTest() {
		boolean flag = driver.findElement(By.name("password")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
}
