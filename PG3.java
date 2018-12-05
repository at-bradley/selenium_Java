package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG3 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.popuptest.com/popuptest2.html");
		Thread.sleep(5000);
		driver.quit();
		/*
		 * driver.close();
		 */
		
	}
}
