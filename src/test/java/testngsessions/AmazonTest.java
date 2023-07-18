package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{

/*	WebDriver driver;
	
	@BeforeTest                // we write BeforeTest and AfterTest in BaseTest super class
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}*/
	
	
	// we can not write more than one test case inside method. if particular test case/Assertion get failed, it terminate the Test and marked as failed
    //Not valid format . we should not write all test cases together.if any of test case getting failed it terminate the remaining and whole Test got failed.
	//we should not create any dependency between test cases. should write test cases separately

	
	/*	@Test
	public void amazonPageTest() {
		System.out.println("checking title ......");
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more."); 
		
		System.out.println("checking search.......");
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	    Assert.assertTrue(flag);
	    
	    System.out.println("checking help..........");
	    boolean flag1 = driver.findElement(By.linkText("Help")).isDisplayed();
	    Assert.assertTrue(flag1);
		
	}*/
	
	//each test case should have assertion
	//Test cases should be independent. so every test cases get opportunity to get executed whether test case pass or fail.
	//@Test will be executed in an alphabetical order.
	
	@Test(priority = 1)
	public void titleTest() {
//		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");  //Asserts that two Strings are equal. If they are not,an AssertionError is thrown.
		//compare two value
	}
	
	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	    Assert.assertTrue(flag);    //Asserts that a condition is true. If it isn't,an AssertionError is thrown
	//compare boolean
	}
	
	@Test(priority = 3)
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
	    Assert.assertTrue(flag);
	}
	
	
/*	@AfterTest
	public void tearDown() {
		driver.quit();
	}*/
	
	
	
}

//whenever create non-java files we have to create a folder.we are not importing xml file
//whenever create java file we have to create a package.because we have to import java package



//every test should have assertion. actual Vs expected
//Test will be picked/executed in alphabetical order