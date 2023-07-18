 package SeleniumSessions;

public class TestNG {

	public static void main(String[] args) {
		
		//TestNg is an unit test frame work. and only for java. it is used by developer for writing unit test cases.
		//in automation also we have to write test cases.
		
		//java -= testNG , Junit available
		//python 
		//seasaw n unit available
		//php php unit available
		//java script - mova, jashmin
		
		
		// we can write test cases
		//priority the test cases
		//we can create dependency of test cases.one test depend on another test
		//we can generate html report also
		//we can use the concepts of listeners also
		//parallel test case execution across multiple browser also possible with testNg.selenium can not execute parallel mode
		//we can write assertion also (validation logic easily write with testng)
		//retry logic ( run test case many time) also possible
	    //annotation, we can define pre, post condition
		//we can achieve data driven testing also with the help of data providers. what if i want to run same testing cases with different data
	    //+ve/-ve test cases also we can easily write.
		
		//testng -- is available with third party in the form of jar file
		//we have to add a dependency in pom.xml file. so that to use the methods/classes of testng 
		//Actions classes. webdriver, selection ,chromedriver everything came from selenium dependency
		//we have to download or install testng plugin in on eclipse.so that we can run the test with testng
	
	
	    //IN hard Assert(Assert), if have multiple Assertion, if one assertion failed the test got failed immediately and 
		//the remaining assertion will not get opportunity to be executed. in Assert we don't need to create a object.because hard Assert they created
		//all static method.
	   
		//SoftAssert is a class.we have to create a object for SoftAssert class.in soft assert have non static methods.
	    //property of soft Assert -> is that if one asset get failed it will give equal opportunity to all remaining all softassert to be executed.
		//at the end of all softAssert line we have to write assetAll();
		
		//use cases of soft assert -> if you have to validate multiple thing, you don't have to create multiple method for all validation individually.
		//in this case we will go with soft assertion which can validate multiple thing in one method.
		
		//in testNg what is difference between assert and verify?
		//assert means -> hard assertion
		//verify means -> soft assertion
		
		//there is no assertion in selenium. only in testng
		
		//Map is a non-order base collection.
		//hashmap doesn't maintain order.if you want to maintain same order you enter you have to maintain linked HashMap.
		//treemap is a kind of map maintain on the basis of sorting keys not the value.
		
		
		//selenium, testng, java  can not read xl sheet.we have to use third party API which is appochi poi API and can read the data from xl sheet.
		//in order to read the xl date from apochi poi api, we have to add some dependency.
		
		
		//********************************//
		
		
		//Listener -> listen each and every test activity during the execution of test cases.
		//and listener generate nice report.
		//type of listener: ExtentReport Listener , Allure report listener
		//Allure report also generate own report. look and feel of data of both allure and extent report different but result will be same
        //it is bad practice if you add so many listener in the pom.xml file. all giving same results, only look and feel different.
		//more listener you add it will slow down the execution speed.
		
		//Allure- reports coming in the form of jason file.
	    //Allure report is web server report so we have to start allure server for the report. and server reports are always flexible and light weight and easy to integrate wiht jenkin
		//server report we can do many configuration
		//and we can easily integrate with jenkin later on and you can server with anyone when needed
		//even if you run 5000 test cases allure report never give you wrong results.but extend report may
		
		//listener is a java file so create under src/main/java
		
		//ExtentReportListerner implements ITestListener
		//ITestListener extends ITesnNgListener
		
		//TestAllureListerner implements ITestListener
		//ITestListener extends ITesnNgListener
		
		
		//who is responsible for screenshot? => selenium responsible.not tesng and extend report
		//extend report says where exactly your screenshot available and take screenshot from there and attach it to the file.
	    //extendreport give pass and fail report along with screenshot.
	
		//which listener is responsible to customize the report? ITestListener.
	    //both extentreport and Allure report implementing the ITestListener interface. so both report override the methods from ItestListerner interface.
		//ITestListerner will you  information in the form of method and reporter will implement on their own model.
		
	    //Testng listener implement to have retry logic.
		//Retry logic means -> if the test got failed , retry the same test again
		//we can try retry logic with the help of TestNg Listener.
		
		//Which Interface responsible for retry Logic?
		//IAnnotatinTransformer is responsible.it has only one method transform()
		//IRetryAnalyser is also responsible for retry logic
		
	
		//Retry logic is added in the form of listener
	    //Retry logic --> testng report in console retry test taken as a skipped one
		// in extended report also taken as a skipped test case
		//in allure report shows the exact result as pass , failed, and retry test cases.
		//retry is not good .try to get pass test cases in  the first attempt. if the test case pass after many attempt in the user point of view it is not 
		// user friendly application.so better not implement retry logic
		
	
	    //how to handle multiple environments in the automation framework?
		//for qa, production, dev and stage the url is different.
	
	///8888888888888888888888888888 Directry factory 88888888888888888888//
		//TakeScreenshot -> is an interface in selenium ->
		//getScrrenshotAs(OUtputType.File) ->it capture the screenshot and store it in the specified location.
		//System.getProperty("user.dir")-> user.dir is current user/project directry.
		//System.getProperty("user.dir")+"/screenshot" ==> create screenshot folder under particular project



		//don't use static keyword. multiple thread going to use this method. if it it is static
		//this method can be used by one thread at a time, so multiple thread can not use this method at a time.
		//so don't make it static.

		//Properties -> is a class from java 
		//FileInputStream -> is a class from java and is used to interact with non java files(.xl or .properties file like non-java file)
		//FileInputStream make connection with config.Properties


		//"./src/test/resources/config/config.properties"
		//  ./   ---=>mean go to current project directory(NOv2022PomSeries)

		//FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");  --> if the file is not available/not able to read it throw FileNOtFountexception.
		//so we put it in try catch block. 


		//prop.load(ip); while loading Propeties also if any exception(IOException) may come .so we put in try catch block.
		//in Properties OBject all the values are stored in key and value format.


		//The properties object contains key and value pair both as a string. The java.util.Properties class is the subclass of Hashtable.

		//Properties can be used to get property value based on the property key. The Properties class provides methods
		//to get data from the properties file and store data into the properties file.
		//Moreover, it can be used to get the properties of a system.


		//one thread is waiting for driver,but driver is in the wait state that is deadlock condition.To make our execution smooth,and working fine with different threads, we have to
		//implement thread local concepts.thread local not coming from selenium or testng. it is coming from java which claims that if we initialize any reference with the thread local we will 
		//give you the local copy of that particular instance.
		//initialize driver with threadlocal. threadlocal have 2 methods get() and set()
		//set() -> means get the driver value. and get() --> means get the local value of the driver.

		// System.getProperty("env"); --> getting the value of the environment.here we have to pass the key
		//if no one passing environment, for Qa team, by default qa is the environment 

		//passing the evironment in Testng.xml is bad approach. we have to pass env parameter for every test. that's what maven will help

	   //whenever we execute maven command or any command , it will always go to the pom.xml file first.that is where the entry for the maven command and check all the dependency are 
		//upto date or not then it go to the <build> section. in the <build> section first it execute compiler plugin(where it compile all java code) and surefire plugin to run your test cases. 
	
	
	
	}

}
