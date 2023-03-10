package testNGHW1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("title of page ::: " + title);
		Assert.assertEquals(title, "Your Store");
	}
	
	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
