package SeleniumHW;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class16MultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {

		// open the new window one at a time.

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		// 1.linkedin
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindow = it.next();
		System.out.println("parent window id : " + parentWindow);

		String childWindow = it.next();
		System.out.println("child window id : " + childWindow);

		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());

		// 2.facebook
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

		Set<String> handles1 = driver.getWindowHandles();
		Iterator<String> it1 = handles1.iterator();

		String parentWindow1 = it1.next();
		System.out.println("parent window id : " + parentWindow1);

		String childWindow1 = it1.next();
		System.out.println("child window id : " + childWindow1);

		driver.switchTo().window(childWindow1);
		System.out.println(driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindow1);
		System.out.println(driver.getCurrentUrl());

		// 3.twitter
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();

		String parentWindow2 = it2.next();
		System.out.println("parent window id : " + parentWindow2);

		String childWindow2 = it2.next();
		System.out.println("child window id : " + childWindow2);

		driver.switchTo().window(childWindow2);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindow2);
		System.out.println(driver.getCurrentUrl());

		// 4. youtube
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		Set<String> handles3 = driver.getWindowHandles();
		Iterator<String> it3 = handles3.iterator();

		String parentWindow3 = it3.next();
		System.out.println("parent window id : " + parentWindow3);

		String childWindow3 = it3.next();
		System.out.println("child window id : " + childWindow3);

		driver.switchTo().window(childWindow3);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindow3);
		System.out.println(driver.getCurrentUrl());

	}

}
