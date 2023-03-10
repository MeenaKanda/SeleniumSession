package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Class4RegPageTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		Class3BrowserUtility brUtil = new Class3BrowserUtility();
		
		WebDriver driver = brUtil.initDriver(browserName);
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		brUtil.getpageTitle();
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
	
		Class4EleUtil elUtil = new Class4EleUtil(driver);
		
		elUtil.doSendKeys(firstName, "Meenakshi");
		elUtil.doSendKeys(lastName, "Kandasway");
		elUtil.doSendKeys(email, "meena132@gmail.com");
		elUtil.doSendKeys(phone, "1278347089");
		elUtil.doSendKeys(password, "meena123!");
		elUtil.doSendKeys(confirmPassword, "meena123!");

	}

}
