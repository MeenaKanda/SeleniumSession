package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestWithBM {

WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	
	
	
	
	//Test cases should be independent. so every test cases get opportunity to get executed whether test case pass or fail.
    //AAA Rule
	//AAA stands for : Arrange,Act,Assert
	//Arrange test cases in proper sequence
	//Act write your step properly
	//Assert is mandatory to write
	
	// 1 test case with 1 Assert is best practice and it is a rule
	
	@Test(priority = 1)  // whatever priority is given on the basis of priority test cases will be executed (from 0 
	public void titleTest() {
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
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}


//What is AAA unit testing?
//AAA stands for: Arrange, Act, Assert. This is a commonly taught structure for unit tests. 
//This structure guides us in how to "arrange" our tests, and is generally considered to produce tests that are easier to maintain.



//@BeforeTest approach--> 
//here we are opening browser only one time 
//Ex : running 100 test cases. when running from 1 to 100 testcases, broweser got crashed on 10th test cases from 11 to 100 who will run the test cases?
//if any issue happen in between all the remaining will not be executed because of browser not available. only 10% test cases covered(1-10) and 90% test cases not executed(11-100).
//1.BeforeTest approach when application stable
//2.less test cases (sanity test cases) and less navigation(going one page to another page and login log out)

// end user point of view BeforeTest is more realistic.


//@BeforeMethod --> 
//here opening and closing browser for each test cases.
//above same approach  1 to 100 testcases , if browser got crashed ,application got crashed, server isssue ,browser closed ,it will always open the browser and 
//execute test cases and close the browser.
//even it take 10 15 mins extra it give better result
//1. BeforeTest approach when more test cases
//2. regression test cases
//3.

//
