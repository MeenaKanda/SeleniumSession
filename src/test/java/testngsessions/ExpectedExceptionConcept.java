package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	
		
		@Test(expectedExceptions = ArithmeticException.class) //(Exception)or(Throwable) 
		public void loginTest() {
			System.out.println("login test");
			int i=9/0;  //java.lang.ArithmeticException: / by zero  //fail if don,t have (Ex=AE)
		}
		
}

