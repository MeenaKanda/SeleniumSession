 package SeleniumHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1amazon {

	public static void main(String[] args) {
	
		String browser = "edge";
		WebDriver driver = null;

		switch (browser) {
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
			System.out.println("please pass correct browser......");
			break;
		}
		
		 
		driver.get("http://www.amazon.com");
//		driver.get("http://www.facebook.com");
//		driver.get("http://www.kohls.com");
		
		String actTitle = driver.getTitle();
		System.out.println("title of page : " + actTitle);
		
		if(actTitle.contains("Kohl's")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
//		driver.quit();
		
	
		
		
		
	}

}
