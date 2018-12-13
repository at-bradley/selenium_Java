package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {
	public static void main(String[] args) {
		String baseURL = "http://demo.guru99.com/test/newtours/";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		String theLinkText = driver.findElement(By.partialLinkText("egis"))
				.getText();
		System.out.println(theLinkText);
		
		theLinkText = driver.findElement(By.partialLinkText("EGIS"))
				.getText();
		System.out.println(theLinkText);
		
		driver.quit();
	}
}