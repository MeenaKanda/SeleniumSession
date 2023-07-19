package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class NavigationConcepts {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
//		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());

//		driver.navigate().to("https://www.amazon.com/");   // here it takes direct string
		driver.navigate().to(new URL("https://www.amazon.com/")); // it take URL type of string
//		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());

		driver.navigate().back(); // come back to google
		System.out.println(driver.getTitle());

		driver.navigate().forward(); // go to amazon again
		System.out.println(driver.getTitle());

		driver.navigate().back(); // come back to google
		System.out.println(driver.getTitle());

		driver.navigate().refresh(); // used to refresh the page

	}

}
