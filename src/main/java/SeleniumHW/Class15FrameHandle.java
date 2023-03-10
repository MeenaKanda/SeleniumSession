package SeleniumHW;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class15FrameHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		System.out.println(driver.findElement(By.tagName("h2")).getText());

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='navbar.html']")));

		List<WebElement> sideBarList = driver.findElements(By.xpath("//body[@background='navbar.gif']/p/a"));

		List<String> list = new ArrayList<String>();
		for (WebElement e : sideBarList) {
			String text = e.getText();
			System.out.println(text);
			list.add(text);
		}
		System.out.println(list);
		
	//	driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		System.out.println("*******************************");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='home.html']")));
		
		List<WebElement> bodyList = driver.findElements(By.xpath("//html/body/p"));
		
		int count = 1;
		List<String> list1 = new ArrayList<String>();
		for (WebElement e : bodyList) {
			String text = e.getText();
			System.out.println(count + "  ::::::::::: " + text);
			list1.add(text);
			count++;
		}
		System.out.println(list1);
		
	//	driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		System.out.println("*******************************");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='bot.html']")));
		
		WebElement footer =  driver.findElement(By.xpath("//body[@background='bot.gif']/h2"));
		System.out.println(footer.getText());
		
		

	}

}
