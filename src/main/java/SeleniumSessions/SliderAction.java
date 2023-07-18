package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");

		WebElement slider = driver.findElement(By.id("slider"));

//		slider.click(); // by default it click middle of the element

		int width = slider.getSize().getWidth();
		System.out.println(width);

		Actions act = new Actions(driver);
        act.moveToElement(slider, (width/2)-100, 0).click().build().perform();   //+ve x so move right direction
//		act.moveToElement(slider, -((width / 2) - 100), 0).click().build().perform(); // -ve x so move left direction

//		act.clickAndHold(slider).moveByOffset( (width/2)-100, 0).build().perform();  // this one also work. holding it and draging it 
		
	}

}

//ele.click() -> whenever you perform click action , it always click middle of the element.
//width and height of an element calculated by pixel

//before 3.4x -> selenium click corner of an element(0,0 position)
//after 3.4x -> click middle of an element(element start 0 to 100 --> middle is 50(where it click)
//middle is    -50  0  +50


//Scrolling -> both horizontal and vertical scrolling is not an webelement.
//so this one don't work for scrolling ,only work for slider(which is webelement).