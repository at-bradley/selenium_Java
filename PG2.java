package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com";
		String tagName = "";
		
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		
		Thread.sleep(Long.MAX_VALUE);
		driver.close();
		System.exit(0);
	}
}
