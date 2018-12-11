package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		String baseURL = "http://demo.guru99.com/test/link.html";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		driver.findElement(By.partialLinkText("here")).click();
		
		System.out.println("Title of page is: " + driver.getTitle());
		
		driver.quit();
	}
}