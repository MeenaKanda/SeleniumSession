package SeleniumHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class3BrowserUtility {

	private WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("Browser Name is : " + browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("please pass right browser name...." + browserName);
			break;
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		return driver;
	}

	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("null url");
		} else if (url.indexOf("http") == 0) {
			driver.get(url);
		}
	}

	public String getpageTitle() {
		String pageTitle = driver.getTitle();
		System.out.println("page title : " + pageTitle);
		return pageTitle;
	}

	public String getPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current page Url : " + currentUrl);
		return currentUrl;
	}

	public void closeBrowser() {
		if (driver == null) {
			System.out.println("null browser");
		} else {
			driver.close();
		}
	}

	public void quitBrowser() {
		if (driver == null) {
			System.out.println("null browser");
		} else {
			driver.quit();
		}
	}

}
