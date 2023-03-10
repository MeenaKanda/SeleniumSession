package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		BrowserUtility bruUtil = new BrowserUtility();
		
		WebDriver driver = bruUtil.initDriver(browserName);   //driver = new ChromeDriver();
		bruUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = bruUtil.getPageTitle();
		System.out.println(title);
		
		//by locator:
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "naveen");
		eleUtil.doSendKeys(lastName, "singh");
		eleUtil.doSendKeys(email, "naveen@gmail.com");
		eleUtil.doSendKeys(telephone, "1234566");
		eleUtil.doSendKeys(password, "naveen@123");
		eleUtil.doSendKeys(confirmPassword, "naveen@123");

	}

}
