package LearningTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningParallelExecution {

	@Test (invocationCount=4, threadPoolSize =4 )//enabled =true, alwaysRun=true
	public void loginTest() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	
		String username = "Sumaiyakansari@gmail.com";
		String password = "summianzar28";
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		if (driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(username)) {
			System.out.println("PASSED user is successfully logged in");
		} else {
			System.out.println("FAILED user is not successfully logged in");
		}
		driver.quit();
	}


}
