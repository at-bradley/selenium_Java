package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class PG7 {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "http://demo.guru99.com/test/newtours/";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		
		mouseOverHome.perform();
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		
		Thread.sleep(5000);
		driver.close();
	}
}