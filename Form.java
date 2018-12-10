package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/login.html";
		
		driver.get(baseUrl);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("passwd"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		System.out.println("Text Field Set");
		
		email.clear();
		password.clear();
		System.out.println("Text Field Cleared");
		
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		login.click();
		System.out.println("Login Done With Click");
		
		driver.get(baseUrl);
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
		driver.findElement(By.id("SubmitLogin")).submit();
		System.out.println("Login Done with Submit");
		
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		radio1.click();
		System.out.println("Radio Button Option 1 Selected");
		
		radio2.click();
		System.out.println("Radio Button Option 2 Selected");
	
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		
		option1.click();
		
		if(option1.isSelected()) {
			System.out.println("Checkbox is Toggled On");
		} else {
			System.out.println("Checkbox is Toggled Off");
		}
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		
		for(int i = 0; i < 2; i++) {
			chkFBPersist.click();
			System.out.println("Facebook Persists Checkbox Status is - " 
			+ chkFBPersist.isSelected());
		}
	}
}