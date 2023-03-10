package testNGHW1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest{
	
	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Register Account");  
	}

	@Test
	public void isPrivacyExist() {
		boolean flag = driver.findElement(By.className("agree")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
}
