package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG9 {
	
	public static void main(String[] args) {
		String baseURL = "http://demo.guru99.com/test/upload/";
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		
		uploadElement.sendKeys("$PATH");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
	}
}