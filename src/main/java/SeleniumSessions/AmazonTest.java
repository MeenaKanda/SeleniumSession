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





