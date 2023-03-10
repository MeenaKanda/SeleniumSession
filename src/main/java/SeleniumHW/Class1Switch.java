package SeleniumHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1Switch {

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
			System.out.println("plz pass valid broswer.....");
			break;
		}
		
		
		
		driver.get("http://www.google.com");
		
		String actTitle = driver.getTitle();
		System.out.println("page title : " + actTitle);
		
		if(actTitle.equalsIgnoreCase("google")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
//		driver.close();
//		driver.quit();
		
		
		
	}

}
