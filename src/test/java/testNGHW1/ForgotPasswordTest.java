package testNGHW1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest{

	
	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Forgot Your Password?");  
	}
	
	@Test
	public void forgotPasswordTitle() {
		String value =driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		Assert.assertEquals(value, "Forgot Your Password?");
	}
}
