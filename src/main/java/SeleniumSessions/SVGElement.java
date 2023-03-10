package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement {

	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(3000);
		            
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
	
        String svgXpath =  " //*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		
		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
	
		System.out.println(statesList.size());
		
		Actions act = new Actions(driver);
	
	    for(WebElement e : statesList) {
	    	String stateName = e.getAttribute("name");
	    	System.out.println(stateName);
	    	
	    	if(stateName.equals("Florida")) {
	//    		Thread.sleep(3000);
	    		
	    		int x = e.getSize().getWidth();
	    		int y = e.getSize().getHeight();
	    		System.out.println(x + " : " + y);
	    		
	    		act.moveToElement(e, (3*x)/4 , 0).click().build().perform();
	    		
	    		
	//    		e.click();
	    		break;
	    	}
	    }
	}

}

//SVG--> normal xpath will not support
// for svg element we have to use local-name() for parent and after that use name() only in xpath

//how to find svg elements on the page?
//ans: //*[local-name()='svg']   --> local name only for svg not for other element


//  //a[normalize-space='login']  --> normalize space trim the space in html("  login  " ) and take normal word("login")