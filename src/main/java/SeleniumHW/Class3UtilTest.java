package SeleniumHW;

public class Class3UtilTest {

	public static void main(String[] args) {
		
		String browserName = "edge";
		
		Class3BrowserUtility browUtil = new Class3BrowserUtility();
		
		browUtil.initDriver(browserName);
		
		browUtil.launchUrl("http://naveenautomationlabs.com/opencart/");
		
		String actTitle = browUtil.getpageTitle();
		if(actTitle.contains("naveen")) {
			System.out.println("page title - PASS");
		}
		else {
			System.out.println("page title - FAIL");
		}
		
		
		String curUrl = browUtil.getPageUrl();
		if(curUrl.contains("naveen")) {
			System.out.println("current url Pass");
		}
		else {
			System.out.println("current url fail");
		}
		
//		browUtil.quitBrowser();
		
		browUtil.closeBrowser();

	}

}
