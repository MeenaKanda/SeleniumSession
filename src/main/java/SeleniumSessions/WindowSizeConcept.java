package SeleniumSessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSizeConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		;
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().setSize(new Dimension(1000,800));
		
		driver.get("https://www.google.com");
	}

	
}
