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

// 1.selenium providing default wait/auto wait ? no selenium dont have auto wait. 
//playwright and cypress have auto wait.but some times auto wait dont work well.

//2. need of wait?
//running our script against our application. what if app very slow/fast/verryyy slowww/specific ele take lot of time
//wait help synchronize between script and application. make sure both are sync.make sure 
//because of slowness of app, script should not be failed.

//3.static wait ; Thread.sleep(10000)  -- pause 10 secs. if ele found in 2 secs but it wait for 8 mins also.unnecessarily waiting here
// 4.  dynamic wait: 10 secs --> ele found in 2 secs --> 8 secs will be ignored.
//dynamic wait is better.


//Implicit Wait -->
//WebDriverWait Class have parent FluentWait Class . FluentWait Class have parent Interface Wait(I).
//Wait Interface have method untill().
//FluentWait have overridden untill() method and its other methods also.


//Thread.sleep --> is a java wait. static wait will not provided by selenium at all. 
//Thread --> is a class in Java
