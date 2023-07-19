package testngsessions;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
//		int i = 9/0;  // because of Arithmetic exception this test case failed. addToCart and makePayment dependency
		              // addToCart and makePayment both got skipped.
	}
	
	@Test(dependsOnMethods = "searchTest")
	public void addToCart() {                  // addToCart() depend on searchTest()
		System.out.println("addToCart");		
		int i = 10/0;   //this test case failed// searchTest() execute and  makePayment got skipped.
	}
	
	@Test(dependsOnMethods = "addToCart")   
	public void makePayment() {                //makePayment() depend on addToCart()
		System.out.println("makePayment");
	}

}
