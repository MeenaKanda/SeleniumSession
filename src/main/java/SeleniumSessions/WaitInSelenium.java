 package SeleniumSessions;

public class WaitInSelenium {

	public static void main(String[] args) {
		
		//script  --sync-->  application
		//script -----> slow/fast/very slow
		
		//types of wait:
		//1. static wait: Thread.sleep(5000)  -- pause 5 secs  
		//2. dynamic wait: 10 secs --> ele found in 2 secs --> 8 secs will be ignored
		
		//two types of dynamic wait:
		  //2.a: Implicitly Wait  : global wait for all the elements
		  //2.b: Explicit Wait:   applied on a specific element + polling/interval time + support non web elements
		        //i. WebDriverWait
		        //ii. FluentWait
		
		
		//Wait heirachy in Selenium:
		//WebDriverWait(Class) --extends--> FluentWait(Class) --implement-> Wait(I) :untill()
		                             //untill(){}
		                             //other methods()
		
	}

}

