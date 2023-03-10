package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	
		
		@Test(expectedExceptions = ArithmeticException.class) //(Exception)or(Throwable) 
		public void loginTest() {
			System.out.println("login test");
			int i=9/0;  //java.lang.ArithmeticException: / by zero  //fail if don,t have (Ex=AE)
		}
		
	

}

//expectedExceptions = ArithmeticException.class) use cases: test case will be passed.
//whenever you do demo use expectedExceptions = ArithmeticException.class) so exception will be ignored.we are fooling customer/manager

//(expectedExceptions = ArithmeticException.class) or (expectedExceptions = Exception.class) or (expectedExceptions = Throwable.class)
//can use but put appropriate exception 

