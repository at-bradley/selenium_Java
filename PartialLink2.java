package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink2 {
	public static void main(String[] args) {

		String baseURL = "http://demo.guru99.com/test/block.html";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		driver.findElement(By.partialLinkText("Inside")).click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Outside")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}