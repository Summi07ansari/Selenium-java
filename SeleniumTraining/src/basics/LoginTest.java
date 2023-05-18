package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Navigate to Url
		driver.get("https://demowebshop.tricentis.com/");
		 //Click on Login link
		driver.findElement(By.linkText("Log in")).click();
		
		//enter valid credential
		driver.findElement(By.id("Email")).sendKeys("summi07@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("summi");
		
		//click on login button 

	}

}
