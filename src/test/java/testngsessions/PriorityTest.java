package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test
	public void a_test() {
		System.out.println("a test");
	}
	
	@Test
	public void b_test() {
		System.out.println("b test");
	}
	
	@Test
	public void c_test() {
		System.out.println("c test");
	}
	
	@Test(priority = 1)
	public void d_test() {
		System.out.println("d test");
	}
	
	@Test(priority = 2)
	public void e_test() {
		System.out.println("e test");
	}

}

// by default execution order is alphabetical order
//if priority add to all test cases , priority will be in numerical order from -ve to 0 to +ve.
// if all test cases having priority and multiple test cases having same priority number. in that case
//same priority  with alphabetical order test cases executed.
//only some test cases having priority and some with non- priority  --> non-priority test cases with alphabetical order
//execute first and priority test case with priority order execute second.