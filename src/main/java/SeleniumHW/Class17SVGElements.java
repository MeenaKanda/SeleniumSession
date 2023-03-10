package SeleniumHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class17SVGElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
		
		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		
		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		System.out.println("US state count : " + statesList.size());
		
		int count = 1;
		for(WebElement e : statesList) {
			String stateName = e.getAttribute("name");
			System.out.println(count +"  :::  "+ stateName);
			
			if(stateName.equals("Maryland")) {
				e.click();
				break;
			}
			count++;
		}
		
		System.out.println("******************************");
 
//		String marylandSVGxpath = "//*[name()='g' and @id='maryland']//*[name()='path']";
		String marylandSVGxpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='maryland']//*[name()='path']";
		
		List<WebElement> marylandLists = driver.findElements(By.xpath(marylandSVGxpath));
		System.out.println("MaryLand state size : " + marylandLists.size());
		
		int count1 = 1;
		for(WebElement e : marylandLists) {
			String marylandName = e.getAttribute("name");
			if(!marylandName.equals("Maryland")) {
			System.out.println(count1 + " ::: " + marylandName);
			count1++;
			}
	
		}
		
		
		
	}

}
