package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                  
public class Class4LocatorConcepts {
    
	static WebDriver driver;

	public static void main(String[] args) {
    
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
 		//1.
/*		driver.findElement(By.id("input-firstname")).sendKeys("Meenakshi");
		driver.findElement(By.id("input-lastname")).sendKeys("Kandaswamy");
		driver.findElement(By.id("input-email")).sendKeys("meena@134.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567");
		driver.findElement(By.id("input-password")).sendKeys("meena123!");
		driver.findElement(By.id("input-confirm")).sendKeys("meena123!");
		*/
	
		//2.
/*		WebElement firstName = driver.findElement(By.id("input-firstname"));
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement phone = driver.findElement(By.id("input-telephone"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
		
		firstName.sendKeys("Meenakshi");
		lastName.sendKeys("Kandaswamy");
		email.sendKeys("meena@134");
		phone.sendKeys("1234567");
		password.sendKeys("meena123!");
		confirmPassword.sendKeys("meena123!");
		*/
		
		//3.
/*		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		WebElement fN = driver.findElement(firstName);
		WebElement LN = driver.findElement(lastName);
		WebElement EM = driver.findElement(email);
		WebElement Ph = driver.findElement(phone);
		WebElement Pw = driver.findElement(password);
		WebElement CPw = driver.findElement(confirmPassword);
		
		fN.sendKeys("Meenakshi");
		LN.sendKeys("Kandaswamy");
		EM.sendKeys("meena@134.com");
		Ph.sendKeys("223234455");
		Pw.sendKeys("meena@134!");
		CPw.sendKeys("meena@123!");
		*/
		
		
		//4.By locator + generic method for find element
		
/*		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		getElement(firstName).sendKeys("Meenakshi");
		getElement(lastName).sendKeys("Kandaswamy");
		getElement(email).sendKeys("meena@134.com");
		getElement(phone).sendKeys("1234567");
		getElement(password).sendKeys("meena@134!");
		getElement(confirmPassword).sendKeys("meena@123!");
		*/
		
		//5.By locator + generic method for findelement and sendKeys
/*		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		doSendKeys(firstName,"Meenakshi");
		doSendKeys(lastName, "Kandaswamy");
		doSendKeys(email, "meena@134.com");
		doSendKeys(phone, "12345667");
		doSendKeys(password, "meena@134!");
		doSendKeys(confirmPassword, "meena@123!");
		*/
	
		
		//6.
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
	
		
		Class4EleUtil eleUtil = new Class4EleUtil(driver);
		eleUtil.doSendKeys(firstName, "Meenakshi");
		eleUtil.doSendKeys(lastName, "Kandaswamy");
		eleUtil.doSendKeys(email, "meena@134.com");
		eleUtil.doSendKeys(phone, "2236267");
		eleUtil.doSendKeys(password, "meena@134!");
		eleUtil.doSendKeys(confirmPassword, "meena@123!");
	
	}

/*	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}
	
	*/
	
	
	
}
