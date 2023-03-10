package testngsessions;

import org.testng.annotations.Test;

public class CRUDOperationTest {

	public void createUser() {     // they are methods
        System.out.println("create user");
	}

/*	public void getUser() {
		 System.out.println("get user");
	}
*/
	
	public void getUser(int userId) {
		 System.out.println("get user" + userId);
	}
	
	public void updateUser(int userId) {

	}

	public void deleteUser(int userId) {

	}

	
	
	@Test
	public void createUserTest() {   // they are test case
		createUser();   //we call method inside the test case. not calling test case inside test case(dependency)
	}
	
	@Test
	public void getUserTest() {   // instead of using dependency create like this. this is the right way
		createUser();  //post call 
		getUser(123);     // get call  // here we update userId and this is the right way
		
	}
	
	@Test
	public void updateUserTest() {   // instead of creating dependency create like this. this is the right way
		createUser();  //post
		getUser(123);     //get
		updateUser(123);  //put
		getUser(123);     //get
	}
	
	@Test
	public void deleteUserTest() {   // instead of creating dependency create like this. this is the right way
		createUser();  //post
		getUser(123);     //get
		deleteUser(123);  //delete  
		getUser(123);     //get
	}
	
	@Test
	public void getUserTesting() {
		int userId = 123;  //this is hard coded user id. but every 15 days my data base will be deleted and refresh. so we never know same user id available for tomorrow.
		//in that case test will be failed because it did not find userid. so we think the feature is having bug.but really feature is not having bug , feature have data issue.
		//running test case in QA environment and stage environment and dev and UAT and production environment, what if user id not available it is a problem.
		
		getUser(userId);   
		//assert
	}

}

// this method having no dependency at all. so parallel execution is possible .In parallel execution  thread t1 t2 t3 t4 can 
//access any test cases  in any sequence because there is no dependency between test cases.



//test cases are always independent in automation.
