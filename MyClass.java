package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
		
		driver.findElement(By.name("q")).sendKeys("Obama");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("btnK")).click();
		driver.close();
	    }
}