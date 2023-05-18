package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) {
		// Launch Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigate to Url
		driver.get("https://demowebshop.tricentis.com/");
		// Click on Login link
		driver.findElement(By.linkText("Register")).click();

		// click on Gender
		driver.findElement(By.id("gender-female")).click();

		// enter first name
		driver.findElement(By.id("FirstName")).sendKeys("Sumaiya");

		// enter last name
		driver.findElement(By.id("LastName")).sendKeys("Ansari");

		// enter email
		driver.findElement(By.id("Email")).sendKeys("summi@gmail.com");

		// enter pasword

		driver.findElement(By.id("Password")).sendKeys("summianzar28");
		// confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys("summianzar28");

		// click on register
		driver.findElement(By.id("register-button")).click();

		

	}

}
