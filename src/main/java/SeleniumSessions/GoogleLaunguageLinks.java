package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		List<WebElement> langLinks = driver.findElements(By.xpath(null));

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// m1 - click on a specific language link
	public static void clickOnSpecificLangLink(By locator, String specficLang) {
		List<WebElement> langLinks = getElements(locator);
		for (WebElement e : langLinks) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("specificLang"))
				;
			{
				e.click();
				break;
			}
		}
	}

	// m2 - return the list of lang links
	public static List<String> returnListOfLangLinks(By locator, String specificLang) {
		List<String> langList = new ArrayList<String>();
		List<WebElement> langLinks = getElements(locator);
		for (WebElement e : langLinks) {
			String text = e.getText();
			langList.add(text);
		}
		return langList;
	}

}
