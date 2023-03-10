package testngsessions;

import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test(invocationCount = 10)   //same test case running 10 times
	public void createUser() {
		System.out.println("create user");
	}
}

//invocationCount usecase:
// if you have requirement running test cases again and again. dev checking performance testing for
// createUser Test. 