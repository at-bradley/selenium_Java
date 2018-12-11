package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass_3 {

	public static void main(String[] args) {
		String baseURL = "http://demo.guru99.com/test/link.html";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		driver.findElement(By.linkText("click here")).click();
		
		System.out.println("title of page is: " + driver.getTitle());
		
		driver.quit();
	}
}