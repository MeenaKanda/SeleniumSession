package testngsessions;

public class TestngXmlDetails {

	
	//verbose = 4  
	//what is verbose?  //no of logs //how exactly you want to generate logs
	//minimum value of verbose verbose=1 . and max value of verbose verbose=10
	//if verbose=1, only one log generate.not give much information
	//if verbose =10, it generate all information ,all not necessary
	//so make verbose = 3 or 4 or 5 
	
	
	
	//<parameter name="url" value="https://www.google.com" />  --> parameterization  of test class
	// this is not data provider
	
	//who will decide parallel execution? java, selenium, or testNG?
	//ans: selenium can not execute in parallel mode.
	//testng provide feature itself. just give us parametet,rest of thing testng take care of it.
	
	
	
	//thread-count="3" parallel="tests
	
	// parallel="tests  --> means blocks <test   -----  </test>
	//I want to run my test blocks in a parallel mode
	
	//thread-count="3" 
	//thread t1 t2 t3
	//any thread can pick any test block.these thread pick block at a same time.
	//
	
	//parallel execution take less time than sequential execution
	
	//thread ---> is a kind of java instance of memory,jvm memory or testng jvm instance will be created inside the memory.
	//thread is like one virtual user/thread will be created.
	
	
	//thread count = 10 , but having only 3 test block. 
	//only 3 thread will occupy the 3 test blocks. remaining 7 threads takes some memory. why wasting 7 thread unnecessarily.
	//so dont create 10 thread for just 3 test blocks.
	
	// 100/100  -->for 100 test cases you don't need to have 100 threads.otherwise 100 browser will be open at a same time. machine will be totlly down.
	//100 browser running together occupy memory so application might crash or laptop shutdown.
	//don't use thread count like 30 40  like that.
	
	
	//50/5 --> for handling 50 test cases ,5 thread will generate. these 5 thread randomly pick any of 5 test cases at a time.
	//at a time 5 threads are participating , once 5 threads are done another 5 thread again pick another 5 test cases from rest of test cases.
	
	//10/30   --> for 10 test case why creating 30 thread unnecessarily. bad idea
    //10/5 --> 10 test cases and 5 threads. max 2 iteration it will perform. first 5 then remaining 5 test cases.
	
	//whenever you using parallel execution, don't create any dependency between test cases.
	//even though dependency feature available , it is not a good practice create dependency
	//even when developer write unit or integration test cases they never create dependency.
	
	
	//if the manager says run all the test cases in same browser or cross browser
	//better create different testng.xml file
	
	//we can rerun/re execute only failed test cases in testng-failed.xml file which comes under test-output
	
	
	//if the tool doesn't support parallel execution , it is waste of money.
	
}
