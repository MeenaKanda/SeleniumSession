package SeleniumHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8DropDownWithNoSelect {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		By country = By.xpath("//select/option");
		
		List<WebElement> countryList = driver.findElements(country);
		System.out.println(countryList.size());
		
		for(WebElement e : countryList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("India")) {
				e.click();
				break;
			}
			
		}
		
		

	}

}
