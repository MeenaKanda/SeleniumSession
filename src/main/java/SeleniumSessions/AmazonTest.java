package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browserName = "edge";
		
		BrowserUtility brUtil = new BrowserUtility();
		
//		brUtil.driver.getTitle("ww.adkjo");  //if driver is public this error happen so make it private
		brUtil.initDriver(browserName);
		
		brUtil.launchURL("https://www.amazon.com");
		
		String actTitle = brUtil.getPageTitle();
//		System.out.println("actual title : " + actTitle);
		if(actTitle.contains("Amazon")) {
			System.out.println("title -- PASS");
		}
		else {
			System.out.println("title -- FAIL");
		}
		
	    String actUrl = brUtil.getPageURL();
//	    System.out.println("act curren url : " + actUrl);
	    if(actUrl.contains("amazon")) {
	    	System.out.println("url - pass");
	    }
	    else {
	    	System.out.println("url - fail");
	    }
	
	
	    brUtil.quitBrowser();
	
	}

}

//ad
// all the utilities in BrowserUtility  we can use any page and in any applications , they don't need to initialize driver again and again.
//and it is not specific to any application (it is generic). it is re usability of code.
//same way we can create utility for sendkey(),elements() also.
//we are not writing 1000 lines of code in main method because of this approach.
//you don't see any Selenium code or method here

//later on in real time project main method replaced by TestNG.





