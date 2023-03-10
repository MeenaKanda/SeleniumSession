package testngsessions;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
//		int i = 9/0;  // because of Arithmetic execption this test case failed. addToCart and makePayment dependency
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

//TestDependency --> means one test case depend on another test case
//when we add dependency , it will not consider alphabetical order.

//test cases should be independent.so never create dependency between test cases.
//when adding dependency --> running in a sequencial order is fine. but running test cases (in parallel mode 
//with dependency is a disaster. thread -> t1 t2 t3
