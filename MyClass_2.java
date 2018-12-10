package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		String alertMessage = "";
		
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertMessage);
		Thread.sleep(4000);
		driver.quit();
	}
}