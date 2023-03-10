package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

	
		
		//In manual testing follow steps:
		//global pre conditions
		//pre condition of particular test
		//start writing test cases --> test steps --> along with test steps write act Vs expected result --- Assertion
		//post steps ( close the browser like that)
		//post global steps
		
		//same steps we have to use in testng also. they have given some annotation for every conditions
		//annotation-> is a keyword starting with @. and annotation should be associated with method.
		
	    //@Before means precondition
	    //@After means post condition
//	
//	BS - startDBConnection
//	BT - startDBConnection
//	BC -- launchBrowser
	
//	BM -- loginToApp 
//	homePageSearchTest
//	AM -- logout
	
//	BM -- loginToApp 
//	homePageTitleTest
//	AM -- logout
	
//	BM -- loginToApp 
//	homePageURLTest
//	AM -- logout
	
//	AC  -- closeBrowser
//	AT -- deleteUser
//	AM -- disconnectWithDB
	
	///////////////////// pre steps ///////////////////
	    //1 executed
		@BeforeSuite
		public void startDBConnection() {
			System.out.println("BS - startDBConnection");
     	}
		
		//2
		@BeforeTest
		public void createUser() {
			System.out.println("BT - startCreateUser");
		}

		//3
		@BeforeClass
		public void launchBrowser() {
			System.out.println("BC -- launchBrowser");
		}
		
		//4 7 10  // BeforeMethod will be executed before each and every Test method
		
		@BeforeMethod
		public void loginToApp(){
			System.out.println("BM -- loginToApp ");
		}
		
		
		
		////////////////// test cases ////////////////////////////
		//test method executed in alphabetical order
		
		//5
		@Test
		public void homePageTitleTest() {   // add Test as a suffix at the end of method name
			System.out.println("homePageTitleTest");
		}
		
		//8
		@Test
		public void homePageURLTest() {   // add Test as a suffix at the end of method name
			System.out.println("homePageURLTest");
		}
		
		//11
		@Test
		public void homePageSearchTest() {   // add Test as a suffix at the end of method name
			System.out.println("homePageSearchTest");
		}
		
		
		
		
	//////////////////////// post steps  //////////////////////////	
		 // AfterMethod will be executed after each and every Test method
	
		//6 9 12
		@AfterMethod
		public void logout() {
			System.out.println("AM -- logout");
		}
		
		//13
		@AfterClass
		public void closeBrowser() {
			System.out.println("AC  -- closeBrowser");
		}
		
		//14
		@AfterTest
		public void deleteUser() {
			System.out.println("AT -- deleteUser");
		}
		
		//15
		@AfterSuite
		public void disconnectWithDB() {
			System.out.println("AM -- disconnectWithDB");
		}
		
}
