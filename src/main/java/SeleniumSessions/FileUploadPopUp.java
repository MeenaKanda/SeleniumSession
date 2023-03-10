package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Program Files\\Java");
		// this only work only when type=file on html. tag could be anything
		//<tag type="file"> -- this is mandatory attribute
		// if type is not file ,//autoIt/Sikuli/Robot -- not at all recommended
		//sikuli is image based and autoIt is only for window and 
		//Robot only applicable for window machine not for mac,linex and other system don't support. Robot will not work for headless also
		// if type="file" not available ask your developer to change to type.because always go and check
		//type=file or not
		
		
	}

}
